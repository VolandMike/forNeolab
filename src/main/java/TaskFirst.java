import java.util.Arrays;

public class TaskFirst {
    public int[] threeMaxNumbers(int[] mas) {
        if (mas.length < 2) return null;

        Arrays.sort(mas);
        return new int[]{mas[mas.length - 1], mas[mas.length - 2], mas[mas.length - 3]};

    }
}
