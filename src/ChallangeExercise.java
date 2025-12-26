/*Write a method isLeapYear with a parameter of type int named year.

The parameter needs to be greater than or equal to 1 and less than or equal to 9999. If the parameter is not in that range return false.

Otherwise, if it is in the valid range, calculate if the year is a leap year and return true if it is a leap year, otherwise return false.

To determine whether a year is a leap year, follow these steps:
1. If the year is evenly divisible by 4, go to step 2. Otherwise, go to step 5.
2. If the year is evenly divisible by 100, go to step 3. Otherwise, go to step 4.
3. If the year is evenly divisible by 400, go to step 4. Otherwise, go to step 5.
4. The year is a leap year (it has 366 days). The method isLeapYear needs to return true.
5. The year is not a leap year (it has 365 days). The method isLeapYear needs to return false.

Another way to put is:
A leap year is a year that is divisible by 4 but not 100.
If it's divisible by 100, it has to be divisible by 400.

The following years are not leap years:
1700, 1800, 1900, 2100, 2200, 2300, 2500, 2600
This is because they are evenly divisible by 100 but not by 400.

The following years are leap years:
1600, 2000, 2400
This is because they are evenly divisible by both 100 and 400.*/

public class ChallangeExercise {
    public static boolean isLeapYear(int year) {
        if (year < 1 || year > 9999) {
            return false;
        }

        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    return true;
                } else {
                    return false;
                }
            } else {
                return true;
            }
        } else {
            return false;
        }
    }

//    or

    public static boolean alsoIsLeapYear(int year) {
        return (year >= 1 && year <= 9999) &&
                ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0));
    }
    /*Here, the return is directly returning the result of the condition:

(year >= 1 && year <= 9999) → evaluates to true or false

((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) → also evaluates to true or false

Combining them with && means the whole thing is a boolean already.

🔹 Example Run

Let’s say year = 2024:

(year >= 1 && year <= 9999) → true

(year % 4 == 0 && year % 100 != 0) → (true && true) → true

(year % 400 == 0) → false

So: true && (true || false) → true && true → true

That’s what gets returned — no need to manually write if (...) return true; else return false;.*/
}
