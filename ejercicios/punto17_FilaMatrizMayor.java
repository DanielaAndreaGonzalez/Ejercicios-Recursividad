package ejercicios;

public class punto17_FilaMatrizMayor 
{
	static int mayor; 

	public static void main(String[] args) 
	{
		int [][] matriz = {{1,2,3},{4,5,6},{7,8,9},{10,11,12}};
		int i = matriz.length-1;
		int j = matriz.length-1;
		int filaMayor;
		
		filaMayor = calcularFilaMayor(matriz,i,j);
		System.out.print("La fila mayor es la " + filaMayor);
	}

	private static int calcularFilaMayor(int[][] matriz, int i, int j) {
		// TODO Auto-generated method stub
		return 0;
	}


}
