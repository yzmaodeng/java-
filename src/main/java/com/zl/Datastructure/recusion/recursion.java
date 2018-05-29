package com.zl.Datastructure.recusion;

public class recursion {

	public static void main(String[] args) throws Exception {

		
		System.out.println(factorial(3));
		System.out.println(sum(2,5));
		
	}
	
	
	
	public static int sum(int n1, int n2) {
        if(n1 == n2) {
            return n1;
        }
         
        if(n1 >  n2) {
            int temp = n1;
            n1 = n2;
            n2 = temp;
        }
         
        return sum(n1, n2-1) + n2;
    }
	
	

public static long factorial(int n) throws Exception {
    if (n < 0)
        throw new Exception("参数不能为负！");
    else if (n == 1 || n == 0)
        return 1;
    else
        return n * factorial(n - 1);
}


	

}
