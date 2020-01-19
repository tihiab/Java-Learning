import java.util.Random;
import java.util.Scanner;
public class GuessRandom{
	public static void main(String[] args){
		Random r=new Random();
		Scanner sc=new Scanner(System.in);
		int x=r.nextInt(1000)+1;
		System.out .println("系统将随机生成一个1~1000之间的数x");
		System.out.println("请输入你猜的数:");
		int a=sc.nextInt();
		int cnt=1;
		if(a==x){
			
		}else{
			do{
				if(a>x){
					System.out.println("你输入的数大了");
					System.out.println("----------------");
					System.out.println("请再输入一个更小的数:");
					a=sc.nextInt();
				}else{
					System.out.println("你输入的数小了");
					System.out.println("----------------");
					System.out.println("请再输入一个更大的数:");
					a=sc.nextInt();
				}
				cnt ++;
			}while(a!=x);
		}
		System.out.println("你猜了"+cnt+"次");
		System.out.println("你猜对了,x就是"+x);
	}
}