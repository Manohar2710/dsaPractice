package sortingExamples;

public class QuickSortExample {
    public void runExample() {
        int[] randomListOfNums = {7, 1, 3, 5, 6, 9, 4, 2};
        System.out.println("Numbers before Sort");
        for(int num: randomListOfNums) {
            System.out.print(num+" ");
        }
        /*
        Sorting Logic

        pseudo code
        function to get pivot point
        getPivotIndex(array, lowIndex, highIndex){
        array

        for(int j = 0 ; j < array.len - 1; j ++){ // j = 0
            if(array[j] < array[highIndex]) {. //
             lowIndex++
             swap(array[lowIndex], array[j])
            }
        }
        swap(array[lowIndex + 1], array[highIndex])
        return lowIndex + 1
        }

        recursive function
        sortArray(arr, low, high) {
            if(low < high){
                pivotIndex = getPivotIndex(arr, low, pi-11)
                sortArray(arr, low, pivotIndex - 1)
                sortArray(arr, pivotIndex+1, high)
            }
        }

         */
        runQuickSortAlgo(randomListOfNums, 0, randomListOfNums.length - 1);

        System.out.println();
        System.out.println("Numbers after Sort");
        for(int num: randomListOfNums) {
            System.out.print(num+" ");
        }
    }

    private void runQuickSortAlgo(int[] randomListOfNums, int lowIndex, int highIndex) {
        if(lowIndex < highIndex) {
            int pivotIndex = getPivotIndex(randomListOfNums, lowIndex, highIndex);
            runQuickSortAlgo(randomListOfNums, lowIndex, pivotIndex - 1);
            runQuickSortAlgo(randomListOfNums, pivotIndex + 1, highIndex);
        }
    }

    public int getPivotIndex(int[] arr, int lowIndex, int highIndex) {
        int i = lowIndex - 1;
        int pivot = arr[highIndex];
        for(int j = lowIndex; j < highIndex; j++){
            if(arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i+1];
        arr[i+1] = arr[highIndex];
        arr[highIndex] = temp;
        return i + 1;
    }
}
