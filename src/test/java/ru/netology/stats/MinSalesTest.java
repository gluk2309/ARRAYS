package ru.netology.stats;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;


public class MinSalesTest {

    @Test
    public void MonthNumberOfMinimumSales() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int exepectedMonth = 9;
        int actualMonth = service.minSales(sales);

        Assertions.assertEquals(exepectedMonth, actualMonth);
    }

    @Test
    public void sumOfAllSales() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedSum = 180;
        int actualSum = service.allSales(sales);

        Assertions.assertEquals(expectedSum, actualSum);

    }

    @Test
    public void averageMonthlySales() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedAverage = 15;
        int actual = service.averageSales(sales);

        Assertions.assertEquals(expectedAverage, actual);
    }

    @Test
    public void numberOfTheMonthOfMaximumSales() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMonth = 8;
        int actualMonth = service.maxSales(sales);

        Assertions.assertEquals(expectedMonth, actualMonth );

    }

    @Test
    public void lowSalesMonths() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedLow = 5;
        int actualLow = service.lowSalesMonths(sales);

        Assertions.assertEquals(expectedLow, actualLow);
    }
    @Test
    public void highSalesMonths() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedHigh = 5;
        int actualHigh = service.highSalesMonths(sales);

        Assertions.assertEquals(expectedHigh, actualHigh);
    }
}

