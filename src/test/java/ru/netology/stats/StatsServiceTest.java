package ru.netology.stats;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    @org.junit.jupiter.api.Test
    void shouldCalculateSum() {
        StatsService service = new StatsService();

        int[] managerSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 180;

        int actual = service.calculateSum(managerSales);

        assertEquals(expected, actual);

    }

    @org.junit.jupiter.api.Test
    void shouldCalculateAverageSum() {
        StatsService service = new StatsService();

        int[] managerSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 15;

        int actual = service.calculateAverageSum(managerSales);

        assertEquals(expected, actual);

    }

    @org.junit.jupiter.api.Test
    void shouldCalculateMaxSalesInMonth() {
        StatsService service = new StatsService();

        int[] managerSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 8;

        int actual = service.maxSalesInMonth(managerSales);

        assertEquals(expected, actual);

    }

    @org.junit.jupiter.api.Test
    void shouldCalculateMinSalesInMonth() {
        StatsService service = new StatsService();

        int[] managerSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 9;

        int actual = service.minSalesInMonth(managerSales);

        assertEquals(expected, actual);

    }

    @org.junit.jupiter.api.Test
    void shouldCalculateMonthUnderAverage() {
        StatsService service = new StatsService();

        int[] managerSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;

        int actual = service.calculateMonthUnderAverage(managerSales);

        assertEquals(expected, actual);

    }

    @org.junit.jupiter.api.Test
    void shouldCalculateMonthOverAverage() {
        StatsService service = new StatsService();

        int[] managerSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;

        int actual = service.calculateMonthOverAverage(managerSales);

        assertEquals(expected, actual);

    }
}