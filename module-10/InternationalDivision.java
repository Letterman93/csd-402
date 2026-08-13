/*
 * Author:      Zak Nizam
 * Date:        August 12, 2026
 * Course:      CSD 402 - Java for Programmers
 * Assignment:  Module 10.2 Programming Assignment
 *
 * Purpose:
 *  This class represents a company division located outside the United States.
 */

public class InternationalDivision extends Division {
    private String country;
    private String language;

    // Require all international division details when an object is created.
    public InternationalDivision(String divisionName, int accountNumber, String country,
            String language) {
        super(divisionName, accountNumber);
        this.country = country;
        this.language = language;
    }

    @Override
    public void display() {
        System.out.println("International Division");
        System.out.println("Division Name: " + this.getDivisionName());
        System.out.println("Account Number: " + this.getAccountNumber());
        System.out.println("Country: " + this.country);
        System.out.println("Language: " + this.language);
    }
}
