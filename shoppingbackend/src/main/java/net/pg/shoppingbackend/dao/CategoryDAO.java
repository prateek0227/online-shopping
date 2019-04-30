package net.pg.shoppingbackend.dao;

import java.util.List;

import net.pg.shoppingbackend.dto.Category;

public interface CategoryDAO {
	List<Category> list();
	
	Category get(int id);
}
