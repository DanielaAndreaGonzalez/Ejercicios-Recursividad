package ejercicios;

public class punto08_RecorrerMatriz 
{

	public static void main(String[] args) 
	{
		int [][] matriz = {{1,2,3},{4,5,6},{7,8,9}};
		int i = 0 , j = 0;
		
		recorrerMatriz(matriz,i,j);

	}

	private static void recorrerMatriz(int[][] matriz, int i, int j)
	{
		
		System.out.print(matriz[i][j] + " ");
		
		if(i != matriz.length - 1 || j != matriz[i].length - 1)
		{
			if(j == matriz[i].length-1)
			{
				i++;
				j = 0;
				System.out.print("");
			}
			else
			{
				j++;
			}
			
			recorrerMatriz(matriz, i, j);
		}
		
	}

}
