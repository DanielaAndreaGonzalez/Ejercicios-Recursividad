package ejercicios;

public class punto04_SumaCifras 
{

	public static void main(String[] args) 
	{
		int n = 1461;
		int sumaTotal;
		
		sumaTotal = sumaCifras(n);
		System.out.print("La suma de las cifras es: " + sumaTotal);

	}

	private static int sumaCifras(int n) 
	{
		if(n < 10)
		{
			return n;
		}
		else
		{
			return sumaCifras(n/10) + n % 10;
		}
	}

}
