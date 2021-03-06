package StackTraceTest;

import java.util.Scanner;

/**
 * Program ce afiseaza rezultatul urmaririi stekului pentru o metoda recursiva
 * @author Dan
 *
 */
public class StackTraceTest 
{
	/**
	 * Calcularea Factorial
	 * @param n Numar
	 * @return n! = 1 *2 * ... n
	 */
	public static int factorial(int n)
	{
		System.out.println("factorial(" + n + "):");
		Throwable t = new Throwable();
		StackTraceElement[] frames = t.getStackTrace();
		for(StackTraceElement f : frames)
		{
			System.out.println(f);
		}
		int r;
		if(n<=1)
		{
			r=1;
		}
		else
		{
			r=n*factorial(n-1);
		}
		System.out.println("return "+r);
		return r;
	}
	
	@SuppressWarnings("resource")
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter n:");
		int n = in.nextInt();
		factorial(n);
	}
}
