package step1;
import java.util.Scanner;
/**/
//대한비만학회는 기존에는 BMI가 18.5 미만이면 저체중, 
//18.5∼23은 정상, 23~25이면 과체중, 
//25∼30은 경도비만, 30∼35는 중등도비만 , 
//35 이상이면 고도비만으로 구분했었으나, 
//2018년 비만진료지침에서 단계별 용어가 새롭게 변경되어 
//18.5 미만이면 저체중, 18.5∼23은 정상, 
//23~25이면 '비만 전단계'[5], 25∼30은 '1단계 비만', 
//30∼35는 '2단계 비만' , 35 이상이면 '3단계 비만'으로 구분한다.
public class BMI{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("당신의 키를 입력하시오?");
		double hei = scan.nextDouble();
		System.out.print("당신의 체중을 입력하시오?");
		double wei = scan.nextDouble();
		String result = "";
		double nw = (wei / (hei * hei)) / 10000;

		if(nw<=18.5){
			result = "저체중";

		} else if(18.5<nw && nw<=23.0){
			result = "정상";

		} else if(23.0<nw && nw<=25.0){
			result = "과체중";

		} else if(25.0<nw && nw<=30.0){
			result = "경도비만";

		} else if(30.0<nw && nw<=35.0){
			result = "중등도비만";

		} else{
			result = "고도비만";

		}
		System.out.print("따라서 " + result + " 입니다.");
	}
}
