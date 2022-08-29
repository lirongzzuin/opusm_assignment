package com.opusm_assignment.dto.responseDto;

import com.opusm_assignment.model.ShoppingBag;
import lombok.Getter;

@Getter
public class ProductsResponseDto {
    private String name;
    private int quantity;
    private int price;

    public ProductsResponseDto(ShoppingBag shoppingBag) {
        this.name = shoppingBag.getName();
        this.quantity = shoppingBag.getQuantity();
        this.price = shoppingBag.getPrice();
    }
}
