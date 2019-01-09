package net.nabil.shoppingbackend.dao;

import java.util.List;

import net.nabil.shoppingbackend.dto.Category;

public interface CategoryDAO {
	List<Category> list();
	Category get(int id);
}
