package ejercicios;

public class punto09_SumarDiagonalMatriz 
{
	public static void main(String[] args) 
	{
		int [][] matriz = {{10,1,2},{3,10,4},{5,6,10}};
		int sumaTotal;
		int i = matriz.length-1, j = matriz.length-1;
		
		sumaTotal = sumarDiagonalMatriz(matriz,i,j);
		System.out.print("La suma de la diagonal es: " + sumaTotal);

	}

	private static int sumarDiagonalMatriz(int[][] matriz, int i, int j) 
	{
		if(i > 0)
		{
			if(j > 0)
			{
				if((i-1) == (j-1))
				{
					return matriz[i-1][j-1] + sumarDiagonalMatriz(matriz, i, --j);
				}
				else
				{
					return sumarDiagonalMatriz(matriz, i, --j);
				}
			}
			else
			{
				return sumarDiagonalMatriz(matriz, --i, j + matriz[i].length); 
			}
		}
		else
		{
			return 0;
		}
	}


}
