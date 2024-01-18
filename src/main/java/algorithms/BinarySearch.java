package algorithms;

public class BinarySearch {
    public static void main(String[] args) {
        int result = binSearch(3, new int[]{1,2,3,4,5,6,7,8,9});
        System.out.println(result);
    }

    public static int binSearch(int searchNum, int[] arr) {
        int index = arr.length/2;
        int searchIndex = -1;
        int result = 0;

        while (result != searchNum) {
            result = arr[index];
            if(searchNum < arr[index]) {
                for (int i=0;i <= arr.length/2;i++) {
                    if(arr[i] == searchNum) {
                        searchIndex = i;
                        result = searchNum;
                    }
                }
            } else {
                for (int i= arr.length/2;i <= arr.length -1;i++) {
                    if(arr[i] == searchNum) {
                        searchIndex = i;
                        result = searchNum;
                    }
                }
            }
        }

        return searchIndex;
    }
}
