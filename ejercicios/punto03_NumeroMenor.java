package ejercicios;

public class punto03_NumeroMenor 
{
	static int menor;

	public static void main(String[] args) 
	{
		int [] arreglo = new int [5];
		int numMenor;
		int inicio = 0;
		int fin = arreglo.length-1;
		
		arreglo[0] = 166;
		arreglo[1] = 9;
		arreglo[2] = 200;
		arreglo[3] = 2;
		arreglo[4] = 44;
		
		menor = arreglo[0];
		
		numMenor = buscarNumMenor(arreglo,inicio,fin);
		System.out.print("El numero menor de ese arreglo es : " + numMenor);
	}

	private static int buscarNumMenor(int[] arreglo, int inicio, int fin)
	{
		if(arreglo[inicio] < menor)
		{
			menor = arreglo[inicio];
		}
		
		if(inicio == fin)
		{
			return menor;
		}
		else 
		{
			return buscarNumMenor(arreglo, inicio+1, fin);
		}
		
	}

}
