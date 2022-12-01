package ejercicios;

public class punto11_SumarElemtosMatriz 
{
	public static void main(String[] args) 
	{
		int suma;
		int [][] matriz = new int [3][3];
		matriz[0][0] = 1;
		matriz[0][1] = 1;
		matriz[0][2] = 1;
		
		matriz[1][0] = 1;
		matriz[1][1] = 1;
		matriz[1][2] = 1;
		
		matriz[2][0] = 1;
		matriz[2][1] = 1;
		matriz[2][2] = 1;
		
		int i = 0;
		int j = matriz[0].length;
		
		suma = sumarElementos(matriz,i,j);
		System.out.print("La suma de los elementos es: " + suma);
	}

	private static int sumarElementos(int[][] matriz, int i, int j) 
	{
		if(i != matriz.length)
		{
			if(j > 0)
			{
				System.out.print(matriz[i][j - 1] + "\n");
				return matriz[i][j-1] + sumarElementos(matriz, i, --j);
			}
			else
			{
				j = matriz[i].length;
				return sumarElementos(matriz, ++i, j);
			}
		}
		else
		{
			return 0;
		}
	}
	
	

}
