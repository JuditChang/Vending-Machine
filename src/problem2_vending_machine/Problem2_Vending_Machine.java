
package problem2_vending_machine;

import java.util.Scanner;

public class Problem2_Vending_Machine {

    
    public static void main(String[] args) 
    {
        int product = makeChoice();
        int price = getPrice(product);
        int money = change(price);
    }
    
    public static int makeChoice()
    {
        Scanner input = new Scanner(System.in);
        
        // Prompt the user to choose a product.
        
        System.out.print("Please choose a product");
        System.out.println(" by entering the product's ID." 
                +"\n\nID Product \t Price"
                + "\n1: Chocolate \t $1.25"
                + "\n2: Chips \t $1.40"
                + "\n3: Coke \t $1.75"
                + "\n4: Water \t $1.20"
                + "\n5: Coffee \t $1.10");
        System.out.print("\nYour choice is: ");

        int choice = input.nextInt();
        return choice;
    }
    
   
    public static int getPrice(int makeChoice) 
    {
        // Getting the price of the item based on its ID.
        
        switch (makeChoice)
        {
            case 1:
                return 125;
            case 2:
                return 140;
            case 3:
                return 175;
            case 4:
                return 120;
            default:
                return 110;
        }
    }
    

    public static int change (int price) 
    {
                   
        Scanner input = new Scanner(System.in);
        
        // Prompting the user to insert money.
        
        System.out.println("The item you chose costs: $" + price);
        System.out.print("\nPlease insert the amount. "
                + "\nor press 0 to cancel the transaction" 
                +" and get a refund.");
        
        int money = input.nextInt();
        
        // Prompting the user to insert more money
        // if the money added is less then the price of the item.
        // Offering refund, if the user wants to cancel the transaction. 
 
        if (money == 0){
            
            System.out.println("You get back the initial amount of $" + money);
                
                int qtrs = money / 25;
                money = money % 25;
            
                int dime = money / 10;
                money = money % 10;
            
                int nick = money / 5;
            
                int pen = money % 5;
            
                System.out.println("\nYour change is: ");
                System.out.printf("\n%d quarters, %d dimes, %d nickels and %d pennies", qtrs, dime, nick, pen);
        }
        
        else
        {
            while (money < price) 
        {
                System.out.println("\nPlease insert sufficient amount"
                        + "\nor press 0 to cancel the transaction "
                        + "and get a refund.");
            
                int moneyAdded = input.nextInt();
                
                money = money + moneyAdded;
        }
        }
        return money;
    }
    
        public static void change (int price, int money) {
            
            int change = money - price;
            
            int qtrs = change / 25;
            change = change % 25;
            
            int dime = change / 10;
            change = change % 10;
            
            int nick = change / 5;
            
            int pen = change % 5;
            
            System.out.println("\nYour change is: ");
            System.out.printf("\n%d quarters, %d dimes, %d nickels and %d pennies", qtrs, dime, nick, pen);
    }
}

            
