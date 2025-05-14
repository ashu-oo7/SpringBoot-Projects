package org.learning;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity @Data
public class Alien {
    @Id
    Integer id;
    String name;
    String description;
}
