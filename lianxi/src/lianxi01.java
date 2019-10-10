
public class lianxi01 {
    public static void main(String[]agrs){
    	int num1=3;
    	int num2=2;
    	int sum=sum(num1, num2);
    	System.out.println(buildOutStr(1, "+", num1, num2, sum));
    	
    	int a=7;
    	int b=2;
    	int diff=diff(a, b);
    	System.out.println(buildOutStr(2,"-",a,b,diff));
    	
    	int c=4;
    	int d=2;
    	int mul=c*d;
    	System.out.println(buildOutStr(3,"*",+c,d,+mul));
    	
    	int e=10;
    	int f=2;
    	int div=e/f;
    	System.out.println(buildOutStr(4,"/",e,f,div));
    	
     
    }

	private static String buildOutStr(int rowNum, String symbol, int num1, int num2, int res) {
		return rowNum+","+symbol+","+num1+symbol+num2+"="+res;
	}

	private static int diff(int num1, int num2) {
		return num1-num2;
	}

	private static int sum(int num1, int num2) {
		return num1+num2;
	}
}
