package br.com.amy.exerc10;

public class SobreForEach {
    public static void main(String[] args) {
        int[] serialNumbers = new int[10];
        serialNumbers[0] = 29;
        serialNumbers[1] = 30;
        serialNumbers[2] = 31;
        serialNumbers[3] = 32;
        serialNumbers[4] = 33;
        serialNumbers[5] = 34;
        serialNumbers[6] = 35;
        serialNumbers[7] = 36;
        serialNumbers[8] = 37;
        serialNumbers[9] = 38;

        for (int serialNumber : serialNumbers) {
            if (serialNumber % 2 == 0) {
                System.out.println(serialNumber);
            }
        }
    }
}
