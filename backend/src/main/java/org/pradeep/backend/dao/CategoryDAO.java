package org.pradeep.backend.dao;

import java.util.List;

import org.pradeep.backend.dto.Category;

public interface CategoryDAO
{
	List<Category> list();
	Category get(int id);
}
