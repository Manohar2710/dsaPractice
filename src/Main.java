import sortingExamples.*;
import sortingExamples.treeEx.TreeExample;

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
//        mergeSortExample.runExample();

        /*
        Linked List Example
         */
        LinkedListExample linkedListExample = new LinkedListExample();
        linkedListExample.add(1);
        linkedListExample.add(2);
        linkedListExample.add(3);

        linkedListExample.addFirst(4);

        linkedListExample.delete(3);
//        System.out.println(linkedListExample);


        /*
        Stack Example
         */
        StackExample stackExample = new StackExample();
//        stackExample.runExample();


        /*
        Queue Example
         */
        QueueExample queueExample = new QueueExample();
//        queueExample.runExample();

        TreeExample treeExample = new TreeExample();
        treeExample.runExample();
    }



}