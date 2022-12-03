public class Stock {
    public String symbol=null;
    public String name=null;
    public double previousClosingPrice=34.5;
    public double currentPrice=previousClosingPrice;

    Stock (String sym,String nam){
        symbol=sym;
        name=nam;
    }

    public double getChangePercent(){
        return ((currentPrice-previousClosingPrice)/previousClosingPrice)*100;
    }

    public void printInfo(){
        System.out.println("\n"+symbol+"\n"+name+
                "\nPrevious Closing Price: " +previousClosingPrice+
                "\nCurrent Price: "+currentPrice+
                "\nChange Percent: "+getChangePercent());
    }
}
