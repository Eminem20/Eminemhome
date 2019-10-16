package LIKEF;
import java.util.*;
public class SayNumAPP {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = getInput(sc);
		int remainder = input%3;
		int res;
		if (remainder == 0){
			res = 3;
		}else{
			res = remainder;
		}
		System.out.println("您输入的序号是"+input+"应该报:"+res);
	}

	private static int getInput(Scanner sc) {
		System.out.println("请输入序号（0表示退出系统）：");
		int input = sc.nextInt();
		return input;
	}

}
