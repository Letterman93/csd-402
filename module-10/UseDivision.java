/*
 * Author:      Zak Nizam
 * Date:        August 12, 2026
 * Course:      CSD 402 - Java for Programmers
 * Assignment:  Module 10.2 Programming Assignment
 *
 * Purpose:
 *  This program creates and displays two domestic and two international
 *  company divisions.
 */

public class UseDivision {
    public static void main(String[] args) {
        Division domesticOne = new DomesticDivision("Northwest Sales", 1001, "Washington");
        Division domesticTwo = new DomesticDivision("Southeast Sales", 1002, "Florida");
        Division internationalOne = new InternationalDivision("Europe Operations", 2001,
                "Germany", "German");
        Division internationalTwo = new InternationalDivision("Asia Operations", 2002,
                "Japan", "Japanese");

        Division[] divisions = {domesticOne, domesticTwo, internationalOne, internationalTwo};

        // Display every division using its own display method.
        for (Division division : divisions) {
            division.display();
            System.out.println();
        }
    }
}
