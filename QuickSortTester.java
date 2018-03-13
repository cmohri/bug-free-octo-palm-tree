public class QuickSortTester{

    public static int[] buildArray(int size){
	int[] retArr= new int [size];
	for(int i=0; i<s;i++){
	    retArr[i]=i;
	}
	return retArr;
    }
    public static void shuffle( int[] d ) {
	int tmp;
	int swapPos;
	for( int i = 0; i < d.length; i++ ) {
	    tmp = d[i];
	    swapPos = i + (int)( (d.length - i) * Math.random() );
	    swap( i, swapPos, d );
	}
    }
    public static void main (String[] args){

    }

}
