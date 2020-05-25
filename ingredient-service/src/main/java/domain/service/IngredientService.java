package domain.service;

import java.util.List;
import java.util.ArrayList;
import java.util.Collection;

import domain.model.Ingredient;
import domain.model.IngredientDTO;

public interface IngredientService {
	
	List<Ingredient> getAll();
	List<IngredientDTO> getAllNames();
	List<IngredientDTO> getSelectedIngredients(List<Long> IngredientID);
	Ingredient get(Long ingredientId);
	void create(Ingredient ingredient);
	//int computeCalories(Array<int IngredientID>);  
	// use instead : https://www.w3schools.com/java/java_arrays.asp
	double computeCalories(List<Long> IngredientID);
	double computeFat(List<Long> IngredientID);
	double computeCholesterol(List<Long> IngredientID);
	double computeProteins(List<Long> IngredientID);
	double computeSalt(List<Long> IngredientID);
	// OR :
	//int computeCalories(int[] IngredientID);
	// ------
	//Array<(int ingredientId, String name)> getPossibleIngredients(String enter)
	List<Object> getPossibleIngredients(String possibleIngredient); // UNUSED
	// OR
	// Object[] getPossibleIngredients(String enter);
	// https://docs.oracle.com/javase/specs/jls/se7/html/jls-10.html
	//https://stackoverflow.com/questions/16363547/how-to-declare-an-array-of-different-data-types
	Long count();
}
