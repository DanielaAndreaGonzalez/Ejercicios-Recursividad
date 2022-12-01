package ejercicios;

public class z1 
{

	public static void main(String[] args)
	{
		int numEvaluado = 6;
		int i = 1;
		int resultado;
		
		resultado = sumar(numEvaluado,i);
		evaluarNumPerfec(resultado, numEvaluado);
		

	}


	private static void evaluarNumPerfec(int resultado, int numEvaluado) 
	{
		if(resultado == numEvaluado)
		{
			System.out.print("Es un numero perfecto, la suma de los divisores es: " + resultado);
		}
		else
		{
			System.out.print("No es un numero perfecto la suma de los divisores es: " + resultado);
		}
		
	}


	private static int sumar(int numEvaluado, int i) 
	{
		if(i != numEvaluado)
		{
			if(numEvaluado%i == 0)
			{
				return sumar(numEvaluado, i+1)+i;
			}
			else
			{
				return sumar(numEvaluado, i+1);
			}
		}
		else
		{
			return 0;
		}
	}

	



}
