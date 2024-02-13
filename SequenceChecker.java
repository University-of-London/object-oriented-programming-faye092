import java.io.*;
import java.util.*;

public class SequenceChecker {
    public static void main( String[] args )    {        
      	 // Test 1
         Top t = new Top();
         System.out.println( "Class built." );
         // Test 2
         t.push("b");
         t.push("a");
         t.push("c");
         t.push("abba");
         System.out.println(t.getTopThree());
         // Test 3
         t.reset();
         t.push("Jules");
         t.push("Jim");
         System.out.println(t.getTopThree());
         // Test 4
         for (char ch = 'I'; ch <= 'Z'; ++ch) {
            t.push("" + ch);
         }
         System.out.println(t.getTopThree());
         // Test 5
         t.reset();
         t.push("Bules");
         t.push("Tim");
         t.push("Bules");
         t.push("Tim");
         System.out.println(t.getTopThree());

         // Test 6
         t.reset();
         t.push("John");
         System.out.println(t.getTopThree());

         // Test 7
         t.reset();
         for (int i = 0; i <= 100; ++i) {
            t.push("JulesAndTim");
         }
         System.out.println(t.getTopThree());

         // Test 8
         t.reset();
         t.push("A");
         t.push("AB");
         t.push("ABC");
         t.push("ABCD");
         System.out.println(t.getTopThree());

         // Test 9
         t.reset();
         t.push("AB");
         t.push("AB");
         t.push("A");
         t.push("ABC");
         t.push("ABC");
         t.push("B");
         t.push("C");
         System.out.println(t.getTopThree());

         // Test 10
         t.reset();
         char[] data = new char[1000000];
         Arrays.fill(data, 'a');
         String str = new String(data);
         t.push(str);
         System.out.println(t.getTopThree());

    }
}