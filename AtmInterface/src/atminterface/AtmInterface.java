/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atminterface;
import java.util.Scanner;

/**
 *
 * @author jaina
 */
public class AtmInterface {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Enter Username and password:");
        Scanner user=new Scanner(System.in);
        String s=user.next();
        Scanner pass=new Scanner(System.in);
        int p=pass.nextInt();
        
        String username="Anjali";
        int password=1456;
        
        if(s.equals(username) && p==password){
        int balance=5000, withdraw=0, deposit=0,transactions=0;
        String transactionHistory="";
        Scanner ref=new Scanner(System.in);
        
        while(true){
            System.out.println("ATM Machine");
            System.out.println("Choose 1 for Withdraw");
            System.out.println("Choose 2 for Deposit");
            System.out.println("Choose 3 for Check Balance");
            System.out.println("Choose 4 for Tranfer Money");
            System.out.println("Choose 5 to Check Transaction History");
            System.out.println("Choose 6 for Exit");
            
            int n=ref.nextInt();
            
            switch(n){
                case 1:
                    System.out.println("Enter money to be Withdraw: ");
                    withdraw=ref.nextInt();
                    if(balance>=withdraw){
                        balance=balance-withdraw;
                        String str = withdraw + " Rs Withdrawed\n";
                        transactionHistory = transactionHistory.concat(str);
                    }
                    else{
                        System.out.println("Insufficient Money");
                    }
                    System.out.println(" ");
                    break;
                case 2:
                    System.out.println("Enter money to be deposit");
                    deposit=ref.nextInt();
                    balance=balance+deposit;
                    System.out.println("Your money successfully deposited");
                    System.out.println(" ");
                    String str = deposit + " Rs Deposited\n";
                    transactionHistory = transactionHistory.concat(str);
                    break;      
                case 3:
                    System.out.println("Balance: "+balance);
                    System.out.println(" ");
                    String strb = balance + " Rs Balance\n";
                    transactionHistory = transactionHistory.concat(strb);
                    break;
                case 4:
                    Scanner sc = new Scanner(System.in);
                    System.out.print("\nEnter Receipent's Name - ");
                    String receipent = sc.nextLine();
                    System.out.print("\nEnter amount to transfer - ");
                    int amount = sc.nextInt();
                    
                    if ( balance >= amount ) {
				if ( amount <= 50000f ) {
					transactions++;
					balance = balance-amount;
					System.out.println("\nSuccessfully Transfered to " + receipent);
					String stra = amount + " Rs transfered to " + receipent + "\n";
                                        transactionHistory = transactionHistory.concat(stra);
				}
				else {
					System.out.println("\nSorry...Limit is 50000.00");
				}
			}
			else {
				System.out.println("\nInsufficient Balance");
			}
                    break;
                case 5:
                    if ( transactions == 0 ) {
			System.out.println("\nEmpty");
		}
		else {
			System.out.println("\n" + transactionHistory);
		}
                    break;
                case 6:
                    System.exit(0);
        }
    }
        }
        else{
            System.out.println("Invalid username or password");
        }
    
}
}
