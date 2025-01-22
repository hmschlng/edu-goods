package com.example.goods.service;

import com.example.goods.dto.GoodsDto;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * packageName    : com.example.demo.service
 * fileName       : UserService
 * author         : doong2s
 * date           : 2025. 1. 12.
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2025. 1. 12.        doong2s       최초 생성
 */
@Service
public class GoodsService {

    @Value("${app.run.type}")
    private String appRunType;

    public GoodsDto getGoodsByGoodsNo(String goodsNo) {

        return GoodsDto.builder()
                .goodsNo(goodsNo)
                .goodsName("goods-" + appRunType + "-" + goodsNo)
                .build();
    }
}
