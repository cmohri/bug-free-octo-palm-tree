//Clara Mohri
//APCS2 pd08
//HW18 -- QuickSort
//2018-03-13t
  
/*****************************************************
 * class QuickSort
 * Implements quicksort algo to sort an array of ints in place
 *
 * 1. Summary of QuickSort algorithm:
 * QSort(arr): 
 *    - Sort a random item in the array, using partition
 *    - If possible, sort a random item on the left side of the first random item
 *    - If possible, sort a random item on the right side of the first random item
 *    - Keep going until the left and right converge
 * 2a. Worst pivot choice and associated runtime: 
 *    - The pivot choice is at one of the ends of the array
 *    - Associated running time: O(n*n) 
 * 2b. Best pivot choice and associated runtime:
 *    - The pivot choice is at the first place checked– this means, the mean of and and b
 *    - Associated running time: O(n)  
 * 3. Approach to handling duplicate values in array:
 *    - I'm not sure how this works, but when I ran my code on duplicate values, the lists were sorted. All numbers to the left of the pivot point after a swap in partition are strictly less than the pivot point value, so maybe the reason that it works is that then will not look at that pivot point again, and will only look at the other values.
 *****************************************************/

public class QuickSort
{
    //--------------v  HELPER METHODS  v--------------
    //swap values at indices x, y in array o
    public static void swap( int x, int y, int[] o ) {
	int tmp = o[x];
	o[x] = o[y];
	o[y] = tmp;
    }
    
    //print input array 
    public static void printArr( int[] a ) {
	for ( int o : a )
	    System.out.print( o + " " );
	System.out.println();
    }
    
    //shuffle elements of input array
    public static void shuffle( int[] d ) {
	int tmp;
	int swapPos;
	for( int i = 0; i < d.length; i++ ) {
	    tmp = d[i];
	    swapPos = i + (int)( (d.length - i) * Math.random() );
	    swap( i, swapPos, d );
	}
    }
    
    //return int array of size s, with each element fr range [0,maxVal)
    public static int[] buildArray( int s, int maxVal ) {
	int[] retArr = new int[s];
	for( int i = 0; i < retArr.length; i++ )
	    retArr[i] = (int)( maxVal * Math.random() );
	return retArr;
    }
    //--------------^  HELPER METHODS  ^--------------
    
    /***************************************************
     * int partition(int[] , int , int )
     * Within the range of a to be in arr, partition chooses a pivot point that is the mean of a and b, called c. c is placed in its FRP, and the number of items smaller than it is returned.
     ***************************************************/
    public static int partition( int arr[], int a, int b)
    {
	int c = (int)Math.random()*(a-b) + a;
        int v = arr[c];

        swap( c, b, arr);
        int s = a;

        for( int i = a; i < b; i++ ) {
            if ( arr[i] <= v) {
                swap( i, s, arr );
                s++;
	    }
        }
        swap(s,b,arr);

        return s;
    }//end partition 
	
    

    /*****************************************************
     * void qsort(int[])
     * @param d -- array of ints to be sorted in place
     *****************************************************/
    public static void qsort( int[] d )
    { 
	helper(d, 0, d.length-1);
    }
    
    /*****************************************************
     * void helper(int[], int, int)
     * int[] arr -- array of ints to be sorted in place
     * int left -- left bound for sorting
     * int right -- right bound for sorting
     *****************************************************/
    public static void helper(int[] arr, int left, int right){
	if (left < right){
	    int pvtPos = partition(arr, left, right);
	    helper(arr, left, pvtPos - 1);
	    helper(arr, pvtPos + 1, right);
	}
    }
    
    //main method for testing
    public static void main( String[] args )
    {
	
	//get-it-up-and-running, static test case:
	int [] arr1 = {7,1,5,12,3};
	System.out.println("\narr1 init'd to: " );
	printArr(arr1);
	
	qsort( arr1 );	
	System.out.println("arr1 after qsort: " );
	printArr(arr1);
	
	// randomly-generated arrays of n distinct vals
	int[] arrN = new int[10];
	for( int i = 0; i < arrN.length; i++ )
	    arrN[i] = i;
	
	System.out.println("\narrN init'd to: " );
	printArr(arrN);
	
	shuffle(arrN);
	System.out.println("arrN post-shuffle: " );
	printArr(arrN);
	
	qsort( arrN );
	System.out.println("arrN after sort: " );
	printArr(arrN);
	  
	//get-it-up-and-running, static test case w/ dupes:
	int [] arr2 = {7,1,5,12,3,7};
	System.out.println("\narr2 init'd to: " );
	printArr(arr2);
	
	qsort( arr2 );	
	System.out.println("arr2 after qsort: " );
	printArr(arr2);
	
	// arrays of randomly generated ints
	int[] arrMatey = new int[20];
	for( int i = 0; i < arrMatey.length; i++ )
	    arrMatey[i] = (int)( 48 * Math.random() );
	
	System.out.println("\narrMatey init'd to: " );
	printArr(arrMatey);
	
	shuffle(arrMatey);
	System.out.println("arrMatey post-shuffle: " );
	printArr(arrMatey);
	
	qsort( arrMatey );
	System.out.println("arrMatey after sort: " );
	printArr(arrMatey);

	
    }//end main
    
}//end class QuickSort
