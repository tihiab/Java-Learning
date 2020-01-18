import java.util.Scanner;
public class Zimishu{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		for(int i=1;i<=x;i++){
			int y=i;
			int a=0,b=0;
			while(i!=0){
				b=i%10;
				i/=10;
				a+=b*b*b;
			}
			//System.out.println("the sum :"+a);
			if(a==y){
				System.out.println("Yes"+a);
			}
			i=y;
		}
		
	}
}