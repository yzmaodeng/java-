package com.zl.Designpattern.Factory.simple;

import com.zl.Designpattern.Factory.Product;

public class ProductFactory {
	
	public   static <T extends Product> T createProduct(Class<T> c){
        Product product=null;
        try {
               product = (Product)Class.forName(c.getName()).newInstance();
        } catch (Exception e) {
               //异常处理
        }
        return (T)product;         
}
	

}
