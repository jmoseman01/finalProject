package com.ood.builder.meal.burger;

import com.ood.builder.packing.Wrapper;
import com.ood.interfaces.Item;
import com.ood.interfaces.Packing;

public abstract class Burger implements Item {

	@Override
	public Packing packing() {
		return new Wrapper();
	}

	@Override
	public abstract float price();
}
