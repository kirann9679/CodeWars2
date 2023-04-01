//I have a cat and a dog.
//I got them at the same time as kitten/puppy. That was humanYears years ago.
//Return their respective ages now as [humanYears,catYears,dogYears]
//NOTES:
//humanYears >= 1
//humanYears are whole numbers only
//Cat Years
//15 cat years for first year
//+9 cat years for second year
//+4 cat years for each year after that
//Dog Years
//15 dog years for first year
//+9 dog years for second year
//+5 dog years for each year after that

//Solution
package CodeWars;
public class Dinglemouse {
    public static int[] humanYearsCatYearsDogYears(final int humanYears) {
        int catYears1 = 15;
        int dogYears1 = 15;
        int catYears2 = catYears1 + 9;
        int dogYears2 = dogYears1 + 9;
        if (humanYears == 1) {
            return new int[]{humanYears, catYears1, dogYears1};
        } else if (humanYears == 2) {
            return new int[]{humanYears, catYears2, dogYears2};
        } else if (humanYears >= 3){
            int n=humanYears-2;
                int catYears = catYears2 + 4*n;
                int dogYears = dogYears2 + 5*n;
              return new int[]  {humanYears, catYears, dogYears};
            }
        else return null;

    }
}
