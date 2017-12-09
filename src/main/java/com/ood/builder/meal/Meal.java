package com.ood.builder.meal;
import java.util.ArrayList;

import com.ood.interfaces.Item;

public class Meal {
	//make item array
	public ArrayList<Item> items = new ArrayList<Item>();

	public void addItem(Item item)
	{
		items.add(item);
	}
	public ArrayList<Item> getItems() 
	{
		return items;
	}
	
	public float getCost()
	{
		float cost=0.0f;
		
		for(Item item: items)
		{
			cost+=item.price();
		}
		return cost;
	}
	/**
	 * show the item name
	 * packing
	 * and price
	 */
	public void showItems() {
		// TODO Auto-generated method stub

		for(Item item: items)
		{
			System.out.printf("Item:  %s\n",item.name());
			System.out.printf("Packing:  %s\n",item.packing());
			System.out.printf("Price:  %f\n\n",item.price());
		}
		
	}

}
