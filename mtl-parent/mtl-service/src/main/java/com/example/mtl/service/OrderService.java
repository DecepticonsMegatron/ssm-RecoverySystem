package com.example.mtl.service;

import com.example.mtl.beans.Order;


/**
 * @Description
 * @Author 千锋涛哥
 * 公众号： Java架构栈
 */
public interface OrderService {

    public String addOrder(Order order, int goodsId, String ids);

}
