public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        int i = 1;
        while (i > 0) {
            System.out.println(i);
            i--;
        }
        while (i < arr.length) {
            System.out.println(arr[i]);
            i++;
        }
        i=1;
        do {
            System.out.println(arr[i]);
            i++;
        } while (i ==10);
    }
}
