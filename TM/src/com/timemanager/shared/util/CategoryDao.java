package com.timemanager.shared.util;

import java.util.List;

import com.timemanager.shared.CategoryDTO;

public interface CategoryDao {
	public void insert(CategoryDTO dto);
	public int delete(long id);
	public CategoryDTO findById(long id);
	public List<CategoryDTO> findAll(long user_id);
}
