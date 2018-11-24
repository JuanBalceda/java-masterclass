package com.balceda;

import java.util.Map;

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
        temp = new StockItem("cup",0.40,7);
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

        Basket basket = new Basket("Juan");
        sellItem(basket, "phone",2);
        System.out.println(basket);

        sellItem(basket, "car",2);
        System.out.println(basket);

        sellItem(basket, "cup",100);
        System.out.println(basket);

        sellItem(basket, "laptop",2);
        System.out.println(basket);

        System.out.println(stockList);

        for (Map.Entry<String, Double> prices : stockList.priceList().entrySet()){
            System.out.println(prices.getKey() + " costs " + prices.getValue());
        }
    }

    public static int sellItem(Basket basket, String item, int quantity){
        StockItem stockItem = stockList.get(item);
        if (stockItem == null){
            System.out.println("We don't sell "+item);
            return 0;
        }

        if (stockList.sellStock(item, quantity) != 0){
            basket.addToBasket(stockItem,quantity);
            return quantity;
        }

        return 0;
    }
}
