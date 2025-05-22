package org.learning;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity @Data @NoArgsConstructor
@AllArgsConstructor
public class Customer {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    String name;
    String address;
    @OneToMany(mappedBy = "customer")
    List<Orders> orders;

}
