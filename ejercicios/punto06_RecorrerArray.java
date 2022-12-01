package ejercicios;

public class punto06_RecorrerArray 
{
	public static void main(String[] args) 
	{
		int [] array = {1,2,3,4,5};
		mostrarRecorridoArray(array,0);
	}

	private static void mostrarRecorridoArray(int[] array, int i) 
	{
		if(i == array.length-1)
		{
			System.out.print("Valor de la posicion " + i + " es: " + array[i] + "\n");
		}
		else
		{
			System.out.print("Valor de la posicion " + i + " es: " + array[i] + "\n");
			mostrarRecorridoArray(array, i + 1);
		}
		
	}

}
