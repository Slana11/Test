public class SumArray {

    public static void main(String[] args) {
        int [] array = {1,4,6,9};

        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        System.out.println("Total is " + sum);

        int average = 5;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        System.out.println("Average value is " + average);
    }
}