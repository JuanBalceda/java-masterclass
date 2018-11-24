package com.balceda;

import java.util.Map;

public class Main {

    private static StockList stockList = new StockList();

    public static void main(String[] args) {
        StockItem temp = new StockItem("bread", 0.86, 100);
        stockList.addStock(temp);

        temp = new StockItem("cake", 1.10, 20);
        stockList.addStock(temp);
        temp = new StockItem("car", 12.5, 2);
        stockList.addStock(temp);
        temp = new StockItem("chair", 30.5, 10);
        stockList.addStock(temp);
        temp = new StockItem("cup", 0.56, 200);
        stockList.addStock(temp);
        temp = new StockItem("cup", 0.40, 7);
        stockList.addStock(temp);
        temp = new StockItem("juice", 2.50, 100);
        stockList.addStock(temp);
        temp = new StockItem("door", 72, 4);
        stockList.addStock(temp);
        temp = new StockItem("phone", 150.60, 50);
        stockList.addStock(temp);
        temp = new StockItem("towel", 5.70, 15);
        stockList.addStock(temp);

        System.out.println(stockList);

        Basket basket = new Basket("Juan");
        sellItem(basket, "phone", 2);
        sellItem(basket, "car", 1);
        sellItem(basket, "cup", 100);
        sellItem(basket, "laptop", 2);


        Basket basket2 = new Basket("TIm");
        sellItem(basket2, "phone", 3);
        sellItem(basket2, "car", 1);
        sellItem(basket2, "cup", 50);

        removeItem(basket2, "phone", 1);
        removeItem(basket, "car", 1);

        System.out.println(basket);
        System.out.println(basket2);

        System.out.println(stockList);

        checkOut(basket);
        checkOut(basket2);

        System.out.println(stockList);

    }

    public static int sellItem(Basket basket, String item, int quantity) {
        StockItem stockItem = stockList.get(item);
        if (stockItem == null) {
            System.out.println("We don't sell " + item);
            return 0;
        }

        if (stockList.reserveStock(item, quantity) != 0) {
            return basket.addToBasket(stockItem, quantity);
        }

        return 0;
    }

    public static int removeItem(Basket basket, String item, int quantity) {
        StockItem stockItem = stockList.get(item);
        if (stockItem == null) {
            System.out.println("We don't sell " + item);
            return 0;
        }

        if (basket.removeFromBasket(stockItem, quantity) == quantity) {
            return stockList.unreserveStock(item, quantity);
        }

        return 0;
    }

    public static void checkOut(Basket basket) {
        for (Map.Entry<StockItem, Integer> item : basket.items().entrySet()) {
            stockList.sellStock(item.getKey().getName(), item.getValue());
        }
        basket.clearBasket();
    }
}
