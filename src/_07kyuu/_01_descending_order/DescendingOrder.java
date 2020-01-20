package _07kyuu._01_descending_order;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*
Description:
Your task is to make a function that can take any non-negative integer as a argument and
return it with its digits in descending order. Essentially, rearrange the digits to create
the highest possible number.

Examples:
Input: 21445 Output: 54421
Input: 145263 Output: 654321
Input: 123456789 Output: 987654321

JUnit test: OK
 */
public class DescendingOrder {

    public static void main(String[] args) {

        System.out.println(sortDesc(21445 ));
        System.out.println(sortDesc(145263 ));
        System.out.println(sortDesc(123456789 ));

    }

    public static int sortDesc(final int num) {

        String x = String.valueOf(num);

        List<String>arrayWithList=Arrays.asList(x.split(""));
        Collections.sort(arrayWithList, Collections.reverseOrder());

        String concatStrings="";
        for (String str : arrayWithList) {
            concatStrings+=str;
        }
        return Integer.parseInt(concatStrings);

    }
}