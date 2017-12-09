package com.ood.builder.packing;

import com.ood.interfaces.Packing;

public class Wrapper implements Packing {

	@Override
	public String pack() {
		return "pack wrapper";
	}

	@Override
	public String toString()
	{
		return "Wrapper";
	}

}
