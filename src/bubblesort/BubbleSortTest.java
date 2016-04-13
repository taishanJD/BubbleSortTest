package bubblesort;

public class BubbleSortTest {

    /**
     * @param args
     */
    public static void main(String[] args) {
	// TODO Auto-generated method stub
	int maxSize = 100;
	ArrayBub arr = new ArrayBub(maxSize);
	
	arr.insert(23);
	arr.insert(12);
	arr.insert(33);
	arr.insert(33);
	arr.insert(45);
	arr.insert(0);
	arr.insert(6);
	arr.insert(78);
	arr.insert(5);
	
	arr.show();
	
	arr.bubbleSort();
	System.out.println("√∞≈›≈≈–Ú∫Û£∫");
	
	arr.show();
    }

}
