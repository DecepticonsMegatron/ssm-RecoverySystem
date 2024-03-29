package com.example.mtl.service.impl;

import com.example.mtl.beans.BasicInfo;
import com.example.mtl.dao.BasicInfoDAO;
import com.example.mtl.service.BasicInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description
 * @Author 千锋涛哥
 * 公众号： Java架构栈
 */
@Service
public class BasicInfoServiceImpl implements BasicInfoService {

    @Autowired
    private BasicInfoDAO basicInfoDAO;

    public List<BasicInfo> listInfoByGoodsId(int goodsId, int step) {
        List<BasicInfo> basicInfoList = basicInfoDAO.selectBasicInfosByGoodsId(goodsId, step);
        return basicInfoList;
    }

    public List<BasicInfo> listInfoDetailByIds(String ids) {
        List<BasicInfo> basicInfoList = basicInfoDAO.selectInfoDetailsByIds(ids);
        return basicInfoList;
    }
}
