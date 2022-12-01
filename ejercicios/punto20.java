package ejercicios;

import java.util.Arrays;

public class punto20 
{
	public static void main(String[] args) {

		int arr[] = {64, 34, 25, 12, 22, 11, 90};

		arregloAscendiente(arr, arr.length);

        System.out.println("El arreglo de forma ascendiente es : ");
        System.out.println(Arrays.toString(arr));
}
	static void arregloAscendiente(int arr[], int n)
    {
        // Base case
        if (n == 1)
            return;

        for (int i=0; i<n-1; i++)
            if (arr[i] > arr[i+1])
            {
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }

        arregloAscendiente(arr, n-1);
    }

}
