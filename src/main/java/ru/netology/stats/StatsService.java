package ru.netology.stats;

public class StatsService {
    public int calculateSum(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum += sale;
        }
        return sum;
    }


    public int calculateAverageSum(int[] sales) {
        return calculateSum(sales) / sales.length;
    }


    public int maxSalesInMonth(int[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (int sale : sales) {

            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }


    public int minSalesInMonth(int[] sales) {
        int minMonth = 0;
        int month = 0;
        for (int sale : sales) {

            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }


    public int calculateMonthUnderAverage(int[] sales) {
        int AverageSum = calculateAverageSum(sales);
        int amountMonth = 0;

        for (int sale : sales) {

            if (sale < AverageSum) {
                amountMonth++;
            }
        }
        return amountMonth;
    }


    public int calculateMonthOverAverage(int[] sales) {
        int AverageSum = calculateAverageSum(sales);
        int amountMonth = 0;

        for (int sale : sales) {

            if (sale < AverageSum) {
                amountMonth++;
            }
        }
        return amountMonth;
    }
}
