package javaPodstawyProgramowanie;

public class Task7getResult {
    int index;
    public static void main(String[] args) {

    }

    public static int getResult (int index){
        int[] array = new int[index];
        for (int i = 0; i < index; i++) {
            if (i < 2) {
                array[i] = 1;
            } else {
                array[i] = array[i - 1] + array[i - 2];
            }
        }
        int result = array[index - 1];
        return result;
    }
}
