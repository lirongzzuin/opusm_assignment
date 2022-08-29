package com.opusm_assignment.dto.requestDto;

import com.opusm_assignment.model.ShoppingBag;
import lombok.Getter;

import java.util.List;

@Getter
public class OrderRequestDto {
    private Long brandId;
    private List<ShoppingBag> products;
}
