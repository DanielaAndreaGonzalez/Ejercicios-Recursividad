package ejercicios;

public class punto13_SumarDiagonalMatrizAvanzandoColum 
{

	public static void main(String[] args) 
	{
		int [][] matriz = new int [3][3];
		
		matriz[0][0] = 6;
		matriz[0][1] = 2;
		matriz[0][2] = 3;
		
		matriz[1][0] = 4;
		matriz[1][1] = 5;
		matriz[1][2] = 6;
		
		matriz[2][0] = 7;
		matriz[2][1] = 8;
		matriz[2][2] = 9;
		
		int i = 0;
		int j = 0;
		int suma;
		
		suma = sumarDiagonalFinalInicio(matriz,i,j);
		System.out.print("La suma de la diagonal es: " + suma);

	}

	private static int sumarDiagonalFinalInicio(int[][] matriz, int i, int j)
	{
		if(i >= 0)
		{
			if(j >= 0)
			{
				if(i == j)
				{
					return sumarDiagonalFinalInicio(matriz, i, j - 1) + matriz[i][j];
				}
				j -= 1;

			}
			else
			{
				j = matriz[0].length;
				i -= 1;
			}

			return sumarDiagonalFinalInicio(matriz, i, j);
		}
		return 0;

	}

}
