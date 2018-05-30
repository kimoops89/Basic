package step1;

import java.util.Scanner;
public class Calc{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number1");
		int num1 = scanner.nextInt();
		System.out.println("Enter opcode");
		String code1 = scanner.next();
		System.out.println("Enter number2");
		int num2 = scanner.nextInt();
		int num3 = 0;

		if(code1.equals("+")){
			num3 = num1 + num2;

		} else if(code1.equals("-")){
			num3 = num1 - num2;

		} else if(code1.equals("*")){
			num3 = num1 * num2;

		} else if(code1.equals("/")){
			num3 = num1 / num2;

		} else if(code1.equals("%")){
			num3 = num1 % num2;

		} else{
		
		}
		System.out.print(num1 + code1 + num2 + "=" + num3);
	}
}