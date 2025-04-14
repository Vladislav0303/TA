import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] mass = {1, 5, 3, 56, 56, 34, 56};
        int min = mass[0];
        int max = mass.length;
        for(int i = 0; i < mass.length; i++) {
            if(mass[i] > max) {
                max = mass[i];
            }
            if(mass[i] == max) {
                mass[i] = min;
            }
        }
        System.out.println(Arrays.toString(mass));
    }
}
