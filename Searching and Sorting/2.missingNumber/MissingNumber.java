public class MissingNumber {
    static int missingNumber(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correctIndex = arr[i];
            if (arr[i] < arr.length && arr[i] != arr[correctIndex]) {
                swap(arr, i, correctIndex);
            } else {
                i++;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != i) {
                return i;
            }
        }
        return arr.length;
    }
    static void swap(int[] arr,int start,int end){
        int temp = arr[start];
        arr[start] =arr[end];
        arr[end] =temp;
    }
}
}
