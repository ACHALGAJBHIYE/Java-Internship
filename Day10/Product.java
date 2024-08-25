/*
  Problem Statement:

Create a Product class with the following attributes:

productName (String)
price (double)
stockQuantity (int)
Implement the following constructors:

No-Argument Constructor: Initializes productName to "Unnamed Product", price to 0.0, and stockQuantity to 0.
Parameterized Constructor: Accepts productName, price, and stockQuantity as parameters. If price is less than 0, set it to 0.0. If stockQuantity is less than 0, set it to 0.

 */
public class Product
{
    String productName;
    double price;
    int stockQuantity;

    public Product()
    {
        productName = "Unnamed Product";
        price = 0.0;
        stockQuantity = 0;
    }
    public Product(String productName, double price, int stockQuantity)
    {
        if(stockQuantity < 0 || price < 0)
        {
            productName = "Unname";
            price = 0.0;
            stockQuantity = 0;
        }else{
            this.productName = productName;
            this.price = price;
            this.stockQuantity = stockQuantity;
        }
    }
    void displayInfo()
    {
        System.out.println("Product Name - " + productName);
        System.out.println("Price - " + price);
        System.out.println("Stock Quantity - " + stockQuantity);
    }
    public static void main(String[] args)
    {
        Product s1 = new Product();
        s1.displayInfo();

        Product s2 = new Product("Book", 195.64, 2);
        s2.displayInfo();

        Product s3 = new Product("Book", 195.64, 1);
        s3.displayInfo();
    }
}