package DesignPatterns.CreationalPattern.BUilder_pattern;

import java.util.ArrayList;
import java.util.List;

public class Order {
    List<HotelItem> ItemList = new ArrayList<HotelItem>();

    public void addItems(HotelItem item) {
        ItemList.add(item);
    }

    public float getTotalCost() {
        float totalCost = 0.0f;
        for (HotelItem item : ItemList) {
            totalCost = totalCost + item.price();
        }
        return totalCost;
    }

    public void showItem() {
        for (HotelItem item : ItemList) {
            System.out.println("Item name " + item.ItemName());
            System.out.println("Item name " + item.price());
            System.out.println(item.packing().Pack());
        }
    }

}
