package com.balceda;

public class Main {

    private static StockList stockList = new StockList();

    public static void main(String[] args) {
        StockItem temp = new StockItem("bread",0.86,100);
        stockList.addStock(temp);

        temp = new StockItem("cake",1.10,20);
        stockList.addStock(temp);
        temp = new StockItem("car",12.5,2);
        stockList.addStock(temp);
        temp = new StockItem("chair",30.5,10);
        stockList.addStock(temp);
        temp = new StockItem("cup",0.56,200);
        stockList.addStock(temp);
        temp = new StockItem("juice",2.50,100);
        stockList.addStock(temp);
        temp = new StockItem("door",72,4);
        stockList.addStock(temp);
        temp = new StockItem("phone",150.60,50);
        stockList.addStock(temp);
        temp = new StockItem("towel",5.70,15);
        stockList.addStock(temp);

        System.out.println(stockList);

        for (String s : stockList.items().keySet()){
            System.out.println(s);
        }
    }
}
