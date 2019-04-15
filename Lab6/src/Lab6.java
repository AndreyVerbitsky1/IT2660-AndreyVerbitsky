
public class Lab6 {
	void merge(int Array[], int a, int b, int c) 
	{
		int n1 = b - a + 1; 
		int n2 = c - b; 
		
		int A[] = new int [n1]; 
		int B[] = new int [n2]; 
		
		for (int i=0; i<n1; ++i) 
			A[i] = Array[a + i]; 
		for (int j=0; j<n2; ++j) 
			B[j] = Array[b + 1+ j]; 

		int i = 0, j = 0; 

		int k = a; 
		while (i < n1 && j < n2) 
		{ 
			if (A[i] <= B[j]) 
			{ 
				Array[k] = A[i]; 
				i++; 
			} 
			else
			{ 
				Array[k] = B[j]; 
				j++; 
			} 
			k++; 
		} 

		while (i < n1) 
		{ 
			Array[k] = A[i]; 
			i++; 
			k++; 
		} 

		while (j < n2) 
		{ 
			Array[k] = B[j]; 
			j++; 
			k++; 
		} 
	} 

	void sort(int Array[], int a, int c) 
	{ 
		if (a < c) 
		{ 
			int b = (a+c)/2; 
			sort(Array, a, b); 
			sort(Array , b+1, c); 
			merge(Array, a, b, c); 
		} 
	} 

	static void printArray(int Array[]) 
	{ 
		int n = Array.length; 
		for (int i=0; i<n; ++i) 
			System.out.print(Array[i] + " "); 
		System.out.println(); 
	} 

	public static void main(String args[]) 
	{ 
		int Array[] = 
			{
				33, 61, 8, 93, 4, 25, 1, 50, 54, 62, 93, 27,
				39, 82, 4, 72, 77, 52, 75, 17, 15, 62, 5, 32, 16, 19, 
				55, 95, 54, 67, 66, 85, 58, 7, 69, 90, 68, 93, 10, 24,
				77, 62, 99, 86, 85, 19, 67, 11, 12, 28, 61, 27, 66, 27,
				82, 99, 13, 16, 22, 43, 88, 81, 77, 7, 53, 31, 67, 63,
				100, 76, 11, 34, 33, 11, 100, 13, 31, 96, 12, 47, 100,
				88, 94, 54, 69, 38, 66, 25, 41, 35, 11, 76, 65, 94,
				39, 56, 8, 91, 64, 56

			}; 
		
		System.out.println("Unsorted Array of 100 randomly generated numbers"); 
		printArray(Array); 

		Lab6 ob = new Lab6(); 
		ob.sort(Array, 0, Array.length-1); 
		
		System.out.println("\nSorted Array of 100 random generated numbers"); 
		printArray(Array); 
	} 
} 