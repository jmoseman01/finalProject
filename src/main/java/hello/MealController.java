package hello;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ood.builder.meal.Meal;
import com.ood.builder.meal.MealBuilder;
import com.ood.builder.meal.burger.Burger;
import com.ood.builder.meal.drink.ColdDrink;
import com.ood.interfaces.Item;

@Controller
public class MealController {

    @RequestMapping("/meal")
    public String greeting(@RequestParam(value="mealType", required=false) String mealType, Model model) {
	    MealBuilder mealBuilder = new MealBuilder();
	    Meal meal;
	    if(mealType.equals("veg")) 
	    {
	    	meal=mealBuilder.prepareVegMeal();
	    }
	    else 
	    {
	    	meal = mealBuilder.prepareNonVegMeal();
	    }
	    ArrayList<Item> items = meal.getItems();
	    Item burger =  items.get(0);
	    Item drink = items.get(1);

	    model.addAttribute("drinkName", drink.name());
	    model.addAttribute("drinkPrice", drink.price());
	    model.addAttribute("burgerName", burger.name());
	    model.addAttribute("burgerPrice", burger.price());
	    model.addAttribute("totalCost", meal.getCost());
        return "meal";
    }

}
