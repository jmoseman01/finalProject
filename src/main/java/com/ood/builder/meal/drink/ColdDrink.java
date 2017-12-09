package com.ood.builder.meal.drink;

import com.ood.builder.packing.Bottle;
import com.ood.interfaces.Item;
import com.ood.interfaces.Packing;

public abstract class ColdDrink implements Item {

	@Override
	public Packing packing() {
		// TODO Auto-generated method stub
		return new Bottle();
	}

	public abstract float price();

}
