package ru.sapteh;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Program {
    public static void main(String[] args) throws IOException {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        String a = "";
        System.out.println("Введите число: ");
        a = buffer.readLine();
        int sum =0;
        for (int i = 0; i < a.length(); i++) {
            char m=a.charAt(i);
            sum=Character.getNumericValue(a.charAt(i))+sum;
        }
        System.out.println("Сумма всех чисел введенного числа равна "+ sum);
    }
}




