package br.com.amy.exerc9;

import java.util.Arrays;

public class SobreArrays {
    public static void main(String[] args) {
        int[] serialNumber = new int[10];
        serialNumber[0]=29;
        serialNumber[1]=30;
        serialNumber[2]=31;
        serialNumber[3]=32;
        serialNumber[4]=33;
        serialNumber[5]=34;
        serialNumber[6]=35;
        serialNumber[7]=36;
        serialNumber[8]=37;
        serialNumber[9]=38;

        System.out.println(Arrays.toString(serialNumber));

        for(int i=0; i < serialNumber.length; i++){
           if (serialNumber[i] % 2 == 0){
               System.out.println(serialNumber[i]);
           }
        }
        serialNumber[10]=39;
    }
}
