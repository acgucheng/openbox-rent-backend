package me.brimon.rent.shop.controller;

import me.brimon.rent.shop.ShopService;
import me.brimon.rent.shop.entity.Shop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@Controller
@RequestMapping("/shop")
public class ShopController {

    @Autowired
    private ShopService shopService;

    @PostMapping
    public Shop createShop(@RequestBody Shop shop) {
        return shopService.createShop(shop);
    }

    @GetMapping
    public List<Shop> findShop(@RequestParam Integer id) {
        if(id != null){
            return shopService.findById(id)
                    .map(List::of)
                    .orElseGet(ArrayList::new);
        }
        else{
            return shopService.findAll();
        }
    }
}
