package Numberprograms;
import java.util.*;
public class FactorialNumber {
public static void main(String[] args) {
	Scanner so=new Scanner(System.in);
	int num,i=1;
	System.out.println("Enter any number");
	num=so.nextInt();
	for(int x=1;x<=num;x++)
	{
		i=i*x;
	}
	System.out.println("Factorial of "+ num+" number is");
	System.out.println(i);
}
}
