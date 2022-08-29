package com.opusm_assignment.dto.responseDto;

import com.opusm_assignment.model.Order;
import lombok.Getter;

import java.util.List;

@Getter
public class OrderResponseDto {
    private String brandName;
    private List<ProductsResponseDto> products;
    private int totalPrice;

    public OrderResponseDto(Order order, List<ProductsResponseDto> products) {
        this.brandName = order.getBrandName();
        this.products = products;
        this.totalPrice = order.getTotalPrice();
    }
}
