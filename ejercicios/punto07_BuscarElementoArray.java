package ejercicios;

public class punto07_BuscarElementoArray 
{

	public static void main(String[] args) 
	{
		int [] array = {1,2,3,4,5,6,7,8,9};
		int buscado = 7;

		buscarElemento(array,buscado,0);
	}

	private static void buscarElemento(int[] array, int buscado, int i) 
	{
		if(buscado == array[i])
		{
			System.out.print("El valor buscado se escuentra en la posicion num " + i + " del arreglo");
		}
		else
		{
			buscarElemento(array, buscado, i+1);
		}
		
	}




}
