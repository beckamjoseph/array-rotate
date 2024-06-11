public class array{
    public static void main(String[] args) {
        int a[] = {100, 200, 500, 600, 800, 700};
        int d = 5;

        int result[] = rotateLeft(a, d);

        for (int num : result) {
            System.out.print(num + " ");
        }
    }

    public static int[] rotateLeft(int[] a, int d) {
        int n = a.length;
        d = d % n;

        int[] rotatedArray = new int[n];

        for (int i = d; i < n; i++) {
            rotatedArray[i - d] = a[i];
        }
        
        for (int i = 0; i < d; i++) {
            rotatedArray[n - d + i] = a[i];
        }

        return rotatedArray;
    }
}
