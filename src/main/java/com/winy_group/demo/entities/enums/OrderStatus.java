package com.winy_group.demo.entities.enums;

public enum OrderStatus {

    WAITING_PAYMENT(1),
    PAID(2),
    SHIPPED(3),
    DELIVERED(4),
    CANCELED(5);

    private int code;

    private OrderStatus(int code) {

        this.code = code;
    };

    public int getCode() {
        return code;
    }

    public static OrderStatus valueOf(int code) {
        for (OrderStatus values : OrderStatus.values()) {
            if (values.getCode() == code) {
                return values;
            }
        }
        throw new IllegalArgumentException("Invalid OrderStatus coede");
    }
}
