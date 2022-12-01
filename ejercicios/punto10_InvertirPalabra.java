package ejercicios;

public class punto10_InvertirPalabra 
{

	public static void main(String[] args) 
	{
		String palabra = "Juan Manuel";
		
		
		System.out.print(invertirPalabra(palabra,palabra.length()-1));

	}

	private static String invertirPalabra(String palabra, int longitud)
	{
		if(longitud == 0)
		{
            return palabra.charAt(longitud)+"";
        }
		else
		{
            return palabra.charAt(longitud) + (invertirPalabra(palabra, longitud-1));
        }
	}



}
