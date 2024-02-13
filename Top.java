import java.io.*;
import java.util.*;

public class Top implements Sequence {
    private ArrayList<String> topThree;
    private final int MAX_SIZE = 3;

    public Top() {
        topThree = new ArrayList<>();
    }

    @Override
    public void push(String st) {
        if (!topThree.contains(st)) {
            topThree.add(st);
            Collections.sort(topThree);
            if (topThree.size() > MAX_SIZE) {
                topThree.remove(topThree.size() - 1);
            }
        }
    }

    @Override
    public ArrayList<String> getTopThree() {
        return new ArrayList<>(topThree);
    }

    @Override
    public void reset() {
        topThree.clear();
    }


 public static void main(String[] args){
      Top t = new Top();
      t.push( "b");
      t.push( "a" );
      t.push( "c" );
      t.push( "abba" );
      System.out.println( t.getTopThree());

      t.reset();
      t.push( "Jules" );
      t.push( "Jim" );
      System.out.println( t.getTopThree());

      for( char ch = 'I'; ch <= 'Z'; ch++ )
      {
          t.push( "" + ch );
      }
      System.out.println( t.getTopThree());
 }
}