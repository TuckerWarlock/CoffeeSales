public class CoffeeCalculations extends MainCoffeeSales{
    /*
    Two constant data fields:
    One for the price per pound, which is $5.99
    One for the tax rate, which is 7.25% (expressed as 0.0725)
     */
    final double PRICE_PER_POUND = 5.99;
    final double TAX_RATE = 0.0725;

    //A method named getSale() that returns the sale amount before tax.
    public double getSale(){
        double finalSale;
        finalSale = (PRICE_PER_POUND * numberOfBags);
        return finalSale;
    }

    //A method named getSaleTax() that returns the tax on the transaction.
    public double getSaleTax(){
        double salesTax;
        salesTax = (TAX_RATE * this.getSale());
        return salesTax;
    }

    //A method named getTotalPrice() that returns the total sale price.
    public double getTotalPrice(){
        double totalPrice;
        totalPrice = (this.getSaleTax() + this.getSale());
        return totalPrice;
    }

    //A method named getPrice() that returns the price per pound.
    public double getPrice(){
        return PRICE_PER_POUND;
    }

    //A method named getTaxRate() that returns the tax rate.
    public double getTaxRate(){
        return TAX_RATE;
    }
}
