package com.felcx.method;

import java.util.Arrays;

public class Sort {

	/**
	 * 选择排序
	 * @param test
	 */
	private void selectSort(int[] test) {
		for(int i=0;i<test.length-1;i++){
			int minIndex=i;
			for(int j=i+1;j<test.length;j++){
				if(test[minIndex]>test[j]){
					minIndex=j;
				}
			}
			int temp=test[minIndex];
			test[minIndex]=test[i];
			test[i]=temp;
		}
	}
	/**
	 * 插入排序
	 * @param array
	 */
	private void insertSort(int[] array){
		for(int i=1;i<array.length;i++){
			int j=i-1,temp=array[i];
			while(j>=0&&temp<array[j]){
				array[j+1]=array[j];
				j--;
			}
			array[j+1]=temp;
		}
	}
	/**
	 * 冒泡排序
	 * @param test
	 */
	private void popSort(int[] test) {
		for(int i=0;i<test.length-1;i++){
			for(int j=test.length-1;j>i;j--){
				if(test[j]<test[j-1]){	
					int temp=test[j];
					test[j]=test[j-1];
					test[j-1]=temp;
				}
			}
		}
	}
	/**
	 * 二分法查数据
	 * @param x
	 * @param test
	 * @return
	 */
	private int binarySearch(int x, int[] test) {
        int start=0,end=test.length-1,index=-1;
        do{
        	int middle=(start+end)/2;
        	if(x==test[middle]){
        		index=middle;
        		break;
        	}else if(x<test[middle]){
        		end=middle-1;
        	}else{
        		start=middle+1;
        	}
        }while(start<=end);
		return index;
	}
	/**
	 * 测试程序
	 */
	public void play() {
		int[] test={21,43,21,1,4,43,2,5,1,54,21,652,32,32,711};
		int max=100000;
//		int[] maxTest=new int[max];
//		for(int i=0;i<max;i++){
//			maxTest[i]=(int)(Math.random()*max);
//		}
//		
	    long start=System.currentTimeMillis();
		Arrays.sort(test);
	   // popSort(maxTest);
		//Arrays.parallelSort(maxTest);
		long end=System.currentTimeMillis();
		System.out.println("cost:"+(end-start));
		System.out.println(Arrays.binarySearch(test, 5));
		System.out.println(Arrays.toString(test));
		System.out.println();
//		int index=binarySearch(652,test);
//		System.out.println(index);
	}

}
