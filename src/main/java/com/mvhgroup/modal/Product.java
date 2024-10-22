package com.mvhgroup.modal;
import java.util.*;

import jakarta.persistence.*;
import jdk.jfr.Category;
import lombok.*;

import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode

public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String title ;
    private String description ;
    private int mrpPrice;
    private int sellingPrice;
    private int discountPrice;
    private int quantity;
    private String color;


    @ElementCollection
    private List<String> images =new ArrayList<>();
    private int numRatings;

    @ManyToOne
    private Category category;

    @ManyToOne
    private Seller seller;




}
