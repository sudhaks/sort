import java.util.Arrays;

public class sorter {
        public static void main(String[] args)  throws Exception {
            int a[] = {6, 7, 1, 2, 4, 5, 3};
            System.out.println("input array = " + Arrays.toString(a));
            int temp;
            for (int j = 0; j < a.length - 1; j++) {
                for (int i = 1; i < a.length; i++) {

                    if (a[i - 1] > a[i]) {
                        temp = a[i - 1];
                        a[i - 1] = a[i];
                        a[i] = temp;
                    }
                }//System.out.println("Sorted array = "+j+ "\t" + Arrays.toString(a));
            }
            System.out.println("Sorted array = " + Arrays.toString(a) +
                    "median = " + a[a.length / 2]);
        }
}
