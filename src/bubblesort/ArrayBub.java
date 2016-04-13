package bubblesort;

public class ArrayBub {

    private long[] a; 
    private int nElems;
    public ArrayBub(int maxSize) {
	super();
	a= new long[maxSize];
	nElems = 0;
    }
    
    public void insert(long value) {
	a[nElems] = value;
	nElems++;
    }
    
    public void show() {
	for(int j= 0;j<nElems;j++) {
	    System.out.print(a[j]+" ");
	}
	System.out.println(" ");
    }
    /*//该方法为从前往后排
    public void bubbleSort() {
	int inner, outer;
	for(outer = nElems-1;outer>1;outer--)
	    for(inner=0;inner<outer;inner++)
		if(a[inner]>a[inner+1])
		    swap(inner,inner+1);
    }
    */
    //以下方法为从后往前排
    public void bubbleSort() {
	int inner,outer;
	for(inner=0;inner<nElems-1;inner++)
	    for(outer = nElems-1;outer>inner;outer--)
		if(a[outer]<a[outer-1])
		    swap(outer,outer-1);
    }
    
    public void swap(int value1,int value2) {
	long temp = a[value1];
	a[value1] = a[value2];
	a[value2] = temp;
    }
}
