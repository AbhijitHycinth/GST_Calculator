import java.util.Scanner;

public class Main
{
    public static void main(String args[])
    {
            Scanner scanInput=new Scanner(System.in);

            System.out.println("Enter the Commodity: ");
            String commodityRequestedByUser=scanInput.next();

            System.out.println("Enter the Quantity: ");
            int quantityOfCommoditySelectedByUser=scanInput.nextInt();

            System.out.println("Enter the unit price of the commodity: ");
            float priceOfCommoditySelected=scanInput.nextFloat();

            Commodity commodity = new Commodity(
                    commodityRequestedByUser,
                    quantityOfCommoditySelectedByUser,
                    priceOfCommoditySelected
                     );
    }
}