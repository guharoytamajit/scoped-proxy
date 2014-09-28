package com;

import java.io.Serializable;

public class ShoppingCart implements Serializable {
	private int numItems;

	public ShoppingCart() {
	}

	public int getNumItems() {
		return numItems;
	}

	public void addItem() {
		numItems++;
	}
}
