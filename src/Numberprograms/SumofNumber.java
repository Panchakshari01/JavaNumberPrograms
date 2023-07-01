package Numberprograms;

public class SumofNumber {
public static void main(String[] args) {
	int a=12376;
	int sum=0,r=0;
	while(a!=0)
	{
		r=a%10;
		sum=sum+r;
		a=a/10;
	}
	System.out.println("sum of all digits in the  number is: "+sum);
}

}
