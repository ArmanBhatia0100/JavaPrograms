import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        App app = new App();
        System.out.println("Welcome to the Investment App");
        Scanner input = new Scanner(System.in);
        System.out.println("What is your name");
        System.out.println("-------------------------");
        app.username = input.nextLine();
        int day =1;
        while (true){

        System.out.println("What is your buying price of the share");
        System.out.println("-------------------------");
        app.buyingPrice = input.nextInt();

        System.out.println("What is your Closing price of the share");
        System.out.println("-------------------------");
        app.closingPrice = input.nextInt();
        if(app.closingPrice<0) break;
        app.earnings = app.findEarnings();
        System.out.println("Today's earnings of day"+ day +":"+ app.earnings);
        day++;
}

    }
}