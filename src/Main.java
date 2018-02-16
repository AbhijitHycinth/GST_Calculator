import java.util.Scanner;

public class Main
{
    public static void main(String args[])
    {
            Scanner sc=new Scanner(System.in);

            System.out.println("Enter the Commodity: ");
            String commodityRequestedByUser=sc.next();

            System.out.println("Enter the Quantity: ");
            int quantityOfCommoditySelectedByUser=sc.nextInt();

            System.out.println("Enter the unit price of the commodity: ");
            float priceOfCommoditySelected=sc.nextFloat();

        Commodities obj = new Commodities(
                    commodityRequestedByUser,
                    quantityOfCommoditySelectedByUser,
                    priceOfCommoditySelected
                     );



    }
}