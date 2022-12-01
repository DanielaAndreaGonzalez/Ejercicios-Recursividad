package ejercicios;

public class punto16_MatrizSimetricaNoSimetrica 
{

	public static void main(String[] args) 
	{
		int [][] matriz = {{1,2,3},{4,5,6},{7,8,9},{10,11,12}};
		int i = 0, j = 0;
		
		
		
		System.out.print("La matriz es simetrica? R/ " + esMatrizSimetrica(matriz,i,j));
	}

	private static boolean esMatrizSimetrica(int[][] matriz, int i, int j)
	{
		if(matriz.length == matriz[0].length)
		{
			boolean resultado = matriz[i][j] == matriz[j][i];
			if(resultado)
			{
				j += 1;
				if(j == matriz[0].length)
				{
					j = 0;
					i += 1;
				}

				if(i < matriz.length)
				{
					return esMatrizSimetrica(matriz, i, j);
				}
			}

			return resultado;
		}

		return false;

	}

}
