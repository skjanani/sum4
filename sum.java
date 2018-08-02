package janani;
import java.util.Scanner;
public class sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n,n1,a;
System.out.println("enter the number");
Scanner ja=new Scanner(System.in);
n=ja.nextInt();
n1=ja.nextInt();
a=n-n1;
if(a%2==0){
	System.out.println("even");
}
else{
	System.out.println("odd");
}
	}

}
