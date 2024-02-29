package com.example.mtl.dao;

import com.example.mtl.beans.Category;

import java.util.List;

public interface CategoryDAO {
    public List<Category> selectCategories();
}
