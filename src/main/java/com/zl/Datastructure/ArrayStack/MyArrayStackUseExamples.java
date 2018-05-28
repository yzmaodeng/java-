package com.zl.Datastructure.ArrayStack;

public class MyArrayStackUseExamples {
	
	public static void main(String[] args) {
		//利用栈实现字符串逆序
//		MyArrayStack stack = new MyArrayStack();
//	    String str = "how are you";
//	    char[] cha = str.toCharArray();
//	    for(char c : cha){
//	        stack.push(c);
//	    }
//	    while(!stack.isEmpty()){
//	        System.out.print(stack.pop());
//	    }
		
		
		
	    //2利用栈判断分隔符是否匹配　
	    MyArrayStack stack = new MyArrayStack(3);
	    String str = "12<a[b{c}]>";
	    char[] cha = str.toCharArray();
	    for(char c : cha){
	        switch (c) {
	        case '{':
	        case '[':
	        case '<':
	            stack.push(c);
	            break;
	        case '}':
	        case ']':
	        case '>':
	            if(!stack.isEmpty()){
	                char ch = stack.pop().toString().toCharArray()[0];
	                if(c=='}' && ch != '{'
	                    || c==']' && ch != '['
	                    || c==')' && ch != '('){
	                    System.out.println("Error:"+ch+"-"+c);
	                }
	            }
	            break;
	        default:
	            break;
	        }
	    }
	    
	    
	    
	    
		
	}

}
