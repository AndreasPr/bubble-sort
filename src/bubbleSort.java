/**
 * Created on 07/Jan/2021 to Bubble-Sort
 */
public class bubbleSort {

    public static void bubbleSortAlgorithm(int[] arrayForSorting){

        boolean swapped;
        int temp;

        for(int j = 0; j < arrayForSorting.length - 1; j++){
            swapped = false;
            for(int i = 0; i < arrayForSorting.length - j - 1; i++){
                if(arrayForSorting[i] > arrayForSorting[i+1]) {
                    temp = arrayForSorting[i];
                    arrayForSorting[i] = arrayForSorting[i + 1];
                    arrayForSorting[i + 1] = temp;
                    swapped = true;
                }
            }
            if(swapped == false){
                break;
            }
        }
    }

    private static void printArray(int[] arrayForSorting){
        for(int i = 0; i<arrayForSorting.length; i++){
            System.out.println(arrayForSorting[i]);
        }
    }

    public static void main(String args[]){
        int[] arrayForSorting = {7,1,23,110,3,0,9,4,5};
        bubbleSortAlgorithm(arrayForSorting);
        printArray(arrayForSorting);
    }
}
