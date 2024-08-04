package me.brimon.rent.shop.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.ZonedDateTime;

@Entity
@Data
@Table(name = "shop")
public class Shop {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Id;

    private String name;
    private String address;
    private String phone;
    private String email;
    private String description;
    private String status;

    private ZonedDateTime createdAt;

    @Column(name = "updated_at")
    private ZonedDateTime updatedAt;

    @PrePersist
    public void beforePersist() {
        System.out.println("PrePersist is using");
        createdAt = ZonedDateTime.now();
        updatedAt = ZonedDateTime.now();
    }

    @PreUpdate
    public void beforeUpdate() {
        updatedAt = ZonedDateTime.now();
    }

    public static Shop createShop(Shop shopInformation) {
        shopInformation.setStatus("ACTIVE");
        shopInformation.updatedAt = ZonedDateTime.now();
        System.out.println("Now:" + ZonedDateTime.now());
        return shopInformation;
    }


}
