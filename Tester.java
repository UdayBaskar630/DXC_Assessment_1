package DXC_Team;

import java.util.Scanner;

public class Tester 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        TShirt[] tShirts = 
        	{
                new TShirt(200, "Round Neck"),
                new TShirt(250, "Collared"),
                new TShirt(300, "Hooded")
        	};
        int[] purchase_cart = new int[3];

        for (int i = 0; i < 3; i++)
        {
            System.out.print(" Enter the number of " + tShirts[i].getType() + " T-Shirts: ");
            purchase_cart[i] = sc.nextInt();
        }

        int totalCost = 0;
        for (int i = 0; i < 3; i++)
        {
            totalCost = totalCost + (tShirts[i].getPrice() * purchase_cart[i]);
        }

        int totalOrdered = 0;
        for (int i = 0; i < 3; i++)
        {
            totalOrdered = totalOrdered + purchase_cart[i];
        }

        int discount = 0;
        if (totalOrdered < 5)
        {
            discount = 0;
        }
        else if (totalOrdered >= 5 && totalOrdered <= 10)
        {
            discount = 10;
        } 
        else 
        {
            discount = 20;
        }

        int finalAmount = (totalCost - (totalCost * (discount / 100)));

        System.out.println("  The final amount after discount is: Rs." + finalAmount);
    }
}