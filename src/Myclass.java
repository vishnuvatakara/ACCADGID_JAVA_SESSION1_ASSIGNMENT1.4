import java.util.Scanner;

public class Myclass {
byte a;
short b;
int c;
long d;
float e;
double f;
Scanner s=new Scanner(System.in);
public void read()
{
	System.out.println("enter the byte and short varibles values");
	a=s.nextByte();
	b=s.nextShort();
}
public void operate()
{
	c=a+b;
	System.out.printf("sum of byte and shor in int "+c);
	d=c+b;
	System.out.printf("\nsum of short and int in long "+d);
	e=d+c;
	System.out.printf("\nsum of long and int in float "+e);
	f=e+d;
	System.out.printf("\nsum of long and float in double "+f);
	
	
}
public static void main(String args[])
{
	Myclass obj=new Myclass();
	obj.read();
	obj.operate();
}
}
