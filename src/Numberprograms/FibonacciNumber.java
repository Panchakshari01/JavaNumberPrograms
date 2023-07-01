package Numberprograms;

public class FibonacciNumber {
public static void main(String[] args) {
	int x=0,y=1;
	int z=0;
	System.out.println("The Fibonnaci Number series is");
	System.out.println(x);
	System.out.println(y);
	for(int a=2;a<=10;a++)
	{
		z=x+y;
		x=y;
		y=z;
		System.out.println(z);
	}
	
}
}
