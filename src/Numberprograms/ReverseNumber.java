package Numberprograms;
public class ReverseNumber {
public static void main(String[] args) {
	
	int num=45676,rev=0,r=0;
	while(num!=0)
	{
		r=num%10;
		rev=rev*10+r;
		num=num/10;
	}
	System.out.println("Reverse of the number is :"+rev);
}
}
