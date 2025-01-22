package com.example.goods.controller;

import com.example.goods.dto.GoodsDto;
import com.example.goods.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * packageName    : com.example.demo.controller
 * fileName       : UserRestController
 * author         : doong2s
 * date           : 2025. 1. 12.
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2025. 1. 12.        doong2s       최초 생성
 */
@RestController
@RequestMapping("/api/v1/goods")
public class GoodsRestController {

    @Autowired
    private GoodsService goodsService;

    @GetMapping("/{goodsNo}")
    public ResponseEntity<GoodsDto> getGoods(@PathVariable String goodsNo) {

        var goodsDto = goodsService.getGoodsByGoodsNo(goodsNo);

        return ResponseEntity
                .ok()
                .body(goodsDto);
    }
}
