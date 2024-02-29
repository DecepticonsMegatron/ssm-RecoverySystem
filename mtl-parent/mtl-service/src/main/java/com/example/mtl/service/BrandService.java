package com.example.mtl.service;

import com.example.mtl.beans.Brand;

import java.util.List;

/**
 * @Description
 * @Author 千锋涛哥
 * 公众号： Java架构栈
 */
public interface BrandService {

    public List<Brand> listBrandsByCategoryId(int categoryId);

}
