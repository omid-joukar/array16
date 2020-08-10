import java.util.Arrays;

/**
 * Created by KPS on 8/10/2020.
 */
public class Main {
    public static void main(String[] args) {
        int[] ints = {1,2,2,3,4};
        int[] sub =new int[10];
        int k = 0 ;
        int i = 0;
        while (i < ints.length ) {
            if (addValue(ints[i] , sub)==true) {
                sub[k++] = ints[i];

            }
            i++;
        }
        System.out.println(Arrays.toString(sub));
    }
    public static boolean addValue(int value, int[] arrays){
        boolean val = true;
        for (int i = 0 ; i <arrays.length;i++){
            if (arrays[i] == value)val=false;
        }
        return val;
    }
}

