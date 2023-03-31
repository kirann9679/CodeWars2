//Write function bmi that calculates body mass index (bmi = weight / height2).
//if bmi <= 18.5 return "Underweight"
//if bmi <= 25.0 return "Normal"
//if bmi <= 30.0 return "Overweight"
//if bmi > 30 return "Obese"

//Solution
package CodeWars;
public class Calculate {
    public static String bmi(double weight, double height) {
        double x=weight/(height*height);
        if(x>0&&x<=18.5) return "Underweight";
        else if (x>18.5&&x<=25.0) return "Normal";
        else if (x>25.0&&x<=30.0) return "Overweight";
        else return "Obese";
        }
}
