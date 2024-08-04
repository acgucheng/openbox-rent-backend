package me.brimon.rent.shop.repository;

import me.brimon.rent.shop.entity.Shop;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ShopRepository extends JpaRepository<Shop, Integer> {
    public Shop save(Shop shop);
    public Optional<Shop> findById(Integer id);
}
