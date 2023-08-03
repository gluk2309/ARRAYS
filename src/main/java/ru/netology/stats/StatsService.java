package ru.netology.stats;

public class StatsService {
    public int minSales(long[] sales) {
        int minMonth = 0; // номер месяца с минимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) { // значит, в рассматриваемом i-м месяце продаж меньше
                minMonth = i; // запомним его как минимальный
            }
        }

        return minMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }

    public int allSales(long[] sales) {
        long sum = 0;
        for (long number : sales) {
            sum = sum + number;
        }

        return (int) sum;
    }

    public int averageSales(long[] sales) {
        int averageAmount = allSales(sales);

        return averageAmount / sales.length;

    }

    public int maxSales(long[] sales) {

        int maxMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }

        }


        return maxMonth + 1;

    }

    public int lowSalesMonths(long[] sales){

      int lessMonth = averageSales(sales);
      int lessAverage = 0;

        for(long i : sales){
            if(i < lessMonth){
                lessAverage++;
            }
        }


        return lessAverage;
    }

    public int highSalesMonths(long[] sales){

        int aboveMonth = averageSales(sales);
        int aboveAverage = 0;

        for(long i : sales){
            if(i > aboveMonth){
                aboveAverage++;
            }
        }


        return aboveAverage;
    }
}
