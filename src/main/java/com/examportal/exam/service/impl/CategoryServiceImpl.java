package com.examportal.exam.service.impl;

import java.util.LinkedHashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examportal.exam.models.exam.Category;
import com.examportal.exam.repo.CategoryRepository;
import com.examportal.exam.service.CategoryService;

@Service
public class CategoryServiceImpl implements CategoryService {
	
	@Autowired
	private CategoryRepository categoryrepo;

	@Override
	public Category addCategory(Category category) {
		// TODO Auto-generated method stub
		return this.categoryrepo.save(category);
	}

	@Override
	public Category updateCategory(Category category) {
		// TODO Auto-generated method stub
		return this.categoryrepo.save(category);
	}

	@Override
	public Set<Category> getCategories() {
		// TODO Auto-generated method stub
		return new LinkedHashSet<>(this.categoryrepo.findAll());
	}

	@Override
	public Category getCategory(Long categoryId) {
		// TODO Auto-generated method stub
		return this.categoryrepo.findById(categoryId).get();
				
	}

	@Override
	public void deleteCategory(Long categoryId) {
		// TODO Auto-generated method stub
		Category cat= new Category();
		cat.setCid(categoryId);
		this.categoryrepo.delete(cat); 
		
	}
	
	

}
