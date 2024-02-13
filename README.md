# Problem Set 1
## Top Three
### Provide the body of the class Top which implements the interface Sequence detailed below.
### Submission Instructions

First, please make sure that you do not modify the signature of the Top class. This is required for the autograder to run.
You can keep making changes until the submission deadline. Your code will be frozen and marked after the deadline has passed.

In this problem, you are to write a class Top that implements the following interface:
      <pre>
      <code class="language-cpp">
      public interface Sequence
      {
          void push( String st );
          ArrayList<String> getTopThree();
          void reset();
      }
      </code>
      </pre>
This interface is provided in a file called <strong> Sequence.java </strong> and a skeleton for the class is provided in <strong>Top.java</strong> for you.

Your class should in particular implement these methods so that it keeps track of the lowest 3 strings that have been passed to the method <strong>push</strong>. 
Here, when we say lowest, we mean according to the <strong>compareTo()</strong> method of the <strong>String</strong> class; here, when str1 and st2 are Strings, we consider str1 lower than str2 when <strong>str1.compareTo(str2)</strong> returns a negative value. 
Strings that are repeats of previously seen strings should be ignored.
The getTopThree() method should create a <strong>new</strong> object of type ArrayList, populate it with the lowest 3 strings seen so far (via <strong>push</strong>), in lowest-to-highest order, and return the object. 
As repeats should be ignored, no two entries of the returned list should be textually equal to each other. If the number of strings that was seen is strictly less than 3, then all of those strings should be present in the returned list.

The reset() method should reset the tracking.

### Your class should not maintain a collection of all of the strings seen; the member variable(s) of your class should store a number of strings that stays below a fixed limit, regardless of how many times the push method is called.
As an example, the code fragment
#
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
      
would result in the following being printed out:

      <pre>
      <code class="language-cpp">      
      [a, abba, b]
      [Jim, Jules]
      [I, J, Jim]
      </code>
      </pre>
