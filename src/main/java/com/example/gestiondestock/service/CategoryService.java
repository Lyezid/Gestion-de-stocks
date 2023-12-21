package com.example.gestiondestock.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.gestiondestock.entity.Category;
import com.example.gestiondestock.entity.Produit;
import com.example.gestiondestock.repository.CategoryRepository;

@Service
public class CategoryService {
    @Autowired
    private CategoryRepository categoryRepository;

        public List<Category> findAllCategory(){
        return categoryRepository.findAll();
        }

    public Optional<Category> findcategory(Long categoryId){
        return categoryRepository.findById(categoryId);
    }

    public Category createCategory(Category category){
        return categoryRepository.save(category);
    }
    
    public void deleteCategory(Long categoryId){
        categoryRepository.deleteById(categoryId);
    }

    public Optional<Category> updateCategory(Long categoryId, Category updateCategory){
        return categoryRepository.findById(categoryId).map(
                                        categ -> {
                                           categ.setNomCategory(updateCategory.getNomCategory());

                                            return categoryRepository.save(categ);
                                        }
                                        );
    }
    
}