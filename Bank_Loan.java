package Metro_Bank;

import java.util.Scanner;

public class Bank_Loan
{
  public static void main(String[] args) 
  {
    Scanner sc = new Scanner(System.in);
    int AccountNumber;
    double AccountBalance, Salary, ExpectedLoanAmount, EligibleLoanAmount, ExpectedEMIs, EligibleEMIs;
    String LoanType;
    
    
    System.out.print("Enter account number : ");
    AccountNumber = sc.nextInt();
    System.out.print("Enter account balance : ");
    AccountBalance = sc.nextDouble();
    System.out.print("Enter salary: ");
    Salary = sc.nextDouble();
    sc.nextLine();
    System.out.print("Enter loan type (car, business, house): ");
    LoanType = sc.nextLine();
    System.out.print("Enter expected loan amount: $");
    ExpectedLoanAmount = sc.nextDouble();
    System.out.print("Enter expected number of EMIs: ");
    ExpectedEMIs = sc.nextDouble();

   
    if (AccountNumber < 1000 || AccountNumber >= 1999)
    {
      System.out.println(" Invalid account number ");
      return;
    }
    

    
    if (AccountBalance < 1000)
    {
      System.out.println(" Insufficient Balance ");
      return;
    }

    
    if (LoanType.equalsIgnoreCase("Car"))
    {
      EligibleLoanAmount = 500000;
      EligibleEMIs = 36;
    }
    else if (LoanType.equalsIgnoreCase("House"))
    {
      EligibleLoanAmount = 6000000;
      EligibleEMIs = 60;
    } 
    else if (LoanType.equalsIgnoreCase("Business"))
    {
      EligibleLoanAmount = 7500000;
      EligibleEMIs = 84;
    }
    else 
    {
      System.out.println(" Invalid loan type ");
      return;
    }

    
    if (ExpectedLoanAmount > EligibleLoanAmount || ExpectedEMIs > EligibleEMIs)
    {
      System.out.println("Loan not Approved");
    }
    else 
    {
      System.out.println("Loan Approved");
      
      System.out.println("Account number is " + AccountNumber);
      
      System.out.println("Eligible loan amount is " + EligibleLoanAmount);
      
      System.out.println("Requested loan amount is " + ExpectedLoanAmount);
      
      System.out.println("Eligible number of EMIs are " + EligibleEMIs);
      
      System.out.println("Requested number of EMIs are " + ExpectedEMIs);
    }
  }
}