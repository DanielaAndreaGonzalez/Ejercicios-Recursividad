package ejercicios;

public class punto12_Potencia 
{

	public static void main(String[] args) 
	{
		int base = 5;
		int potencia = 3;
		int resultado;
		
		resultado = calcularPotencia(base,potencia);
		System.out.print("El resultado de la potencia es: " + resultado);

	}

	private static int calcularPotencia(int base, int potencia) 
	{
		if(potencia == 1)
		{
			return base;
		}
		else
		{
			return calcularPotencia(base, potencia - 1)*base;
		}
	}

}
