import java.util.HashMap;

public class Commodities {
    private static final HashMap<String, Float> commodityGSTMap = (HashMap<String, Float>) new HashMap<String, Float>();

    static {

        commodityGSTMap.put("Rice", (float) 0.0);
        commodityGSTMap.put("Wheat", (float) 0.0);

        commodityGSTMap.put("Table", (float)5.0);
        commodityGSTMap.put("Sofa", (float)5.0);
        commodityGSTMap.put("Chair", (float)5.0);

        commodityGSTMap.put("Mobile", (float)18.0);
        commodityGSTMap.put("TV", (float)18.0);
        commodityGSTMap.put("Tablet", (float)18.0);

        commodityGSTMap.put("Beauty Product", (float)28.0);
        commodityGSTMap.put("Cream", (float)28.0);
        commodityGSTMap.put("Perfume", (float)28.0);


    }

    private String commoditySelectedByUser;
    private int quantityOfSelectedCommodity;
    private float priceOfSelectedCommodity, GSTOfSelectedCommodity, finalPriceOfSelectedCommodity;

    Commodities(String commoditySelectedByUser,int quantityOfCommoditySelected,float priceOfSelectedCommodity)
    {

        if(!commodityGSTMap.containsKey(commoditySelectedByUser)) {
            System.out.println("Commodity does not exist in the inventory");
            return;
        }

        this.commoditySelectedByUser=commoditySelectedByUser;
        this.quantityOfSelectedCommodity=quantityOfCommoditySelected;
        this.priceOfSelectedCommodity = priceOfSelectedCommodity;
        this.GSTOfSelectedCommodity = calculateGSTOfSelectedCommodity(this.commoditySelectedByUser);
        this.finalPriceOfSelectedCommodity= calculateFinalPriceOfSelectedCommodity();
        Display();
    }

    float calculateGSTOfSelectedCommodity(String commodityName)
    {
        return (this.commodityGSTMap.get(commodityName));
    }

    float calculateFinalPriceOfSelectedCommodity()
    {
     return ((this.GSTOfSelectedCommodity+1)*(this.priceOfSelectedCommodity));
    }

    void Display()
    {

        System.out.println("GST of unit : "+this.GSTOfSelectedCommodity);
        System.out.println("Final price: "+this.finalPriceOfSelectedCommodity);
    }

}