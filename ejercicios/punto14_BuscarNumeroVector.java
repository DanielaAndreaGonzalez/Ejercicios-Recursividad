package ejercicios;

public class punto14_BuscarNumeroVector 
{

	public static void main(String[] args) 
	{
		int [] vector = {1,2,3,4,5,6,7};
		int n = vector.length-1;
		int objetivo = 6;
		int i = 0;
		
		buscarNumero(vector,n,objetivo,i);

	}

	private static void buscarNumero(int[] vector, int n, int objetivo, int i) 
	{
		if(vector[i] == objetivo)
		{
			System.out.print("El numero "+objetivo+" esta ubicado en la posicion numero: "+i);
		}
		else
		{
			buscarNumero(vector, n, objetivo, i+1); 
		}
		
	}

}
