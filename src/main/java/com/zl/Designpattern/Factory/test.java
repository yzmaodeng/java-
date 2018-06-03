package com.zl.Designpattern.Factory;

import com.zl.Designpattern.Factory.simple.ProductFactory;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Apple createProduct = ProductFactory.createProduct(Apple.class);
		createProduct.print();

	}

}
