package com.tidecc.test;

public class MyTest {
	

	public static void main(String[] args){
		
		//MyTest.testException1();
		MyTest.testErrPrintln();
	}
	
	
	public static void testException1() {
        int[] ints = new int[] { 1, 2, 3, 4 };
        System.out.println("异常出现前");
        try {
            System.out.println(ints[4]);
            System.out.println("我还有幸执行到吗");// 发生异常以后，后面的代码不能被执行
        } catch (IndexOutOfBoundsException e) {
        	e.printStackTrace();
            System.out.println("数组越界错误");
        }
        System.out.println("异常出现后");
    }
    /*output:
    异常出现前
    数组越界错误
    4
    异常出现后
    */
	
	
	public static void testErrPrintln(){
		System.out.println("Mian方法开始运行了"); 
		System.err.println("输出一个错误信息"); 
		System.err.println("错误信息"); 
		System.out.println("Mian方法运行完了");
		
		

	}
	
}
