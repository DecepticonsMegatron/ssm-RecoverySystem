package com.example.mtl.service.impl;

import com.example.mtl.beans.Category;
import com.example.mtl.dao.CategoryDAO;
import com.example.mtl.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CategoryServiceImpl implements CategoryService {
    @Autowired
    private CategoryDAO categoryDAO;

    public List<Category> listCategories() {
        List<Category> categoryList = categoryDAO.selectCategories();
        return categoryList;
    }
}
