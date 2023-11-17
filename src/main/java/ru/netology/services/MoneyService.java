package ru.netology.services;

public class MoneyService {

    public int calculate(int income, int expenses, int threshold) {
        int count = 0; // счётчик месяцев отдыха
        int money = 0; // количество денег на счету
        for (int month = 0; month < 12; month++) {
            if (money < threshold) { // можем ли отдыхать?
                money += income;
                money -= expenses;

            } else {
                money -= expenses;
                money /= 3;
                count ++;
            }
        }
        return count;
    }
}
