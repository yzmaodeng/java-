package com.zl.Designpattern.Factory.method;

import com.zl.Designpattern.Factory.Apple;
import com.zl.Designpattern.Factory.Product;

public class AppleFactory extends frutFactory {

	@Override
	Product create() {
		return new Apple();
	}

}
