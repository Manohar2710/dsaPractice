package sortingExamples;

public class InsertionSortExample {

    public void runExample() {
        int[] randomNums = {6,3,7,3,7,2,7,1};
        System.out.println("List before sorting");
        for(int num: randomNums){
            System.out.print(num+" ");
        }

        insertionSortFunction(randomNums);
        System.out.println();
        System.out.println("List after sort");
        for(int num: randomNums){
            System.out.print(num+" ");
        }
    }
    /*
    for(i = 1 , i < size ; i ++) //3

    j = i - 1; // 2
    key = nums[i] key = 3
    while (nums[j] > key && j >= 0) { 6 > 3 && 1 >= 0
        nums[j+1] = nums[j]; num[1] = nums[0]
        nums[j] = key
        j-- // j = -1
    }
     */
    private void insertionSortFunction(int[] randomNums) {
        int size = randomNums.length;
        for (int i = 1; i < size; i++) {
            int j = i - 1;
            int key = randomNums[i];
            while( j >= 0 && randomNums[j] > key ) {
                randomNums[j + 1] = randomNums[j];
                randomNums[j] = key;
                j--;
            }
        }
    }
}
