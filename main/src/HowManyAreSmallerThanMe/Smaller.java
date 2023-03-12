package HowManyAreSmallerThanMe;

import java.util.concurrent.atomic.AtomicIntegerArray;

public class Smaller {
    /*
    The first solution is based on the merge sort algorithm, which has an average and worst-case time complexity of O(n*log(n)),
    where n is the length of the input array. This is because the merge sort algorithm divides the array into halves recursively,
    and then combines the sorted halves back into a single sorted array.

    The second solution has a time complexity of O(n^2), where n is the length of the input array. This is because it uses a nested loop
    to compare each element in the array to all the following elements and increment a counter if the following element is smaller.
    This results in a time complexity of O(n^2) since the inner loop is executed n times for each element in the array.

    Therefore, the first solution based on merge sort is better in terms of time complexity since it has a better worst-case time complexity of O(n*log(n)).
     */
    public static int[] smaller(int[] unsorted) {
        int n = unsorted.length;
        int[] result = new int[n];
        int[] indexes = new int[n];
        for (int i = 0; i < n; i++) {
            indexes[i] = i;
        }
        mergeSort(unsorted, indexes, result, 0, n - 1);
        return result;
    }

    private static void mergeSort(int[] arr, int[] indexes, int[] result, int left, int right) {
        if (left >= right) {
            return;
        }
        int mid = left + (right - left) / 2;
        mergeSort(arr, indexes, result, left, mid);
        mergeSort(arr, indexes, result, mid + 1, right);
        merge(arr, indexes, result, left, mid, right);
    }

    private static void merge(int[] arr, int[] indexes, int[] result, int left, int mid, int right) {
        int i = left;
        int j = mid + 1;
        int k = 0;
        int[] merged = new int[right - left + 1];
        while (i <= mid && j <= right) {
            if (arr[indexes[i]] <= arr[indexes[j]]) {
                result[indexes[i]] += j - mid - 1;
                merged[k++] = indexes[i++];
            } else {
                merged[k++] = indexes[j++];
            }
        }
        while (i <= mid) {
            result[indexes[i]] += j - mid - 1;
            merged[k++] = indexes[i++];
        }
        while (j <= right) {
            merged[k++] = indexes[j++];
        }
        for (i = 0; i < k; i++) {
            indexes[left + i] = merged[i];
        }
    }
}


/*

MY APPROACH (Fuck Time complexity)

public static int[] smaller(int[] unsorted) {
        int[] counts = new int[unsorted.length];
        for (int i = 0; i < unsorted.length; i++) {
            int num = unsorted[i];
            AtomicIntegerArray count = new AtomicIntegerArray(counts);
            int counter = 0;
            for (int j = i + 1; j < unsorted.length; j++) {
                int nextElement = unsorted[j];
                if (num > nextElement) counter++;
            }
            counts[i] = counter;
        }
        return counts;
    }
 */