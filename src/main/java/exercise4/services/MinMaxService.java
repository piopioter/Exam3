package exercise4.services;


import exercise4.models.MinMax;

import java.util.List;

public class MinMaxService {


    public static <T extends Comparable<T>> MinMax<T> getMinAndMax(List<T> elements) {
        T min = elements.get(0);
        T max = elements.get(0);
        for (T element : elements) {
            if (element.compareTo(min) > 0)
                min = element;
            if (element.compareTo(max) < 0)
                max = element;


        }
        MinMax<T> minMax = new MinMax<>(max, min);
        return minMax;
    }


}
