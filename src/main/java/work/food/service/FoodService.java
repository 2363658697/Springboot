package work.food.service;


import work.food.entity.Food;
import work.food.entity.FoodExample;
import work.food.utils.PageTools;

public interface FoodService {
	
	public int getFoodCount(FoodExample example);

	public abstract PageTools queryFoodByFoodName(String foodName,Integer page,Integer rows);
	
	
	public abstract void saveFood(Food food);

	public abstract void updateFood(Food food);
	
	public abstract void deleteFood(String foodId);
}