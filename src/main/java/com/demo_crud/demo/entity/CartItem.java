package com.demo_crud.demo.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.UUID;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
@ToString(onlyExplicitlyIncluded = true)
public class CartItem {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @ToString.Include
    String id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "cart_id")
    Cart cart;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "product_id")
    Product product;

    @Column(nullable = false)
    @ToString.Include
    int quantity;

    @Column(nullable = false)
    @ToString.Include
    double totalPrice;
}
