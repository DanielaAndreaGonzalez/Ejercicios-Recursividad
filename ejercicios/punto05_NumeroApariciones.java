package ejercicios;

public class punto05_NumeroApariciones 
{

	public static void main(String[] args) 
	{
		int [] vector = new int [6];
		int inicio = 0;
		int fin = vector.length-1;
		int elem = 1;
		int numApariciones;
		
		vector[0] = 1;
		vector[1] = 5;
		vector[2] = 7;
		vector[3] = 1;
		vector[4] = 9;
		vector[5] = 1;
		
		numApariciones = numeroApariciones(vector,inicio,fin,elem);
		System.out.print("El numero de aparaciones del numero " + elem + " son: " + numApariciones);

	}

	private static int numeroApariciones(int[] vector, int inicio, int fin, int elem) 
	{
		if(inicio == fin)
		{
			if(vector[inicio] == elem)
			{
				return 1;
			}
			else
			{
				return 0;
			}
		}
		else
		{
			if(vector[inicio] == elem)
			{
				return 1 + numeroApariciones(vector, inicio + 1, fin, elem);
			}
			else
			{
				return numeroApariciones(vector, inicio + 1, fin, elem);
			}
		}
	}
	

}
