package sortingExamples;

public class SelectionSortExample {
    public void runExample(){
        int[] numListToSort = {7,4,2,8,2,8,9,3,5};
        int listSixe = numListToSort.length;
        System.out.println("List before sorting");
        for(int num: numListToSort){
            System.out.print(num+" ");
        }
        /*
        Sorting algorithm
         */
        for(int i = 0; i < listSixe - 1; i++ ) {
            int minNumIndex = i;
            for(int j = i+1; j < listSixe ; j++){
                if(numListToSort[minNumIndex] > numListToSort[j]) {
                    minNumIndex = j;
                }
            }
            int tempNum = numListToSort[i];
            numListToSort[i] = numListToSort[minNumIndex];
            numListToSort[minNumIndex] = tempNum;
        }

        System.out.println();
        System.out.println("List After Sort");
        for (int num: numListToSort){
            System.out.print(num+ " ");
        }
    }
}
