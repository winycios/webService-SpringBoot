package com.winy_group.demo.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.winy_group.demo.entities.Order;
import com.winy_group.demo.entities.User;
import com.winy_group.demo.entities.enums.OrderStatus;
import com.winy_group.demo.repositories.OrderRepository;
import com.winy_group.demo.repositories.UserRepository;

@Configuration
// Essa profile faz com que o JPA entenda que essa classe se trata de um perfil
// teste. Isso foi definido na application.properties

@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private OrderRepository orderRepository;

    @Override
    public void run(String... args) throws Exception {

        User u1 = new User(null, "Maria Brown", "maria@gmail.com", "988888888", "123456");
        User u2 = new User(null, "Alex Green", "alex@gmail.com", "977777777", "123456");

        userRepository.saveAll(Arrays.asList(u1, u2));

        Order o1 = new Order(null, Instant.parse("2019-06-20T19:53:07Z"), OrderStatus.PAID, u1);
        Order o2 = new Order(null, Instant.parse("2019-07-21T03:42:10Z"), OrderStatus.SHIPPED,u2);
        Order o3 = new Order(null, Instant.parse("2019-07-22T15:21:22Z"), OrderStatus.PAID,u1);

        orderRepository.saveAll(Arrays.asList(o1, o2, o3));

    }
}