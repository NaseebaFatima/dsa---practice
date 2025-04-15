class MoveZeroes {
    public static void movezeroEnd(int n, int arr[]) {
        int j = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                arr[j] = arr[i];
                j++;
            }
        }
        while (j < n) {
            arr[j] = 0;
            j++;
        }
    }

    public static void main(String[] args) {
        int arr[] = {0, 1, 0, 3, 12};
        int n = arr.length;
        movezeroEnd(n, arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
