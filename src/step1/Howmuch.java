package step1;

import java.util.Scanner;
public class Howmuch{
	public static void main(String[] args){
		System.out.println("얼마예요?");
		Scanner scan = new Scanner(System.in);
		int num1 = scan.nextInt();
		System.out.println(num1+ "원 입니다.");
		System.out.println("몇개 드릴까요?");
		int num2 = scan.nextInt();
		int num3 = num1*num2;
		System.out.println("총 금액은 "+ num3 +"원 입니다.");
		System.out.println("비싸요. 깎아주세요.");
		System.out.println("몇 퍼센트 DC 할까요?");
		int num4 = scan.nextInt();
		System.out.println(num4 + "퍼센트요");
		String result = "";
		int num5 = num3-(num3*num4/100);
		if(num4>=10){
			result = "안 팔아요";
		} else{
			result = num5 + "원 입니다.";
		}

		System.out.print(result);
	}
}