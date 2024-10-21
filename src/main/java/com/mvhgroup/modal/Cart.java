package com.mvhgroup.modal;
import java.util.*;

import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class Cart {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @OneToOne
    private User user;
    private Set <CartItem> cartItems =new HashSet<>();
    private double totalSellingPrice;
    private int totalMrpPrice;
    private double totalItem;
    private int discount;

    private String couponCode;

}