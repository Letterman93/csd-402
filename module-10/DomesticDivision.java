/*
 * Author:      Zak Nizam
 * Date:        August 12, 2026
 * Course:      CSD 402 - Java for Programmers
 * Assignment:  Module 10.2 Programming Assignment
 *
 * Purpose:
 *  This class represents a company division located in the United States.
 */

public class DomesticDivision extends Division {
    private String state;

    // Require all domestic division details when an object is created.
    public DomesticDivision(String divisionName, int accountNumber, String state) {
        super(divisionName, accountNumber);
        this.state = state;
    }

    @Override
    public void display() {
        System.out.println("Domestic Division");
        System.out.println("Division Name: " + this.getDivisionName());
        System.out.println("Account Number: " + this.getAccountNumber());
        System.out.println("State: " + this.state);
    }
}
