import java.util.Scanner;

public class Main {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Quantity");
        int quantity=sc.nextInt();
        System.out.println("Enter the name of the commodity");
        String commodity=sc.next();
        System.out.println("Enter the unit price");
        float unit_price=sc.nextFloat();
        Commodities obj=new Commodities(commodity,quantity,unit_price);
        obj.Display();
    }
}
