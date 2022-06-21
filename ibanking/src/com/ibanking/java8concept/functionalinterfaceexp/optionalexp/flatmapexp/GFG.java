package com.ibanking.java8concept.functionalinterfaceexp.optionalexp.flatmapexp;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class GFG {
	  
    // Driver code
    public static void main(String[] args)
    {
  
        // Creating a List of Strings
        List<String> list = Arrays.asList("5.6", "7.4", "4",
                                          "1", "2.3");
  
        // Using Stream flatMap(Function mapper)
        list.stream().map(num -> Stream.of(num)).
                         forEach(System.out::println);
        
     // Using Stream flatMap(Function mapper)
        list.stream().flatMap(num -> Stream.of(num)).
                         forEach(System.out::println);
        
        
        
        
     // Creating a List of Strings
        List<String> list22 = Arrays.asList("Geeks", "GFG",
                                 "GeeksforGeeks", "gfg");
  
        // Using Stream flatMap(Function mapper)
        list22.stream().flatMap(str -> 
                         Stream.of(str.charAt(2))).
                         forEach(System.out::println);
    
    }
}
