package com.epam.collections.queue;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class DishOrderDeterminer {
    public List<Integer> determineDishOrder(int numberOfDishes, int everyDishNumberToEat) {
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 1; i <= numberOfDishes; i++) {
            queue.add(i);
        }
        List<Integer> order = new ArrayList<>();
        while (!queue.isEmpty()) {
            for (int i = 0; i < everyDishNumberToEat - 1; i++) {
                int dish = queue.remove();
                queue.add(dish);
            }
            int lastDish = queue.remove();
            order.add(lastDish);
        }

        return order;
    }
}

