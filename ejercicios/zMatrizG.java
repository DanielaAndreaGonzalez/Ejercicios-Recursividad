  package ejercicios;

public class zMatrizG 
{

	public static void main(String[] args) 
	{
		String[][] matriz = new String[2][2];
		matriz[0][0] = "1";
		matriz[0][1] = "2";
		matriz[1][0] = "3";
		matriz[1][1] = "4";

		String[][] matriz2 = new String[2][3];
		matriz2[0][0] = "1";
		matriz2[0][1] = "2";
		matriz2[0][2] = "3";

		matriz2[1][0] = "4";
		matriz2[1][1] = "5";
		matriz2[1][2] = "6";

		imprimirMatriz(matriz, 0, 0);
		System.out.println();

		String[][] matrizNew = girarMatriz(matriz, -1, matriz.length, matriz[0].length);

		imprimirMatriz(matrizNew, 0, 0);

	}
	
	private static void imprimirMatriz(String[][] matrizNew, int i, int j)
	{
		if(i < matrizNew.length)
		{
			if(j < matrizNew[0].length)
			{
				System.out.print(matrizNew[i][j] + " ");
				j += 1;
			}
			else
			{
				j = 0;
				i += 1;
				System.out.println();
			}

			imprimirMatriz(matrizNew, i, j);

		}

	}

	public static String[][] girarMatriz(String[][] matriz, int giros, int sizeFilas, int sizeColumnas)
	{
		if(giros == 0)
		{
			return matriz;
		}
		else
		{
			if(giros > 0)
			{
				matriz = rotarMatriz(matriz, new String[sizeFilas][sizeColumnas], giros, sizeFilas, sizeColumnas, 0, 0);
				return girarMatriz(matriz, giros - 1, sizeFilas, sizeColumnas);
			}
			else
			{
				matriz = rotarMatriz(matriz, new String[sizeFilas][sizeColumnas], giros, sizeFilas, sizeColumnas, 0, 0);
				return girarMatriz(matriz, giros + 1, sizeFilas, sizeColumnas);
			}
		}
	}

	public static String[][] rotarMatriz(String[][] matriz,String[][] nuevaMatriz, int giros, int sizeFilas, int sizeColumnas,int i, int j)
	{
		if(i < sizeFilas)
		{
			if(j < sizeColumnas)
			{
				if(giros > 0)
				{
					nuevaMatriz[j][sizeColumnas - i - 1] = matriz[i][j];
				}
				else
				{
					nuevaMatriz[sizeFilas - 1 - j][i] = matriz[i][j];
				}

				j += 1;
				return rotarMatriz(matriz, nuevaMatriz, giros, sizeFilas, sizeColumnas, i, j);
			}

			j = 0;
			i += 1;

			return rotarMatriz(matriz, nuevaMatriz, giros, sizeFilas, sizeColumnas, i, j);
		}

		return nuevaMatriz;

	}

}
