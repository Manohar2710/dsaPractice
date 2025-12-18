package sortingExamples;

public class BubbleSortExample {

    public void runExample(){
        int[] listOfNumbers = {2,5,8,1,2,3,5,9,2};
        int size = listOfNumbers.length;
        System.out.println("numbers before sorting");
        for(int num: listOfNumbers){
            System.out.print(num+ " ");
        }

        /*
        * Sorting logic
        *
         */
        for(int i = 0; i < size; i++ ) {
            for(int j = 0; j < size - i - 1; j++) {
                if(listOfNumbers[j] > listOfNumbers[j+1]) {
                    int temp = listOfNumbers[j];
                    listOfNumbers[j] = listOfNumbers[j+1];
                    listOfNumbers[j+1] = temp;
                }
            }
        }

        System.out.println();
        System.out.println("numbers after sorting");
        for(int num: listOfNumbers){
            System.out.print(num+ " ");
        }
    }
}
