package com.felcx.method;

import com.felcx.factory.IBaseExcute;

/**
 *八皇后问题，分迭代与递归
 * @author Felcx
 *
 */
public class Queen implements IBaseExcute{
	
	/**
	 * 迭代法求八皇后的解，其实就是利用for循环和continue实现回朔，来求皇后位置。
	 * 八皇后问题
	 * 思维：把8*8的棋盘抽象为从1到64的位置，依次限制每个皇后的行位置（如1到8），然后每个皇后与上面的皇后对比是否竖向，正斜，负斜为一直线，如果是就continue回朔，最后在第八个皇后得出结果，
	 * 输出，92种摆法的显示。
	 */
	private void queen1() {
		int a = 1, b = 9, c = 17, d = 25, e = 33, f = 41, g = 49, h = 57, n = 1;
		for (a = 1; a < 9; a++) {                                                                                    //第一个皇后
			for (b = 9; b < 17; b++) {                                                                               //第二个皇后
				if (b == a + 8 || b == a + 8 + 1 || b == a + 8 - 1)              
					continue;
				for (c = 17; c < 25; c++) {                                                                          //第三个皇后
					if (c == a + 2 * 8 || c == a + 2 * 8 + 2 || c == a + 2 * 8 - 2 || c == b + 8 || c == b + 9
							|| c == b + 8 - 1)
						continue;
					for (d = 25; d < 33; d++) {                                                                      //第四个皇后
						if (d == a + 3 * 8 || d == a + 3 * 8 + 3 || d == a + 3 * 8 - 3 || d == b + 2 * 8
								|| d == b + 2 * 8 + 2 || d == b + 2 * 8 - 2 || d == c + 8 || d == c + 9
								|| d == c + 8 - 1)
							continue;
						for (e = 33; e < 41; e++) {                                                                  //第五个皇后
							if (e == a + 4 * 8 || e == a + 4 * 8 + 4 || e == a + 4 * 8 - 4 || e == b + 3 * 8
									|| e == b + 3 * 8 + 3 || e == b + 3 * 8 - 3 || e == c + 2 * 8 || e == c + 2 * 8 + 2
									|| e == c + 2 * 8 - 2 || e == d + 8 || e == d + 9 || e == d + 8 - 1)
								continue;
							for (f = 41; f < 49; f++) {                                                              //第六个皇后
								if (f == a + 5 * 8 || f == a + 5 * 8 + 5 || f == a + 5 * 8 - 5 || f == b + 4 * 8
										|| f == b + 4 * 8 + 4 || f == b + 4 * 8 - 4 || f == c + 3 * 8
										|| f == c + 3 * 8 + 3 || f == c + 3 * 8 - 3 || f == d + 2 * 8
										|| f == d + 2 * 8 + 2 || f == d + 2 * 8 - 2 || f == e + 8 || f == e + 8 + 1
										|| f == e + 8 - 1)
									continue;
								for (g = 49; g < 57; g++) {                                                          //第七个皇后
									if (g == a + 6 * 8 || g == a + 6 * 8 + 6 || g == a + 6 * 8 - 6 || g == b + 5 * 8
											|| g == b + 5 * 8 + 5 || g == b + 5 * 8 - 5 || g == c + 4 * 8
											|| g == c + 4 * 8 + 4 || g == c + 4 * 8 - 4 || g == d + 3 * 8
											|| g == d + 3 * 8 + 3 || g == d + 3 * 8 - 3 || g == e + 2 * 8
											|| g == e + 2 * 8 + 2 || g == e + 2 * 8 - 2 || g == f + 8 || g == f + 8 + 1
											|| g == f + 8 - 1)
										continue;
									for (h = 57; h < 65; h++) {                                                      //第八个皇后
										if (h == a + 7 * 8 || h == a + 7 * 8 + 7 || h == a + 7 * 8 - 7 || h == b + 6 * 8
												|| h == b + 6 * 8 + 6 || h == b + 6 * 8 - 6 || h == c + 5 * 8
												|| h == c + 5 * 8 + 5 || h == c + 5 * 8 - 5 || h == d + 4 * 8
												|| h == d + 4 * 8 + 4 || h == d + 4 * 8 - 4 || h == e + 3 * 8
												|| h == e + 3 * 8 + 3 || h == e + 3 * 8 - 3 || h == f + 2 * 8
												|| h == f + 2 * 8 + 2 || h == f + 2 * 8 - 2 || h == g + 8
												|| h == g + 8 + 1 || h == g + 8 - 1)
											continue;
										System.out.println("");
										System.out.println("第" + (n++) + "个：");
										for (int i = 1; i <= 64; i++) {
											if (i == a || i == b || i == c || i == d || i == e || i == f || i == g
													|| i == h)
												System.out.printf("%2s", "Q");
											else
												System.out.printf("%2s", "*");
											if (i % 8 == 0)
												System.out.println();
										}

									}
								}
							}
						}
					}
				}
			}
		}
	}

	public void excuter() throws Exception {
		queen1();
	}

}
