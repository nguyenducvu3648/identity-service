package com.demo_crud.demo.dto.response.Order;

import lombok.*;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class OrderItemResponse {
    private String id;
    private String productId;
    private String productName;
    private int quantity;
    private double price;
    private double totalPrice;
}