public class Main {
    public static void main(String[] args) {

        String symbol="ORCL";
        String name="Oracle Coparation";

        Stock newStock=new Stock(symbol,name);
        newStock.currentPrice=45;
        newStock.printInfo();




    }
}