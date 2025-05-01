package nl.um.dacs.lecture8;

public class ArraySumCalculator {

    public static int calculateSum(int[] numbers){
        int total = 0;
        for (int i = 0; i <= numbers.length; i++){
            total += numbers[i];
        }
        return total;
    }

    public static void main(String[] args) {
        int[] numbers = {2, 4, 5, 6};
        int sum = calculateSum(numbers);
        System.out.println(sum);
    }
}
