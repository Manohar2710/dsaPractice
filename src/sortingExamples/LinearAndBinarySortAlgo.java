package sortingExamples;

public class LinearAndBinarySortAlgo {
    public void runExample() {
        int[] exampleArray = {1,2,3,4,5,6,7,8,9,10};
        int target = 5;
        /*
         * Arrays
         *
         * linear search Example to find index of a value
         *
         */
        LinearAndBinarySortAlgo linearAndBinarySortAlgo = new LinearAndBinarySortAlgo();
        int liearResult =  linearAndBinarySortAlgo.performLinearSearch(exampleArray, target);
        if(liearResult == -1 ){
            System.out.println("Linear search:target not found");
        } else {
            System.out.println("Linear search: target found at index "+ liearResult);
        }

        /*
         * binary search example
         *
         */
        int binaryResult = linearAndBinarySortAlgo.performBinarySearch(exampleArray, target, 0, exampleArray.length -1);
        if(binaryResult == -1 ){
            System.out.println("Binary search: target not found");
        } else {
            System.out.println("Binary search: target found at index "+ binaryResult);
        }
    }
    public int performBinarySearch(int[] exampleArray, int target, int left, int right) {

        int result = -1;
        int mid = (left+right)/2;
        // return result if mid index value equals target
        if(exampleArray[mid] == target){
            return mid;
            // return result if left equals right
        } else if(left == right) {
            return result;
        }
        // return recursive function with right index updated with mid - 1
        else if (exampleArray[mid] > target) {
            return performBinarySearch(exampleArray, target, left, mid-1);
            // return recursive function with left index updated with mid + 1
        } else {
            return performBinarySearch(exampleArray, target, mid+1, right);
        }

    }

    public int performLinearSearch(int[] exampleArray, int target) {
        int result = -1;
        for(int i = 0; i < exampleArray.length ; i++) {
            if(exampleArray[i] == target){
                return i;
            }
        }
        return result;

    }
}
