
import java.util.Scanner;

public class Problem
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the real and imaginary part of first complex number");
        int real1=sc.nextInt();
        int imag1=sc.nextInt();
        System.out.println("enter the real and imaginary part of second complex number");
        int real2=sc.nextInt();
        int imag2=sc.nextInt();
        Complex obj=new Complex();
        obj.add(real1,imag1,real2,imag2);
        obj.difference(real1,imag1,real2,imag2);
		obj.product(real1,imag1,real2,imag2);
	}
}

class Complex
{
    public void add(int real1,int imag1,int real2,int imag2)
    {
        System.out.println("addition is: "+(real1+real2)+"+"+(imag1+imag2)+"i");
    }
    public void difference(int real1,int imag1,int real2,int imag2)
    {
        System.out.println("difference is: "+(real1-real2)+"+"+(imag1-imag2)+"i");
    }
    public void product(int real1,int imag1,int real2,int imag2)
    {
        System.out.println("product is: "+(real1*real2-imag1*imag2)+"+"+(real1*imag2+imag1*real2)+"i");
    }
    
}