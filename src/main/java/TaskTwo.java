public class TaskTwo {
    public int sumDigitNumber(int number) {

        if (number < 0) number *= (-1);
        int sum = 0;
        while (number != 0) {
            sum += number % 10;
            number /= 10;
        }

        return sum;


    }
}
