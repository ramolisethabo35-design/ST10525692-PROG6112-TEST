package com.mycompany.gamingconsolereport;

/**
 *
 * @author ramolise
 */
public class GamingConsoleReport {

    public static void main(String[] args) {

        // One-dimensional array
        String[] cities = {"Cape Town", "Port Elizabeth", "Pretoria"};

        // One-dimensional array
        String[] consoles = {"PS5", "XBOX", "SWITCH"};

        // Yhis is the Two-dimensional array
        int[][] sales = {
            {1000, 2000, 3000},
            {2000, 3000, 4000},
            {1500, 1100, 1200}
        };

        // This is the one dimensional array
        int[] cityTotals = new int[3];

        // Calculate total sales for each city
        for (int row = 0; row < sales.length; row++) {

            for (int column = 0; column < sales[row].length; column++) {
                cityTotals[row] += sales[row][column];
            }
        }

        // This is where you will find the city with the most reports
        int highestSales = cityTotals[0];
        String cityWithMostSales = cities[0];

        for (int i = 1; i < cityTotals.length; i++) {

            if (cityTotals[i] > highestSales) {
                highestSales = cityTotals[i];
                cityWithMostSales = cities[i];
            }
        }

        // MY report sales will show here 
        System.out.println("---------------------------------------------");
        System.out.println("           GAMING CONSOLE REPORT");
        System.out.println("---------------------------------------------");

        System.out.printf("%-18s%-10s%-10s%-10s%n",
                "", consoles[0], consoles[1], consoles[2]);

        for (int row = 0; row < sales.length; row++) {

            System.out.printf("%-18s%-10d%-10d%-10d%n",
                    cities[row],
                    sales[row][0],
                    sales[row][1],
                    sales[row][2]);
        }

        System.out.println();
        System.out.println("---------------------------------------------");
        System.out.println("       TOTAL CONSOLE SALES FOR EACH CITY");
        System.out.println("---------------------------------------------");

        for (int i = 0; i < cityTotals.length; i++) {
            System.out.printf("%-18s%d%n", cities[i], cityTotals[i]);
        }

        System.out.println();
        System.out.println("CITY WITH THE MOST SALES IS: " + cityWithMostSales);
        System.out.println("---------------------------------------------");
    }
}