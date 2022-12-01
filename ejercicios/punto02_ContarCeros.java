package ejercicios;

public class punto02_ContarCeros 
{
	public static void main(String[] args) 
	{
		int [] arreglo = new int [5];
		int n = 0;
		int totalCeros;
		
		arreglo[0] = 0;
		arreglo[1] = 1;
		arreglo[2] = 0;
		arreglo[3] = 1;
		arreglo[4] = 0;

		totalCeros = contarCeros(arreglo,n);
		
		System.out.print("La cantidad de ceros del arreglo es: " + totalCeros);
	}

	private static int contarCeros(int[] arreglo, int n) 
	{
		if(n >= arreglo.length)
		{
			return 0;
		}
		else
		{
			if(arreglo[n] == 0)
			{
				return contarCeros(arreglo, n+1)+1;
			}
			else
			{
				return contarCeros(arreglo, n+1);
			}
		}
	}
}
