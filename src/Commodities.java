public class Commodities
{
    private String commodity[][]={
            {"Rice","Wheat","Other"},
            {"Table","Sofa","Chair"},
            {"Mobile","TV","Tablets"},
            {"Beauty products","Creams","Perfumes"}
    };
    private String user_option;
    private int quantity;
    private float GST;
    private float price, total_price;

    Commodities(String user_option,int quantity,float price)
    {
        this.user_option=user_option;
        this.quantity=quantity;
        this.GST=calc_GST(this.user_option);
        this.price=price;
        this.total_price = calc_price(this.price,this.GST);
    }

    float calc_GST(String user_option) {

        for (int i = 0; i < 4; i++)
        {
            for (int j = 0; j < 3; j++)
            {
                if ((commodity[i][j].toLowerCase()).equals(user_option.toLowerCase()))
                {

                    return (GST(i));
                }


            }
        }

        return 10000;
    }

    int GST(int index)
    {
        if(index==0)
            return 0;
        else if(index==1)
            return 5;
        else if(index==2)
            return 18;
        else if(index==3)
            return 28;
        else
            return 10000;
    }

    float calc_price(float price,float GST)
    {
        return(price*(GST/100 + 1));
    }

   void Display()
    {
        if(GST==10000) {

            System.out.println("Commodity " +this.user_option+" does not exist int the inventory");

        return;}

        System.out.println("GST applicable per unit "+this.GST+"%");
        System.out.println("Final Price Rs "+this.total_price);
    }

}
