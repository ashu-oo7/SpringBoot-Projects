package org.learning;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity @Data @NoArgsConstructor
@AllArgsConstructor
public class Orders {
    @Id @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
    @Column(name="order_name")
    String name;

    @ManyToOne @JoinColumn(name="customer_id")
    Customer customer;

}
