package Numberprograms;
import java.util.*;
public class ReverseNumber {
public static void main(String[] args) {
	Scanner so=new Scanner(System.in);
	int num,rev=0,r=0;
	System.out.println("Enter any number");
	num=so.nextInt();
	while(num!=0)
	{
		r=num%10;
		rev=rev*10+r;
		num=num/10;
	}
	System.out.println("Reverse of the number is :"+rev);
}
}
