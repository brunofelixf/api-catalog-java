package com.devsuperior.catalog.services;

import com.devsuperior.catalog.entities.Category;
import com.devsuperior.catalog.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository repository;
    public List<Category> findAll(){
        return  repository.findAll();
    }
}