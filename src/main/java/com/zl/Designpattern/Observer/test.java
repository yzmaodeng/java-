package com.zl.Designpattern.Observer;

public class test {

	public static void main(String[] args) {

		政府 zf=new 政府();
		
		市场反应 scfy=new 市场反应(zf);
		zf.set出政策("孙宏斌", "肯德基","我");
	}

}
