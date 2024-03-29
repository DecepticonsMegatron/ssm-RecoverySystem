package com.example.mtl.service.impl;

import com.example.mtl.beans.Goods;
import com.example.mtl.dao.GoodsDAO;
import com.example.mtl.dao.InfoDetailDAO;
import com.example.mtl.service.PriceCountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description
 * @Author 千锋涛哥
 * 公众号： Java架构栈
 */
@Service
public class PriceCountServiceImpl implements PriceCountService {
    @Autowired
    private GoodsDAO goodsDAO;
    @Autowired
    private InfoDetailDAO infoDetailDAO;


    public int countPrice(int goodsId, String ids) {

        Goods goods = goodsDAO.selectGoodsById(goodsId);
        int price1 = infoDetailDAO.countPriceInfoDetails(goodsId, ids);
        int price2 = goods.getGoodsCost() - price1;
        int price = price2 < goods.getGoodsMinPrice() ? goods.getGoodsMinPrice() : price2;
        price = price > goods.getGoodsCost() ? goods.getGoodsCost() : price;
        return price;
    }
}
