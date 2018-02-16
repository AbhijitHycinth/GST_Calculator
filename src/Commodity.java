import java.util.HashMap;

public class Commodity {
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

    private String nameOfCommodity;
    private int quantity;
    private float price, GST, finalPrice;

    Commodity(String name, int quantity, float price)
    {

        if(!commodityGSTMap.containsKey(name)) {
            System.out.println("Commodity does not exist in the inventory");
            return;
        }

        this.nameOfCommodity =name;
        this.quantity = quantity;
        this.price = price;
        this.GST = calculateGST(this.nameOfCommodity);
        this.finalPrice = calculateFinalPrice();
        Display();
    }

    float calculateGST(String commodityName)
    {
        return (this.commodityGSTMap.get(commodityName));
    }

    float calculateFinalPrice()
    {
     return (Math.round((this.GST /100+1)*(this.price)));
    }

    void Display()
    {

        System.out.println("GST of unit : "+this.GST);
        System.out.println("Final price: "+this.finalPrice);
    }

}