package ru.netology.services;

public class CalcService {
    public int calcService(int income, int expense, int threshold) {
        int maney = 0; // денег на счете в первый месяц
        int count = 0; // счетчик месяцев

        for (int monht = 0; monht < 12; monht++) {
            if (maney >= threshold) { // можем отдыхать
                count++; // увеличиваем счетчик месяцев отдыха
                maney -= expense;
                maney /= 3;
            } else { // не можем отдыхать
                maney += (income - expense);
            }
        }
        return count;
    }
}

