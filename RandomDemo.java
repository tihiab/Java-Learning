import java.util.Random;
import java.util.Scanner;
public class RandomDemo{
	public static void main(String[] args){
		Random r=new Random();
		Scanner sc=new Scanner(System.in);
		System.out.println("输入一个数字,表示想要的随机昵称的的长度");
		int len=sc.nextInt();
		for(int i=0;i<len;i++){
			char y=(char)(r.nextInt(26)+97);	
			System.out.println(y);
		}
		
	}
}