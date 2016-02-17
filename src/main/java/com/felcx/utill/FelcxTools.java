package com.felcx.utill;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FelcxTools {
	public static char cRandomChar(char start,char end){
		return (char)(Math.random()*(end-start+1)+start);
	}
	private static Scanner scan=new Scanner(System.in);
	private static Scanner scan2;
	private static Scanner scan3;
	public static Scanner getScanner(){
		return scan;
	}
	public static Scanner getScanner(String hint){
		System.out.println(hint);
		return scan;
	}
	public static Scanner getFileScanner() throws FileNotFoundException{
		if(scan2==null){
			scan2=new Scanner(new File("e:\\test.txt"));
		}
		return scan2;
	}
	public static Scanner getFileScanner(String firePath) throws FileNotFoundException{
		if(scan3==null){
			scan3=new Scanner(new File(firePath));
		}
		return scan3;
	}
	public static void flash(){
		scan3=null;
		scan2=null;
	}
}
