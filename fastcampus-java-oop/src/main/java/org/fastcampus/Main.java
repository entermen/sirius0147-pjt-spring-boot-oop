package org.fastcampus;

import org.fastcampus.logic.BubbleSort;
import org.fastcampus.logic.JavaSort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        BubbleSort<String> sort = new BubbleSort<>();

        System.out.println("Bubble Sort : "+sort.sort(
                Arrays.asList(args)
                )
        );
        JavaSort<String> javaSort = new JavaSort<>();

        System.out.println("Java Sort : "+javaSort.sort(
                Arrays.asList(args)
                )
        );
    }
}