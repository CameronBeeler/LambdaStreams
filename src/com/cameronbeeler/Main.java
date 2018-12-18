package com.cameronbeeler;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<String> someBingoNumbers = Arrays.asList(
                "B1", "B5",
                "I1","I3",
                "N11","N12", "N15",
                "G5", "G12","g13",
                "O17", "O23", "O33"
        );

        someBingoNumbers
                .stream()
                .map(String::toUpperCase)
                .filter(s->s.startsWith("G"))
                .sorted()
                .forEach(System.out::println);

   //     someBingoNumbers.forEach(number->{
    //        if(number.toUpperCase().startsWith("G"))
     //       {
      //          System.out.println(number);
//            }
 //       });
	// write your code here
    }
}
