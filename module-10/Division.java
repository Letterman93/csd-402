/*
 * Author:      Zak Nizam
 * Date:        August 12, 2026
 * Course:      CSD 402 - Java for Programmers
 * Assignment:  Module 10.2 Programming Assignment
 *
 * Purpose:
 *  This abstract class stores information shared by all company divisions.
 */

public abstract class Division {
    private String divisionName;
    private int accountNumber;

    // Require a name and account number for every division.
    public Division(String divisionName, int accountNumber) {
        this.divisionName = divisionName;
        this.accountNumber = accountNumber;
    }

    public String getDivisionName() {
        return this.divisionName;
    }

    public int getAccountNumber() {
        return this.accountNumber;
    }

    // Each division type displays its information differently.
    public abstract void display();
}
