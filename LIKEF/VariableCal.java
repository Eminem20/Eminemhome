package LIKEF;

public class VariableCal {
	public static int sum(int num1, int num2) {
        return num1+num2;
    }

    public static int diff(int num1, int num2) {
        return num1-num2;
    }

    public static int div(int num1, int num2) {
        return num1/num2;
    }

    public static int mul(int num1, int num2) {
        return num1*num2;
    }

    public static String buildOutStr(int rowNum, String symbol, int num1, int num2, int res) {
        return rowNum+","+symbol+","+num1+symbol+num2+"="+res;
    }

}
