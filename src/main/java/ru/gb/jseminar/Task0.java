package ru.gb.jseminar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Task0 {

    // Дана последовательность чисел. Необходимо вернуть сумму уникальных чисел
    public static void main(final String[] args) {
        List<Integer> array = new ArrayList<>(Arrays.asList(1,2,3,4,2));
        Task0 test = new Task0();
        System.out.println(test.getSumOfUniqueValues(array));
    }

    public Integer getSumOfUniqueValues(final List<Integer> list){
        Map <Integer, Integer> book = new HashMap<>();
        for (Integer i : list){
            if (!book.containsKey(i)){
                book.put(i, 0);
            } else {
                book.put(i, book.get(i)+1);
            }
        }
        int sum = 0;
        for (Integer i : book.keySet()){
            if (book.get(i) == 0){
                sum+= i;
            }
        } 
        return sum;
    }

}
