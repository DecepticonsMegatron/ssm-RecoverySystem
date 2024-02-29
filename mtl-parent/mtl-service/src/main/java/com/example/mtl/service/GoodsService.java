package com.example.mtl.service;

import com.example.mtl.beans.Goods;
import mtl.utils.PageInfo;

/**
 * @Description
 * @Author 千锋涛哥
 * 公众号： Java架构栈
 */
public interface GoodsService {

    public PageInfo<Goods> listGoodsByBrandId(int brandId, int pageNum);

    public Goods getGoodsById(int goodsId);

}
