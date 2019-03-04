import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * Project 4 includes testing for 
 *              #11. Sales Analysis
 *              #10. Ship, Cruiseship, & CargoShip Classes
 * 
 * @author Ngan
 */



public class Project4{
    public static void main(String[] args) throws FileNotFoundException
    {
        /** #11 Sales Analysis includes:
         *          1. Creating a SalesData.txt file that contains the dollar 
         *             amount of sales that a retail store made each day for 
         *             a month (4 weeks). 
         *          2. Displaying total sales for each week
         *          3. Displaying average daily sales for each week
         *          4. Displaying total sales for all of the weeks
         *          5. Displaying average weekly sales
         *          6. Displaying week number that had the highest amount of sales
         *          7. Displaying week number that had the lowest amount of sales
         */
        
         //To modify output
         DecimalFormat formatter = new DecimalFormat("#,000.00");
         System.out.println("Output from #11: Sales Analysis ");

         //1. Creating a SalesData.txt file
         PrintWriter outputFile = new PrintWriter("SalesData.txt");
         
         //Creating an object from Random Class to generate random sales amount
         Random randomSales = new Random();
         
         //To hold the randomSales generated 
         int salesAmount; 
         
         //Week 1 Dollar Sales Amount
         for (int sale = 0; sale < 7; sale ++)
         {
             salesAmount = randomSales.nextInt(1000) + 10;
             outputFile.print(salesAmount + " ");
             
         }
         outputFile.println();
         
         //Week 2 Dollar Sales Amount
         for (int sale = 0; sale < 7; sale ++)
         {
             salesAmount = randomSales.nextInt(5000) + 10;
             outputFile.print(salesAmount + " ");
         }
            
         outputFile.println();
         
         //Week 3 Dollar Sales Amount
         for (int sale = 0; sale < 7; sale ++)
         {
             salesAmount = randomSales.nextInt(10000) + 10;
             outputFile.print(salesAmount + " ");
         }
         outputFile.println();
         
         //Week 4 Dollar Sales Amount
         for (int sale = 0; sale < 7; sale ++)
         {
             salesAmount = randomSales.nextInt(10000) + 10;
             outputFile.print(salesAmount + " ");
             
         }
         
         outputFile.close();
         
        


        //2. Displaying total sales for each week
        
        //Open SalesData.txt file
        File salesData = new File("SalesData.txt");
        Scanner inputFile = new Scanner(salesData);
        
        //To hold total $ amount week one
        double totalSaleWeekOne = 0.0;
        //To hold values read from file
        double fileAmount;
        
        //Calculating Week 1's total
        for (int value = 1; value <= 7; value++) //reading the first 7 values
        {
            fileAmount = inputFile.nextInt();
            totalSaleWeekOne += fileAmount;
        }
        System.out.println("Total dollars of sales amount for week one: $" 
                            + formatter.format(totalSaleWeekOne));
       
        
        //To hold total $ amount week two
        double totalSaleWeekTwo = 0.0;
        //To hold values read from file
        double W2Amount;
        
        //Calculating Week 2's total
        for (int value = 8; value <= 14; value++) //reading the 
                                                  //2nd set of 7 values
        {
            W2Amount = inputFile.nextInt();
            totalSaleWeekTwo += W2Amount;
        }
        System.out.println("Total dollars of sales amount for week Two: $" 
                            + formatter.format(totalSaleWeekTwo));
       
        
         //To hold total $ amount week three
        double totalSaleWeekThree = 0.0;
        //To hold values read from file
        double W3Amount;
        
        //Calculating Week 3's total
        for (int value = 15; value <= 21; value++) //reading the 
                                                    //third set of 7 values
        {
            W3Amount = inputFile.nextInt();
            totalSaleWeekThree += W3Amount;
        }
        System.out.println("Total dollars of sales amount for week Three: $" 
                            + formatter.format(totalSaleWeekThree));
        
        
        //To hold total $ amount week four
        double totalSaleWeekFour = 0.0;
        //To hold values read from file
        double W4Amount;
        
        //Calculating Week 4's total
        for (int value = 22; value <= 28; value++) //reading the 
                                                    //last set of 7 values
        {
            W4Amount = inputFile.nextInt();
            totalSaleWeekFour += W4Amount;
        }
        System.out.println("Total dollars of sales amount for week Four: $" 
                            + formatter.format(totalSaleWeekFour));
        
        
        outputFile.close();

        
        
        
        //3. Displaying average daily sales for each week
        
        //There are 7 days a week
        final int DAYS = 7;
        
        //Calculating average daily sales for week one
        double aveDailySaleWeekOne;
        aveDailySaleWeekOne = totalSaleWeekOne/DAYS;
        System.out.println("\nThe average daily sales for Week "
                            + "One is $" + formatter.format(aveDailySaleWeekOne));
        
        //Calculating average daily sales for week two
        double aveDailySaleWeekTwo;
        aveDailySaleWeekTwo = totalSaleWeekTwo/DAYS;
        System.out.println("The average daily sales for Week "
                            + "Two is $" + formatter.format(aveDailySaleWeekTwo));
        
        //Calculating average daily sales for week three
        double aveDailySaleWeekThree;
        aveDailySaleWeekThree = totalSaleWeekThree/DAYS;
        System.out.println("The average daily sales for Week "
                            + "Three is $" + formatter.format(aveDailySaleWeekThree));
        
        //Calculating average daily sales for week four
        double aveDailySaleWeekFour;
        aveDailySaleWeekFour = totalSaleWeekFour/DAYS;
        System.out.println("The average daily sales for Week "
                            + "Four is $" + formatter.format(aveDailySaleWeekFour));
        
        
        
        
        //4. Displaying total sales for all of the weeks
        double totalOfAllWeek;
        totalOfAllWeek = totalSaleWeekOne + totalSaleWeekTwo + 
                        totalSaleWeekThree + totalSaleWeekFour;
        
        System.out.println("\nThe total sales for all the weeks is $" 
                            + formatter.format(totalOfAllWeek));

        
        
        //5. Displaying average weekly sales
        double aveWeeklySales;
        //There are four weeks total
        final int WEEKS = 4; 
        
        aveWeeklySales = (totalSaleWeekOne + totalSaleWeekTwo + 
                        totalSaleWeekThree + totalSaleWeekFour)/WEEKS;
        System.out.println("\nThe average weekly sales is $" 
                           + formatter.format(aveWeeklySales));
        
        
        
        
        
        //6. Displaying week number that had the highest amount of sales
        double[] AmtOfSaleArray = new double[4];
        AmtOfSaleArray[0] = totalSaleWeekOne;
        AmtOfSaleArray[1] = totalSaleWeekTwo;
        AmtOfSaleArray[2] = totalSaleWeekThree;
        AmtOfSaleArray[3] = totalSaleWeekFour;
        
        //To hold the highestAmtOfSale
        double highestAmtOfSales = AmtOfSaleArray[0];
        
        //To hold the Week's number of highest amount of sale
        int WeekWithHighestSale;
        int positionOfWeekWithHigestSale = 0;
        for (int i = 0; i < AmtOfSaleArray.length; i++)
        {
            if (AmtOfSaleArray[i] > highestAmtOfSales)
            {
               highestAmtOfSales = AmtOfSaleArray[i];
               positionOfWeekWithHigestSale = (i + 1);
              /**
               *                ++i VS (i + 1)
               * i++ --> actually doing operation on the i, which was why the
               *         the position of the week was not correct
               *    
               * (i + 1) --> OKAY because I am simply using the value in the i
               *             
               */
                      
            }
            
        }
       
       //Displaying result of for loop above
       System.out.println("\nThe highest amount of sales is $"
                           + formatter.format(highestAmtOfSales) + " from week " 
               + positionOfWeekWithHigestSale);
        
       
       
       
       
        
       //7. Displaying week number that had the lowest amount of sales
       //To hold the lowestAmtOfSale
        double lowestAmtOfSales = AmtOfSaleArray[0];
        
        //To hold the Week's number of lowest amount of sale
        int WeekWithLowestSale;
        int positionOfWeekWithLowestSale = 0;
        for (int i = 0; i < AmtOfSaleArray.length; i++)
        {
            if (AmtOfSaleArray[i] <= lowestAmtOfSales)
            {
               lowestAmtOfSales = AmtOfSaleArray[i];
               positionOfWeekWithLowestSale = (i+1);       
            }
            
        }
       
       //Displaying result of for loop above
       System.out.println("\nThe highest amount of sales is $"
                           + formatter.format(lowestAmtOfSales) + " from week " 
               + positionOfWeekWithLowestSale);
       
      

       
       
       
       
       
        
        //Demonstrating the classes in #10
        System.out.println("\nOutput from #10. Ship, Cruiseship, "
                            + "& CargoShip Classes");
        //Creating a Ship array with 6 array elements
        Ship[] shipArray = new Ship[6];
       
        //Assigning various Ship, Cruiseship, CargoShip objects to array elements
        shipArray[0] = new Ship("Titanic", "1901");
        shipArray[1] = new Ship("Ngan's Ship", "2018");
        shipArray[2] = new CargoShip("Tim's CargoShip", 20);
        shipArray[3] = new CargoShip("John's CargoShip", 400);
        shipArray[4] = new Cruiseship("Laura's CruiseShip", 1000);
        shipArray[5] = new Cruiseship("Aurora's CruiseShip", 3000);
        
        for(int index = 0; index < shipArray.length; index++)
        {
            System.out.println(shipArray[index].toString());
        }
        
    }
}
