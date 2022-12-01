package ejercicios;

public class punto15_PromedioElementos {

	public static void main(String[] args) 
	{
		double [][] matriz = {
				{8, 3, 1},
				{3, 11, 6},
				{2, 6, 9}};
		int i = 0;
		int j = 0;
		
		
		System.out.println("el promedio de los elementos de la diagonal es: " + promedioElementosDiagonal(matriz, i, j));

	}
	
	private static double promedioElementosDiagonal(double[][] matriz, int i, int j)
	{
		if (i<matriz.length)
		{
			if (j<matriz.length)
			{
				if(i==j)
				{
					return (matriz[i][j])/matriz.length + promedioElementosDiagonal(matriz, i, j+1);
				}
				else
				{
					return promedioElementosDiagonal(matriz, i, j+1);
				}
			}
			else
			{
				return promedioElementosDiagonal(matriz, i+1, j-matriz.length);
			}
		}
		return 0;
	}

}
