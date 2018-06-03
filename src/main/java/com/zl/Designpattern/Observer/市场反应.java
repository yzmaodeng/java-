package com.zl.Designpattern.Observer;

import java.util.Observable;
import java.util.Observer;

public class 市场反应 implements Observer {
	private Observable observable;
	private String 开发商;

	private String 炒房客;

	private String 购房者;

	public 市场反应(Observable observable) {
		this.observable = observable;
		this.observable.addObserver(this);
	}

	@Override
	public void update(Observable observable, Object arg) {
		if (observable instanceof 政府) {
			政府 zf = (政府) observable;
			this.开发商 = zf.get开发商();
			this.炒房客 = zf.get炒房客();
			this.购房者 = zf.get购房者();
			display();
		}

	}

	public void display() {
		System.out.println(this.开发商 + "又要发财了");
		System.out.println(this.炒房客 + "又可以发财了");
		System.out.println(this.购房者 + "现在是不是接盘侠呢");
	}

}
