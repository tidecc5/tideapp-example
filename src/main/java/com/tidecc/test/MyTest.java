package com.tidecc.test;

public class MyTest {
	

	public static void main(String[] args){
		
		//MyTest.testException1();
		MyTest.testErrPrintln();
	}
	
	
	public static void testException1() {
        int[] ints = new int[] { 1, 2, 3, 4 };
        System.out.println("�쳣����ǰ");
        try {
            System.out.println(ints[4]);
            System.out.println("�һ�����ִ�е���");// �����쳣�Ժ󣬺���Ĵ��벻�ܱ�ִ��
        } catch (IndexOutOfBoundsException e) {
        	e.printStackTrace();
            System.out.println("����Խ�����");
        }
        System.out.println("�쳣���ֺ�");
    }
    /*output:
    �쳣����ǰ
    ����Խ�����
    4
    �쳣���ֺ�
    */
	
	
	public static void testErrPrintln(){
		System.out.println("Mian������ʼ������"); 
		System.err.println("���һ��������Ϣ"); 
		System.err.println("������Ϣ"); 
		System.out.println("Mian������������");
		
		

	}
	
}
