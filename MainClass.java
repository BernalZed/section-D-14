
package mainclass;


public class MainClass {

   public static void main(String[] args) {
        int[] array = {12, 4, 7, 9, 1, 3, 10};
        
        
        BubbleSort bubbleSort = new BubbleSort();
        
        System.out.println("Original Array:");
        bubbleSort.printArray(array);
        
        
        bubbleSort.sortArray(array);
        
        System.out.println("Sorted Array:");
        bubbleSort.printArray(array);
    }
}

    

