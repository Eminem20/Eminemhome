package LIKEF;

public class VariableCalb {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int num1 = 3;
		int num2 = 2;
		int sum = sum(num1, num2);
		System.out.println(buildOutStr(1, "+", num1, num2, sum));

		int num3 = 7;
		int num4 = 2;
		int diff = diff(num3, num4);
		System.out.println(buildOutStr(2, "-", num3, num4, diff));

		int num5 = 10;
		int num6 = 5;
		int div = div(num5, num6);
		System.out.println(buildOutStr(3, "/", num5, num6, div));

		int num7 = 4;
		int num8 = 2;
		int mul = mul(num7, num8);
		System.out.println(buildOutStr(4, "*", num7, num8, mul));

	}

	public static int sum(int num1, int num2) {
		return num1 + num2;
	}

	public static int diff(int num1, int num2) {
		return num1 - num2;
	}

	public static int div(int num1, int num2) {
		return num1 / num2;
	}

	public static int mul(int num1, int num2) {
		return num1 * num2;
	}

	public static String buildOutStr(int rowNum, String symbol, int num1,
			int num2, int res) {
		return rowNum + "," + symbol + "," + num1 + symbol + num2 + "=" + res;
	}
}
