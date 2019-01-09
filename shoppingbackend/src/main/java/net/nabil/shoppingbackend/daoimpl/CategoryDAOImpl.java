package net.nabil.shoppingbackend.daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import net.nabil.shoppingbackend.dao.CategoryDAO;
import net.nabil.shoppingbackend.dto.Category;

@Repository("categoryDAO")
public class CategoryDAOImpl implements CategoryDAO {
	private static List<Category> Categories = new ArrayList<>();
	static {
		Category category = new Category();
		category.setId(1);
		category.setName("television");
		category.setDescription("this is description for tv");
		category.setImageURL("cat1.png");
		Categories.add(category);
		
		category = new Category();
		category.setId(2);
		category.setName("Mobile");
		category.setDescription("this is description for mobile");
		category.setImageURL("cat2.png");
		Categories.add(category);
		
		category = new Category();
		category.setId(3);
		category.setName("Laptop");
		category.setDescription("this is description for Laptop");
		category.setImageURL("cat3.png");
		Categories.add(category);
		
		
	}
	@Override
	public List<Category> list() {
		// TODO Auto-generated method stub
		return Categories;
	}
	
	@Override
	public Category get(int id) {
		for(Category category : Categories) {
			if(category.getId() == id)
				return category;
		}
		return null;
	}

}
