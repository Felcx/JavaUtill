package com.felcx.utill;

public class FelcxRandom {
	/**
	 * 获取从0到n的整数
	 * @param n
	 * @return
	 */
	public static int random(int n){
		if(n<0){
			n-=1;
		}else{
			n+=1;
		}
		return (int)(Math.random()*n);
	}
	
	/**
	 * 获取从n1到n2的整数
	 * @param n
	 * @return
	 */
	public static int random(int n1,int n2){
		if(n1>n2){
			int temp=n1;
			n1=n2;
			n2=temp;
		}
		int step=n2-n1+1;
		return (int)(Math.random()*step)+n1;
	}
}
