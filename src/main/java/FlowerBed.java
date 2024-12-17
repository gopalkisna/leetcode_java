package src.main.java;

public class FlowerBed {

    public static void main(String[] args) {

        int[] flowerbed = {0};
        int n = 1;

        System.out.println(findOut(flowerbed, n));
    }

    private static boolean findOut(int[] flowerbed, int n) {

        int count = 0;

        if (flowerbed[0] == 0 && flowerbed[1] == 0) {
            count++;
        }

        int length = flowerbed.length;

        if (flowerbed[length - 1] == 0 && flowerbed[length - 2] == 0) {
            count++;
        }

        for (int i = 1; i < flowerbed.length - 1; i++) {

            if (flowerbed[i] == 0) {
                if (flowerbed[i - 1] == 0 && flowerbed[i + 1] == 0) {
                    count++;
                    i = i+1;
                }
            }
        }
        if (count == n)
            return true;
        else
            return false;

    }
}


