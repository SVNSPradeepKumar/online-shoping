package org.pradeep.backend.daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.pradeep.backend.dao.CategoryDAO;
import org.pradeep.backend.dto.Category;
import org.springframework.stereotype.Repository;

@Repository("categoryDAO")
public class CategoryDAOImpl implements CategoryDAO
{
	private static List<Category> categories = new ArrayList<>();

	static
	{
		Category category = new Category();
		category.setId(1);
		category.setName("Telivision");
		category.setDescription("Description about telivision");
		category.setImageURL("Imagae");

		categories.add(category);

		category = new Category();
		category.setId(2);
		category.setName("Mobile");
		category.setDescription("Description about mobile");
		category.setImageURL("Imagae2");

		categories.add(category);

		category = new Category();
		category.setId(3);
		category.setName("Laptop");
		category.setDescription("Description about laptop");
		category.setImageURL("Imagae3");

		categories.add(category);

	}

	@Override
	public List<Category> list()
	{
		return categories;
	}

	@Override
	public Category get(int id) 
	{
		//enhanced for loop for each category in each categories
		for(Category category:categories)
		{
			if(category.getId()==id)
			{
				return category;
			}
		}
		return null;
	}
}
