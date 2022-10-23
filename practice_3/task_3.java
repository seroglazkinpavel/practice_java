package practice_3;

/*Реализовать алгоритм сортировки слиянием */

public class task_3 {
    public static void main(String[] args) {
        int[] arr = { 65, 6, 3, 9, 8, 7, 4, 2, 71 };
        mergeSort(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void mergeSort(int[] arr) {
        int n = arr.length;
        if (n == 1) {
            return;
        }
        int mid = n / 2;
        int[] l = new int[mid];
        int[] r = new int[n - mid];
        for (int i = 0; i < mid; i++) {
            l[i] = arr[i];
        }
        for (int i = mid; i < n; i++) {
            r[i - mid] = arr[i];
        }
        mergeSort(l);
        mergeSort(r);
        merge(arr, l, r);
    }

    public static void merge(int[] arr, int[] l, int[] r) {
        int left = l.length;
        int right = r.length;
        int i = 0;
        int j = 0;
        int idx = 0;

        while (i < left && j < right) {
            if (l[i] < r[j]) {
                arr[idx] = l[i];
                i++;
                idx++;
            } else {
                arr[idx] = r[j];
                j++;
                idx++;
            }
        }
        for (int ll = i; ll < left; ll++) {
            arr[idx++] = l[ll];
        }
        for (int rr = j; rr < right; rr++) {
            arr[idx++] = r[rr];
        }

    }

}
