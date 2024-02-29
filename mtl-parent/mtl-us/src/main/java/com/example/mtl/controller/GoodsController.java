package com.example.mtl.controller;

import com.example.mtl.beans.Goods;
import com.example.mtl.service.GoodsService;
import mtl.utils.PageInfo;
import mtl.vo.ResultVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Description 商品业务的请求处理
 * @Author 千锋涛哥
 * 公众号： Java架构栈
 */
@Controller
@RequestMapping("/goods")
public class GoodsController {

    @Autowired
    private GoodsService goodsService;

    /**
     * 根据品牌ID查询商品信息
     */
    @ResponseBody
    @RequestMapping("/listByBrand")
    public ResultVO list(Integer brandId, @RequestParam(defaultValue = "1") Integer pageNum) {
        PageInfo<Goods> goodsPageInfo = goodsService.listGoodsByBrandId(brandId, pageNum);
        ResultVO vo = new ResultVO(0, "success", goodsPageInfo);
        return vo;
    }
}
