package java_1_0;

import java.util.*;

public class Student_04 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		String[] name = new String[10];
		String[] password = new String[10];

		a: while (true) {
			for (int i = 0; i < name.length; i++) {
				System.out.println("ѧ������ϵͳ");
				System.out.println("1����¼\t2��ע��\t3���˳�ϵͳ");
				int login = in.nextInt();
				if (login == 1) {
					System.out.println("�������û�����");
					String user = in.next();
					if (user.equals(name[i])) {
						System.out.println("���������룺");
						String num1 = in.next();
						if (num1.equals(password[i])) {
							System.out.println("�û���" + user + "��¼�ɹ���");
							System.out.println("�������м���ѧ����");
							int num = in.nextInt(); // ����ѧ������
							System.out.println("�������м��ſ�Ŀ ��");
							int course = in.nextInt(); // ���տγ�����
							String[] students = new String[num]; // ѧ����������
							String[] courseN = new String[course]; // �γ���������
							int[][] farction = new int[num][course]; // ѧ�����Ƴɼ�����
							int[] total = new int[num]; // �ܳɼ�����
							String[] str = new String[num]; // �洢��ѧ������+���Ƴɼ�+�ܳɼ�+����
							/*
							 * ѭ��¼�벢�洢��Ŀ����
							 */
							for (int i2 = 0; i2 < courseN.length; i2++) {
								System.out.println("�������" + (i2 + 1) + "�ſ�Ŀ�����ƣ�");
								courseN[i2] = in.next();
							}
							/*
							 * ѭ��¼�벢�洢ѧ������
							 */
							for (int i3 = 0; i3 < students.length; i3++) {
								int sum = 0; // ÿ��ѭ��sum������0
								String atr = ""; // ÿ��ѭ��atr��Ϊ��
								System.out.println("�������" + (i3 + 1) + "λѧ�������֣�");
								students[i3] = in.next();
								/*
								 * ѭ��¼�벢�洢ѧ���ĸ��Ƴɼ�
								 */
								for (int j = 0; j < courseN.length; j++) {
									System.out.println("������" + students[i3] + "��" + courseN[j] + "�ɼ���");
									farction[i3][j] = in.nextInt();
									sum += farction[i3][j]; // ÿ��ѭ��sum�����ڸ��Ƴɼ�֮��
									atr += farction[i3][j] + "\t"; // ÿ��ѭ������string����ʽ¼����Ƴɼ�
								}
								total[i3] = sum; // ���ܳɼ���ֵ��total��������
								/*
								 * ������ļ��ϲ���string����ʽ¼��str��������
								 */
								str[i3] = students[i3] + "\t" + atr + total[i3] + "\t" + total[i3] / course;
							}
							/*
							 * ð������
							 */
							for (int i4 = 0; i4 < total.length - 1; i4++) {
								for (int j = 0; j < total.length - 1; j++) {
									if (total[j] < total[j + 1]) {
										/*
										 * �Ƚ��ܳɼ��Ĵ�С �ı�str�����λ��
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
							System.out.print("����\t");
							/*
							 * �γ�Ŀ¼������
							 */
							for (int i6 = 0; i6 < courseN.length; i6++) {
								System.out.print(courseN[i6] + "\t");
							}
							System.out.println("�ܳɼ�\tƽ����\t����\t");
							/*
							 * ���str����
							 */
							for (int i5 = 0; i5 < students.length; i5++) {
								System.out.print(str[i5] + "\t" + "��" + (i5 + 1) + "��");
								System.out.println(); // ����
							}
							b: while (true) {
								System.out.println("��ѡ�����Ĳ�����\n1�����ص�½���棨���ݽ�����������������\n2���鿴\n3���޸�");
								int operation = in.nextInt();
								if (operation == 1) {
									continue a;
								} else if (operation == 2) {
									for (int i4 = 0; i4 < total.length - 1; i4++) {
										for (int j = 0; j < total.length - 1; j++) {
											if (total[j] < total[j + 1]) {
												/*
												 * �Ƚ��ܳɼ��Ĵ�С �ı�str�����λ��
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
									System.out.print("ѧ��\t");
									/*
									 * �γ�Ŀ¼������
									 */
									for (int i6 = 0; i6 < courseN.length; i6++) {
										System.out.print(courseN[i6] + "\t");
									}
									System.out.println("�ܳɼ�\tƽ����\t����\t");
									/*
									 * ���str����
									 */
									for (int i5 = 0; i5 < students.length; i5++) {
										System.out.print(str[i5] + "\t" + "��" + (i5 + 1) + "��");
										System.out.println(); // ����
									}
									continue b;
								} else if (operation == 3) {
									c: while (true) {
										System.out.println("��ѡ��Ҫ�޸ĵĵط���\n1����Ŀ\n2������");
										int choose = in.nextInt();
										if (choose == 1) {
											d: while (true) {
												System.out.println("������Ҫ�޸ĵĿ�Ŀ���ƣ�");
												String a = in.next();
												for (int y = 0; y < courseN.length; y++) {
													if (a.equals(courseN[y])) {
														System.out.println("�޸Ĵ���������Ҫ�޸ĺ�Ŀ�Ŀ���ƣ�");
														courseN[y] = in.next();
														for (int i4 = 0; i4 < total.length - 1; i4++) {
															for (int j = 0; j < total.length - 1; j++) {
																if (total[j] < total[j + 1]) {
																	/*
																	 * �Ƚ��ܳɼ��Ĵ�С �ı�str�����λ��
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
														System.out.print("ѧ��\t");
														/*
														 * �γ�Ŀ¼������
														 */
														for (int i6 = 0; i6 < courseN.length; i6++) {
															System.out.print(courseN[i6] + "\t");
														}
														System.out.println("�ܳɼ�\tƽ����\t����\t");
														/*
														 * ���str����
														 */
														for (int i5 = 0; i5 < students.length; i5++) {
															System.out.print(str[i5] + "\t" + "��" + (i5 + 1) + "��");
															System.out.println(); // ����
														}
													} else {
														System.out.println("�޸Ĳ����ڣ�");
														continue d;
													}
													break;
												}
												System.out.println("�������Ƿ���Ҫ�޸ģ�\n1�������޸�\n2�������޸Ľ���\n3�����ز�������");
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
												System.out.println("������Ҫ�޸ĵ�������");
												String g = in.next();
												for (int r = 0; r < students.length; r++) {
													if (g.equals(students[r])) {
														System.out.println("�޸Ĵ���������Ҫ�޸ĺ��������");
														students[r] = in.next();
														/*
														 * ѭ��¼�벢�洢ѧ������
														 */
														for (int i3 = 0; i3 < students.length; i3++) {
															int sum = 0; // ÿ��ѭ��sum������0
															String atr = ""; // ÿ��ѭ��atr��Ϊ��
															/*
															 * ѭ��¼�벢�洢ѧ���ĸ��Ƴɼ�
															 */
															for (int j = 0; j < courseN.length; j++) {
																sum += farction[i3][j]; // ÿ��ѭ��sum�����ڸ��Ƴɼ�֮��
																atr += farction[i3][j] + "\t"; // ÿ��ѭ������string����ʽ¼����Ƴɼ�
															}
															total[i3] = sum; // ���ܳɼ���ֵ��total��������
															/*
															 * ������ļ��ϲ���string����ʽ¼��str��������
															 */
															str[i3] = students[i3] + "\t" + atr + total[i3] + "\t"
																	+ total[i3] / course;
														}
														for (int i4 = 0; i4 < total.length - 1; i4++) {
															for (int j = 0; j < total.length - 1; j++) {
																if (total[j] < total[j + 1]) {
																	/*
																	 * �Ƚ��ܳɼ��Ĵ�С �ı�str�����λ��
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
														System.out.print("ѧ��\t");
														/*
														 * �γ�Ŀ¼������
														 */
														for (int i6 = 0; i6 < courseN.length; i6++) {
															System.out.print(courseN[i6] + "\t");
														}
														System.out.println("�ܳɼ�\tƽ����\t����\t");
														/*
														 * ���str����
														 */
														for (int i5 = 0; i5 < students.length; i5++) {
															System.out.print(str[i5] + "\t" + "��" + (i5 + 1) + "��");
															System.out.println(); // ����
														}
													} else {
														System.out.println("�޸Ĳ����ڣ�");
														continue e;
													}
													break;
												}
												System.out.println("�������Ƿ���Ҫ�޸ģ�\n1�������޸�\n2�������޸Ľ���\n3�����ز�������");
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
							System.out.println("�����������");

						}
					} else {
						System.out.println("�Բ�����û������ڣ�");
						continue a;
					}
				} else if(login==2){
					for (int i1 = 0; i1 < name.length; i1++) {
						System.out.println("������ע���û�����");
						name[i1] = in.next();
						System.out.println("������ע���û������룺");
						password[i1] = in.next();
						continue a;
					}
				}else if(login==3) {
					System.out.println("���˳�ϵͳ��");
					break a;
				}
			}
		}

	}

}
