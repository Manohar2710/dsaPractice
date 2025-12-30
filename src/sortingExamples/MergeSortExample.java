package sortingExamples;

public class MergeSortExample {
    public void runExample() {
        int[] arrayOfNumbers = {7,5,3,1,2,7,9,10};
        System.out.println("Array before sorting");
        for(int num: arrayOfNumbers) {
            System.out.print(num+" ");
        }

        /*
        pseudocode
        mergeSort function(ar, l, r) {
            if(l<r){
                mid = l+r/2;
                mergeSort(ar, l , mid )
                mergeSort(ar, mid+1, r)

                merge(ar, l, mid, r)

            }

        }
        merge function(arr, l , mid, r) {
            arrLSize = mid - l + 1;
            arrRSize = r - mid;

            int[] arrL = int[ arrLSize ]
            int arrR = int[arrRSize]

            for(int x = 0 ; x < arrLSize ; x++){
                arrL[x] = arrL[x+l]
            }
            for(int x = 0; x < arrRSize ; x++) {
                arrR[x] = arrR[x+mid+1];
            }

            k = l
            i = 0
            j = 0
            while(i < arrLSize && j < arrRSize) {
                if(arrL[i] < arrR[j]) {
                    arr[k] = arrL[i]
                    i++
                } else {
                    arr[k] = arrR[j]
                    J++
                }
                K++
            }
            while(i<arrLSize) {
                arr[k] = arrL[i]
                i++;
                k++;
            }
            while(j<arrRSize) {
                arr[k] = arr[j]
                j++;
                k++;
            }

        }
         */
        mergeSort(arrayOfNumbers, 0, arrayOfNumbers.length-1);

        System.out.println();
        System.out.println("Array after sort");
        for(int num: arrayOfNumbers) {
            System.out.print(num+" ");
        }

    }

    private void mergeSort(int[] arrayOfNumbers, int l, int r) {
        if(l < r) {
            int mid = (l+r)/2;
            mergeSort(arrayOfNumbers, l, mid);
            mergeSort(arrayOfNumbers, mid+1, r);
            mergeArray(arrayOfNumbers, l, mid, r);
        }
    }
    private void mergeArray(int[] arrayOfNumbers, int l, int mid, int r) {
        int arrLSize = mid - l + 1;
        int arrRSize = r - mid;
        int[] arrL = new int[arrLSize];
        int[] arrR = new int[arrRSize];

        for(int x = 0; x < arrLSize ; x++) {
            arrL[x] = arrayOfNumbers[x+l];
        }
        for(int x = 0; x < arrRSize ; x++) {
            arrR[x] = arrayOfNumbers[x+mid+1];
        }
        int i = 0;
        int j = 0;
        int k = l;
        while(i<arrLSize && j<arrRSize) {
            if(arrL[i] < arrR[j]) {
                arrayOfNumbers[k] = arrL[i];
                i++;
            } else {
                arrayOfNumbers[k] = arrR[j];
                j++;
            }
            k++;
        }
        while(i < arrLSize) {
            arrayOfNumbers[k] = arrL[i];
            i++;
            k++;
        }
        while(j < arrRSize) {
            arrayOfNumbers[k] = arrR[j];
            j++;
            k++;
        }
    }
}
