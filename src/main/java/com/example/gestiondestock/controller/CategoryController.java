package com.example.gestiondestock.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.gestiondestock.entity.Category;
import com.example.gestiondestock.entity.Produit;
import com.example.gestiondestock.service.CategoryService;

@RestController
@RequestMapping

public class CategoryController {
    @Autowired
    private CategoryService categoryService;

    @GetMapping("/all_categories")
    public ResponseEntity<List<Category>> getAllCategories() {
        return ResponseEntity.status(HttpStatus.OK).body(categoryService.findAllCategory());
    }

    @GetMapping("get_category/{category-id}")
    public ResponseEntity<Optional<Category>> getCategory(@PathVariable("category-id") Long categoryId) {
        return ResponseEntity.status(HttpStatus.OK).body(categoryService.findcategory(categoryId));
    }

    @PostMapping("/add_category")
    public void createCategory(@RequestBody Category category) {
        ResponseEntity.status((HttpStatus.CREATED)).body(categoryService.createCategory(category));
    }

    @DeleteMapping(path = "/delete_category/{category_id}")
    public void deleteProduit(@PathVariable("category_id") Long caytegoryId) {
        categoryService.deleteCategory(caytegoryId);
    }

    @PutMapping("/update_category/{category_id}")
    public ResponseEntity<Optional<Category>> upateCategory(@PathVariable("category_id") Long categoryId,
            @RequestBody Produit updateCategory) {
        return ResponseEntity.status(HttpStatus.OK)
                .body(categoryService.updateCategory(categoryId, null));
    }

}