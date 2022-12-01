package ejercicios;

public class punto01_CantidadCifras 
{
	public static void main(String[] args) 
	{
		int cifras  = 0;
		int n = 3245;
		cifras = cifrasNumeroEntero(n);
		System.out.println(cifras);
	}
	
	public static int cifrasNumeroEntero(int n) 
	{
		if(n < 10)
		{
			return 1;
		}
		else 	
		{
			return cifrasNumeroEntero( n / 10 ) + 1;
		}
	}
}
