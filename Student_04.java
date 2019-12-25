package java_1_0;

import java.util.*;

public class Student_04 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		String[] name = new String[10];
		String[] password = new String[10];

		a: while (true) {
			for (int i = 0; i < name.length; i++) {
				System.out.println("学生管理系统");
				System.out.println("1、登录\t2、注册\t3、退出系统");
				int login = in.nextInt();
				if (login == 1) {
					System.out.println("请输入用户名：");
					String user = in.next();
					if (user.equals(name[i])) {
						System.out.println("请输入密码：");
						String num1 = in.next();
						if (num1.equals(password[i])) {
							System.out.println("用户：" + user + "登录成功！");
							System.out.println("请输入有几个学生：");
							int num = in.nextInt(); // 接收学生人数
							System.out.println("请输入有几门科目 ：");
							int course = in.nextInt(); // 接收课程数量
							String[] students = new String[num]; // 学生名字数组
							String[] courseN = new String[course]; // 课程名称数组
							int[][] farction = new int[num][course]; // 学生各科成绩数组
							int[] total = new int[num]; // 总成绩数组
							String[] str = new String[num]; // 存储：学生名字+各科成绩+总成绩+均分
							/*
							 * 循环录入并存储科目名称
							 */
							for (int i2 = 0; i2 < courseN.length; i2++) {
								System.out.println("请输入第" + (i2 + 1) + "门科目的名称：");
								courseN[i2] = in.next();
							}
							/*
							 * 循环录入并存储学生名字
							 */
							for (int i3 = 0; i3 < students.length; i3++) {
								int sum = 0; // 每次循环sum都等于0
								String atr = ""; // 每次循环atr都为空
								System.out.println("请输入第" + (i3 + 1) + "位学生的名字：");
								students[i3] = in.next();
								/*
								 * 循环录入并存储学生的各科成绩
								 */
								for (int j = 0; j < courseN.length; j++) {
									System.out.println("请输入" + students[i3] + "的" + courseN[j] + "成绩：");
									farction[i3][j] = in.nextInt();
									sum += farction[i3][j]; // 每次循环sum都等于各科成绩之和
									atr += farction[i3][j] + "\t"; // 每次循环都以string的形式录入各科成绩
								}
								total[i3] = sum; // 把总成绩赋值到total的数组里
								/*
								 * 各数组的集合并以string的形式录入str的数组里
								 */
								str[i3] = students[i3] + "\t" + atr + total[i3] + "\t" + total[i3] / course;
							}
							/*
							 * 冒泡排序
							 */
							for (int i4 = 0; i4 < total.length - 1; i4++) {
								for (int j = 0; j < total.length - 1; j++) {
									if (total[j] < total[j + 1]) {
										/*
										 * 比较总成绩的大小 改变str数组的位置
										 */
										int t = total[j];
										String t1 = str[j];
										total[j] = total[j + 1];
										str[j] = str[j + 1];
										total[j + 1] = t;
										str[j + 1] = t1;
									}
								}
							}
							System.out.print("姓名\t");
							/*
							 * 课程目录的排序
							 */
							for (int i6 = 0; i6 < courseN.length; i6++) {
								System.out.print(courseN[i6] + "\t");
							}
							System.out.println("总成绩\t平均分\t排行\t");
							/*
							 * 输出str数组
							 */
							for (int i5 = 0; i5 < students.length; i5++) {
								System.out.print(str[i5] + "\t" + "第" + (i5 + 1) + "名");
								System.out.println(); // 换行
							}
							b: while (true) {
								System.out.println("请选择您的操作：\n1、返回登陆界面（数据将被清除请谨慎操作）\n2、查看\n3、修改");
								int operation = in.nextInt();
								if (operation == 1) {
									continue a;
								} else if (operation == 2) {
									for (int i4 = 0; i4 < total.length - 1; i4++) {
										for (int j = 0; j < total.length - 1; j++) {
											if (total[j] < total[j + 1]) {
												/*
												 * 比较总成绩的大小 改变str数组的位置
												 */
												int t = total[j];
												String t1 = str[j];
												total[j] = total[j + 1];
												str[j] = str[j + 1];
												total[j + 1] = t;
												str[j + 1] = t1;
											}
										}
									}
									System.out.print("学生\t");
									/*
									 * 课程目录的排序
									 */
									for (int i6 = 0; i6 < courseN.length; i6++) {
										System.out.print(courseN[i6] + "\t");
									}
									System.out.println("总成绩\t平均分\t排行\t");
									/*
									 * 输出str数组
									 */
									for (int i5 = 0; i5 < students.length; i5++) {
										System.out.print(str[i5] + "\t" + "第" + (i5 + 1) + "名");
										System.out.println(); // 换行
									}
									continue b;
								} else if (operation == 3) {
									c: while (true) {
										System.out.println("请选择要修改的地方：\n1、科目\n2、姓名");
										int choose = in.nextInt();
										if (choose == 1) {
											d: while (true) {
												System.out.println("请输入要修改的科目名称：");
												String a = in.next();
												for (int y = 0; y < courseN.length; y++) {
													if (a.equals(courseN[y])) {
														System.out.println("修改存在请输入要修改后的科目名称：");
														courseN[y] = in.next();
														for (int i4 = 0; i4 < total.length - 1; i4++) {
															for (int j = 0; j < total.length - 1; j++) {
																if (total[j] < total[j + 1]) {
																	/*
																	 * 比较总成绩的大小 改变str数组的位置
																	 */
																	int t = total[j];
																	String t1 = str[j];
																	total[j] = total[j + 1];
																	str[j] = str[j + 1];
																	total[j + 1] = t;
																	str[j + 1] = t1;
																}
															}
														}
														System.out.print("学生\t");
														/*
														 * 课程目录的排序
														 */
														for (int i6 = 0; i6 < courseN.length; i6++) {
															System.out.print(courseN[i6] + "\t");
														}
														System.out.println("总成绩\t平均分\t排行\t");
														/*
														 * 输出str数组
														 */
														for (int i5 = 0; i5 < students.length; i5++) {
															System.out.print(str[i5] + "\t" + "第" + (i5 + 1) + "名");
															System.out.println(); // 换行
														}
													} else {
														System.out.println("修改不存在！");
														continue d;
													}
													break;
												}
												System.out.println("请问您是否还需要修改：\n1、继续修改\n2、返回修改界面\n3、返回操作界面");
												int caozuo = in.nextInt();
												if (caozuo == 1) {
													continue d;
												} else if (caozuo == 2) {
													continue c;
												} else {
													continue b;
												}
											}

										} else if (choose == 2) {
											e: while (true) {
												System.out.println("请输入要修改的姓名：");
												String g = in.next();
												for (int r = 0; r < students.length; r++) {
													if (g.equals(students[r])) {
														System.out.println("修改存在请输入要修改后的姓名：");
														students[r] = in.next();
														/*
														 * 循环录入并存储学生名字
														 */
														for (int i3 = 0; i3 < students.length; i3++) {
															int sum = 0; // 每次循环sum都等于0
															String atr = ""; // 每次循环atr都为空
															/*
															 * 循环录入并存储学生的各科成绩
															 */
															for (int j = 0; j < courseN.length; j++) {
																sum += farction[i3][j]; // 每次循环sum都等于各科成绩之和
																atr += farction[i3][j] + "\t"; // 每次循环都以string的形式录入各科成绩
															}
															total[i3] = sum; // 把总成绩赋值到total的数组里
															/*
															 * 各数组的集合并以string的形式录入str的数组里
															 */
															str[i3] = students[i3] + "\t" + atr + total[i3] + "\t"
																	+ total[i3] / course;
														}
														for (int i4 = 0; i4 < total.length - 1; i4++) {
															for (int j = 0; j < total.length - 1; j++) {
																if (total[j] < total[j + 1]) {
																	/*
																	 * 比较总成绩的大小 改变str数组的位置
																	 */
																	int t = total[j];
																	String t1 = str[j];
																	total[j] = total[j + 1];
																	str[j] = str[j + 1];
																	total[j + 1] = t;
																	str[j + 1] = t1;
																}
															}
														}
														System.out.print("学生\t");
														/*
														 * 课程目录的排序
														 */
														for (int i6 = 0; i6 < courseN.length; i6++) {
															System.out.print(courseN[i6] + "\t");
														}
														System.out.println("总成绩\t平均分\t排行\t");
														/*
														 * 输出str数组
														 */
														for (int i5 = 0; i5 < students.length; i5++) {
															System.out.print(str[i5] + "\t" + "第" + (i5 + 1) + "名");
															System.out.println(); // 换行
														}
													} else {
														System.out.println("修改不存在！");
														continue e;
													}
													break;
												}
												System.out.println("请问您是否还需要修改：\n1、继续修改\n2、返回修改界面\n3、返回操作界面");
												int caozuo = in.nextInt();
												if (caozuo == 1) {
													continue e;
												} else if (caozuo == 2) {
													continue c;
												} else {
													continue b;
												}
											}
										}
									}
								}
							}

						} else {
							System.out.println("密码输入错误！");

						}
					} else {
						System.out.println("对不起该用户不存在！");
						continue a;
					}
				} else if(login==2){
					for (int i1 = 0; i1 < name.length; i1++) {
						System.out.println("请输入注册用户名：");
						name[i1] = in.next();
						System.out.println("请输入注册用户名密码：");
						password[i1] = in.next();
						continue a;
					}
				}else if(login==3) {
					System.out.println("已退出系统！");
					break a;
				}
			}
		}

	}

}
