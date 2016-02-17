package com.felcx.game;

import com.felcx.factory.IBaseExcute;
import com.felcx.utill.FelcxTools;

public class PlayJinZhi implements IBaseExcute {

	public static void test() {
		int[][] test = new int[3][3];
		boolean isTurn = true;
		do {
			display(test);
			if (isTurn) {
				System.out.println("Enter a row (0, 1, or 2) for player X:");
				int i = FelcxTools.getScanner().nextInt();
				System.out.println("Enter a column (0, 1, or 2) for player X:");
				int j = FelcxTools.getScanner().nextInt();
				if (test[i][j] == 0) {
					test[i][j] = 1;
					isTurn = false;
				} else {
					System.out.println("the cell is alrady put,please enter anoter");
				}

			} else {
				System.out.println("Enter a row (0, 1, or 2) for player y:");
				int i = FelcxTools.getScanner().nextInt();
				System.out.println("Enter a column (0, 1, or 2) for player y:");
				int j = FelcxTools.getScanner().nextInt();
				if (test[i][j] == 0) {
					test[i][j] = -1;
					isTurn = true;
				} else {
					System.out.println("the cell is alrady put,please enter anoter");
				}
			}
		} while (!judge(test));
		display(test);
	}

	private static void display(int[][] test) {
		String sprit="-------------";
		System.out.println(sprit);
	   for(int i=0;i<test.length;i++){
		   for(int j=0;j<test[i].length;j++){
			   char c=' ';
			   switch (test[i][j]) {
			case 1:
				c='X';
				break;
			case -1:
	            c='Y';
				break;
			default:
				break;
			}
			   System.out.printf("| %c ",c);
		   }
		   System.out.println("|");
		   System.out.println(sprit);
	   }
	}
    private static boolean judgeCell(int sum){
    	if(sum==3){
			System.out.println("well done! X win!");
			return true;
		}else if(sum==-3){
			System.out.println("well done! Y win!");
			return true;
		}
    	return false;
    }
	private static boolean judge(int[][] test) {
		boolean iswin=false;
		for(int i=0;i<test.length;i++){
			int sum=0;
			for(int j=0;j<test[i].length;j++){
				sum+=test[i][j];
			}
			if(judgeCell(sum))
			return judgeCell(sum);
		}
		for(int i=0;i<test[0].length;i++){
			int sum=0;
			for(int j=0;j<test.length;j++){
				sum+=test[j][i];
			}
			if(judgeCell(sum))
			return judgeCell(sum);
		}
	    for(int i=0;i<3;i++){
	    	    int sum=0;
				sum+=test[i][i];
			if(judgeCell(sum))
			return judgeCell(sum);
	    }
	    for(int i=0;i<3;i++){
	    	int sum=0;
				sum+=test[i][test.length-1-i];
		    if(judgeCell(sum))
			return judgeCell(sum);
	    }
		return iswin;
	}

	@Override
	public void excuter() throws Exception {
		test();
	}

}
