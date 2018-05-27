package com.zl.Bitoperation;

public class Bitoperation {
	
	  //注意位运算的操作数只能是整型和字符型
		//@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@22	
			
			

		//&
//			int a=129;
//			int b=128;
//			System.out.println("129的二进制"+Integer.toBinaryString(129));
//			System.out.println("&");
//			System.out.println("128的二进制"+Integer.toBinaryString(128));
//			System.out.println("-------------------------------------");
//			System.out.println("res的二进制"+Integer.toBinaryString(a&b));
//			System.out.println("a 和b 与&的结果是："+(a&b));
			
	/*		129的二进制10000001
			&
			128的二进制10000000
			-------------------------------------
			res的二进制10000000
			a 和b 与&的结果是：128*/
			
	//@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@		
			
			//"|"
//			int a=129;
//			int b=128;
//			System.out.println("129的二进制"+Integer.toBinaryString(129));
//			System.out.println("|");
//			System.out.println("128的二进制"+Integer.toBinaryString(128));
//			System.out.println("-------------------------------------");
//			System.out.println("res的二进制"+Integer.toBinaryString(a|b));
//			System.out.println("a 和b 与|的结果是："+(a|b));
			
	/*		129的二进制10000001
			|
			128的二进制10000000
			-------------------------------------
			res的二进制10000001
			a 和b 与|的结果是：129*/
			
	//@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@			
			
			
			
			//"~"  
//			int b=128;
//			System.out.println("~");
//			System.out.println("128的二进制"+Integer.toBinaryString(128));
//			System.out.println("-------------------------------------");
//			System.out.println("res的二进制"+Integer.toBinaryString(~b));
//			System.out.println("129的二进制"+Integer.toBinaryString(-129));
//			System.out.println("a 和b 与|的结果是："+(~b));	
			
			
	/*		~ 
			128的二进制10000000
			-------------------------------------
			res的二进制11111111111111111111111101111111
			129的二进制11111111111111111111111101111111
			a 和b 与|的结果是：-129*/
			
	//@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
			
			
			
			//"^"  
		
//			int a=129;
//			int b=128;
//			System.out.println("129的二进制"+Integer.toBinaryString(129));
//			System.out.println("^");
//			System.out.println("128的二进制"+Integer.toBinaryString(128));
//			System.out.println("-------------------------------------");
//			System.out.println("res的二进制"+Integer.toBinaryString(a^b));
//			System.out.println("a 和b 与^的结果是："+(a^b));
			
			
	/*		129的二进制10000001
			^
			128的二进制10000000
			-------------------------------------
			res的二进制1
			a 和b 与^的结果是：1
			*/
			

	//@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
			
			
			//左位移（<<）
			
//			int b=128;
//			System.out.println("<<");
//			System.out.println("128的二进制"+Integer.toBinaryString(128));
//			System.out.println("-------------------------------------");
//			System.out.println("res的二进制"+Integer.toBinaryString(b<<2));
//			System.out.println("b<<2 的结果是："+(b<<2));
//			
//			System.out.println("3的二进制"+Integer.toBinaryString(3));
//			System.out.println("-1073741824"+Integer.toBinaryString(-1073741824));
//			System.out.println(3<<30);-1073741824低位补0
//			System.out.println(3<<32);大于32位  %32 取余
			
	/*		<<
			128的二进制10000000
			-------------------------------------
			res的二进制1000000000
			b<<2 的结果是：512
			法则一：任何数左移（右移）32的倍数位等于该数本身。
	                          法则二：在位移运算m<<n的计算中，若n为正数，则实际移动的位数为n%32，若n为负数，则实际移动的位数为(32+n%32)，右移，同理。
			* ，低位补0
			*高位溢出截断
			* 大于32位  %32 取余*/
			
	//@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@	
			
			//左位移（>>）
			
//			int b=128;
//			System.out.println(">>");
//			System.out.println("128的二进制"+Integer.toBinaryString(128));
//			System.out.println("-------------------------------------");
//			System.out.println("res的二进制"+Integer.toBinaryString(b>>2));
//			System.out.println("b>>2 的结果是："+(b>>2));	
//			
//			System.out.println(b>>10);//低位截断
//			System.out.println("-6的二进制          "+Integer.toBinaryString(-6));
//			System.out.println("-6>>1的二进制"+Integer.toBinaryString(-6>>1));
//			System.out.println(-6>>1);//低位截断
			
	/*		
			>>
	128的二进制10000000
	-------------------------------------
	res的二进制100000
	b>>2 的结果是：32
			
			*高位补充符号位
			*低位溢出截断
			* 大于32位  %32 取余
			
			System.out.println("3的二进制"+Integer.toBinaryString(3));
			System.out.println("-1073741824"+Integer.toBinaryString(-1073741824));
			System.out.println(3<<30);-1073741824
			System.out.println(3<<32);3
			
			*/
			
	//@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@	
			
			
			//无符号右移（>>>）高位补0   低位溢出截断
			
			
//			System.out.println("-1的二进制"+Integer.toBinaryString(-1));
//			System.out.println("-1的二进制"+Integer.toBinaryString(-1>>>1));
//			System.out.println(-1>>>1);
//			-1的二进制11111111111111111111111111111111
//			-1的二进制1111111111111111111111111111111
//			2147483647
			
			
		
			
	//@@@@@@@@@@@@@@@@@@@@@@@@@@@@@位运算的巧妙的用处@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
			
			
		//	 @n&1 == 1?”奇数”:”偶数”  判断是奇数还是偶数
			 
	    //(a^(a>>31))-(a>>31)    绝对值
			
		//变换值	
//			int a=129;
//	     	int b=128;
//			
//		    a=a^b;
//		    b=b^a;
//		    a=a^b;
//		    System.out.println(a+"$$"+b);
			
			
		}


