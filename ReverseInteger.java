package practicePrograms;

public class ReverseInteger {

	public static void main(String[] args) {
		int num = 4581;
		int rev = 0;

		while (num != 0) {//4581  //458
					//0  //108
			rev = rev * 10 + num % 10; // 1  //
			num = num / 10;  //458
		}
		System.out.println(num);
		System.out.println(rev);
		
//		int num1=741;
//		StringBuffer sb=new StringBuffer(String.valueOf(num1)).reverse();
//		
//		System.out.println(sb);
		
		

	}

}
