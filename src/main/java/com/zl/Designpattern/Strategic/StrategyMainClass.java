package com.zl.Designpattern.Strategic;
interface Strategy {
    //加密
    public void encrypt();
}
//具体策略
 class MD5Strategy implements Strategy{

    public void encrypt() {
        System.out.println("执行MD5加密");
    }
}

//具体策略
class SHA1Strategy implements Strategy{

    public void encrypt() {
        System.out.println("执行SHA1加密");
    }
}

//封装类
 class Context {
    private Strategy strategy;
    public Context(Strategy strategy) {
        this.strategy = strategy;
    }
    
    public void encrypt() {
        this.strategy.encrypt();
    }
}

public class StrategyMainClass {

	public static void main(String[] args) {
		Strategy stra = new SHA1Strategy();
		stra.encrypt();
        Context context = new Context(new MD5Strategy());
        context.encrypt();

	}

}
