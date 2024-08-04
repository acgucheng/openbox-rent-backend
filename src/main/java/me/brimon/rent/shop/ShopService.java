package me.brimon.rent.shop;

import me.brimon.rent.shop.entity.Shop;
import me.brimon.rent.shop.repository.ShopRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ShopService {

    private ShopRepository shopRepository;

    @Autowired
    public ShopService(ShopRepository shopRepository) {
        this.shopRepository = shopRepository;
    }

    public Shop createShop(Shop shopInformation) {
        Shop shop = Shop.createShop(shopInformation);
        return shopRepository.save(shop);
    }

    public Optional<Shop> findById(Integer id) {
        return shopRepository.findById(id);
    }

    public List<Shop> findAll() {
        return shopRepository.findAll();
    }

}
