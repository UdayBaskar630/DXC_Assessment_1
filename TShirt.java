package DXC_Team;

public class TShirt 
{
    private int price;
    private String type;

    public TShirt(int price, String type) 
    {
        this.price = price;
        this.type = type;
    }

    public int getPrice()
    {
        return price;
    }

    public void setPrice(int price) 
    {
        this.price = price;
    }

    public String getType()
    {
        return type;
    }

    public void setType(String type)
    {
        this.type = type;
    }
}
