import sortingExamples.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /*
        * Arrays
        *
        * linear and binary search Example to find index of a value
        *
         */
        LinearAndBinarySortAlgo linearAndBinarySortAlgo = new LinearAndBinarySortAlgo();
//        linearAndBinarySortAlgo.runExample();

        /*
        * Bubble Sort Example
        */
        BubbleSortExample bubbleSortExample = new BubbleSortExample();
//        bubbleSortExample.runExample();

        /*
        Selection Sort Example

         */
        SelectionSortExample selectionSortExample = new SelectionSortExample();
//        selectionSortExample.runExample();

        /*
        Insertion sort Example

         */
        InsertionSortExample insertionSortExample = new InsertionSortExample();
//        insertionSortExample.runExample();

        /*
        Quick Sort Example
         */
        QuickSortExample quickSortExample = new QuickSortExample();
//        quickSortExample.runExample();

        /*
        Merge Sort Example
         */
        MergeSortExample mergeSortExample = new MergeSortExample();
        mergeSortExample.runExample();
    }



}