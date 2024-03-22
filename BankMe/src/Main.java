import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    Bank SBI = new Bank();
    User newUser = new User();
    System.out.println("Welcome to SBI Bank");
    System.out.println("Enter your name");

    //get username
        Scanner input = new Scanner(System.in);
        newUser.username = input.nextLine();
    // Get account type
        System.out.println("What type of account you want to choose, 1:Checking, 2: Savings");
        int accountType = input.nextInt();
        switch (accountType){
            case 1:
                Account acc1 = new Account("Checking");
                newUser.setAccount(acc1);
                break;
          case 2:
                Account acc2 = new Account("savings");
              newUser.setAccount(acc2);
                break;
            default:
                System.out.println("Invalid Account type, Sorry the bank is close now");
        }
        int accountAction;

        do{
        // What you want to do in the account
        System.out.println("You have choose "+ newUser.account + "Account, What you want to do. 1: Deposit, 2: Withdraw 3:CheckBalance");
        accountAction = input.nextInt();
            switch (accountAction){
                case 1:
                    System.out.println("How much you want to deposit(no decimals)");
                    newUser.setBalance(newUser.getBalance() + input.nextInt());
                    System.out.println("New Balance: " + newUser.getBalance());
                    break;
                case 2:
                    System.out.println("How much you want to Withdraw(no decimals)");
                    newUser.setBalance(newUser.getBalance()-input.nextInt() );
                    System.out.println("New Balance: " + newUser.getBalance());
                    break;
                case 3:
                    System.out.println("Balance: " + newUser.getBalance());
                    break;
                case 4:
                    System.out.println("Account: " + newUser.getAccount().toString());
                    break;
                default:
                    System.out.println("Balance: Invalid input ");
            }
        }
        while(accountAction>0);
    }
}