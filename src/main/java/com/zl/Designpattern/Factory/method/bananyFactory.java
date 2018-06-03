package com.zl.Designpattern.Factory.method;

import com.zl.Designpattern.Factory.Banany;
import com.zl.Designpattern.Factory.Product;

public class bananyFactory extends frutFactory {

	@Override
	Product create() {
		return new Banany();
	}

}
