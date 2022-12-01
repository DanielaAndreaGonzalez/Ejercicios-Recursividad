package ejercicios;

public class z2 
{

	public static void main(String[] args) 
	{
		int [][] matriz = {{10,1,2},{3,10,4},{5,6,10}};
		int i = 0;
		int j = 0;
		int suma;
		
		suma = sumaMatriz(matriz,i,j);
		System.out.print("La suma de la diagonal es: "+suma);

	}

	private static int sumaMatriz(int[][] matriz, int i, int j) 
	{
		if(i <= matriz.length-1)
		{
			if(j <= matriz.length-1)
			{
				if((i) == (j))
				{
					return matriz[i][j] + sumaMatriz(matriz, i, ++j);
				}
				else
				{
					return sumaMatriz(matriz, i, ++j);
				}
			}
			else
			{
				j = matriz[i].length;
				return sumaMatriz(matriz, ++i, j);
			}
		}
		else
		{
			return 0;
		}
	}

}
