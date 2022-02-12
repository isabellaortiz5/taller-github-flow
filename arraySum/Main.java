/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
    }

    public static int simpleArraySum(int[] ar) {
        
        int result = 0;

        for (int i : ar) {
            result = result + i;
        }

        return result;
    }
}