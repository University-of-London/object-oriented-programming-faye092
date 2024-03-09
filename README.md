<style type="text/css">.rendered-markdown{font-size:14px} .rendered-markdown>*:first-child{margin-top:0!important} .rendered-markdown>*:last-child{margin-bottom:0!important} .rendered-markdown a{text-decoration:underline;color:#b75246} .rendered-markdown a:hover{color:#f36050} .rendered-markdown h1, .rendered-markdown h2, .rendered-markdown h3, .rendered-markdown h4, .rendered-markdown h5, .rendered-markdown h6{margin:24px 0 10px;padding:0;font-weight:bold;-webkit-font-smoothing:antialiased;cursor:text;position:relative} .rendered-markdown h1 tt, .rendered-markdown h1 code, .rendered-markdown h2 tt, .rendered-markdown h2 code, .rendered-markdown h3 tt, .rendered-markdown h3 code, .rendered-markdown h4 tt, .rendered-markdown h4 code, .rendered-markdown h5 tt, .rendered-markdown h5 code, .rendered-markdown h6 tt, .rendered-markdown h6 code{font-size:inherit} .rendered-markdown h1{font-size:28px;color:#000} .rendered-markdown h2{font-size:22px;border-bottom:1px solid #ccc;color:#000} .rendered-markdown h3{font-size:18px} .rendered-markdown h4{font-size:16px} .rendered-markdown h5{font-size:14px} .rendered-markdown h6{color:#777;font-size:14px} .rendered-markdown p, .rendered-markdown blockquote, .rendered-markdown ul, .rendered-markdown ol, .rendered-markdown dl, .rendered-markdown table, .rendered-markdown pre{margin:15px 0} .rendered-markdown hr{border:0 none;color:#ccc;height:4px;padding:0} .rendered-markdown>h2:first-child, .rendered-markdown>h1:first-child, .rendered-markdown>h1:first-child+h2, .rendered-markdown>h3:first-child, .rendered-markdown>h4:first-child, .rendered-markdown>h5:first-child, .rendered-markdown>h6:first-child{margin-top:0;padding-top:0} .rendered-markdown a:first-child h1, .rendered-markdown a:first-child h2, .rendered-markdown a:first-child h3, .rendered-markdown a:first-child h4, .rendered-markdown a:first-child h5, .rendered-markdown a:first-child h6{margin-top:0;padding-top:0} .rendered-markdown h1+p, .rendered-markdown h2+p, .rendered-markdown h3+p, .rendered-markdown h4+p, .rendered-markdown h5+p, .rendered-markdown h6+p{margin-top:0} .rendered-markdown ul, .rendered-markdown ol{padding-left:30px} .rendered-markdown ul li>:first-child, .rendered-markdown ul li ul:first-of-type, .rendered-markdown ol li>:first-child, .rendered-markdown ol li ul:first-of-type{margin-top:0} .rendered-markdown ul ul, .rendered-markdown ul ol, .rendered-markdown ol ol, .rendered-markdown ol ul{margin-bottom:0} .rendered-markdown dl{padding:0} .rendered-markdown dl dt{font-size:14px;font-weight:bold;font-style:italic;padding:0;margin:15px 0 5px} .rendered-markdown dl dt:first-child{padding:0} .rendered-markdown dl dt>:first-child{margin-top:0} .rendered-markdown dl dt>:last-child{margin-bottom:0} .rendered-markdown dl dd{margin:0 0 15px;padding:0 15px} .rendered-markdown dl dd>:first-child{margin-top:0} .rendered-markdown dl dd>:last-child{margin-bottom:0} .rendered-markdown blockquote{border-left:4px solid #DDD;padding:0 15px;color:#777} .rendered-markdown blockquote>:first-child{margin-top:0} .rendered-markdown blockquote>:last-child{margin-bottom:0} .rendered-markdown table th{font-weight:bold} .rendered-markdown table th, .rendered-markdown table td{border:1px solid #ccc;padding:6px 13px} .rendered-markdown table tr{border-top:1px solid #ccc;background-color:#fff} .rendered-markdown table tr:nth-child(2n){background-color:#f8f8f8} .rendered-markdown img{max-width:100%;-moz-box-sizing:border-box;box-sizing:border-box} .rendered-markdown code, .rendered-markdown tt{margin:0 2px;padding:0 5px;border:1px solid #eaeaea;background-color:#f8f8f8;border-radius:3px} .rendered-markdown code{white-space:nowrap} .rendered-markdown pre>code{margin:0;padding:0;white-space:pre;border:0;background:transparent} .rendered-markdown .highlight pre, .rendered-markdown pre{background-color:#f8f8f8;border:1px solid #ccc;font-size:13px;line-height:19px;overflow:auto;padding:6px 10px;border-radius:3px} .rendered-markdown pre code, .rendered-markdown pre tt{margin:0;padding:0;background-color:transparent;border:0}</style>
<div class="rendered-markdown"><h1>Coursework Brief - MSc Computer Science</h1>
<h2>Module: CSM080, Objected Oriented Programming</h2>
<h2>Coursework: January to April 2024 study session - End of Term Coursework Assessment</h2>
<h3>Submission Deadline: Monday, 8 April 2024 by 13.00 Greenwich Mean Time</h3>
<ul>
<li>Please note: When the due date is reached, the version you have submitted last, will be considered as your final submission and it will be the version that is marked.</li>
<li>Once the due date has passed, it will not be possible for you to upload a different version of your coursework assessment. Therefore, you must ensure you have submitted the correct version of your coursework assessment which you wish to be marked, by the due date.</li>
</ul>
<p><strong>Note</strong>: Coursework is weighted at 75% of final mark for the module.</p>
<h3>Coursework Description: Saddle Points</h3>
<p>Consider the following very simple &ldquo;game&rdquo;.  There is a two-dimensional array of numbers, and two players, <em>Maxie</em> and <em>Minnie</em>. At each turn, independently of each other, Max chooses a row and Min chooses a column. Where they intersect is the amount of money Min pays to Max (if it is <em>negative</em>, then
<br  />Max pays Min).</p>
<p>For example, if Max chooses row 1 and Min chooses column 1, then Max wins £14 from Min. If Max chooses row 3 and Min chooses column 2, then Max pays Min £10.
<br  />In general, Max wants larger numbers, and Min wants smaller numbers.</p>
<p>How should they play?</p>
<p><img src="tab1.png" alt="Game Example" title="Example Game" /></p>
<p>Your class should be named <code>SaddlePoints</code>; this class, and a <code>Main</code> class, should be placed inside a package called <code>saddlePoints</code>.
<br  /><strong>Note</strong> see how these are capitalised and utilise <em>CamelCase</em>.</p>
<p><img src="tab2.png" alt="Another game example" title="Another example game" /></p>
<p>For each player, we pick the <em>&ldquo;best of the worst&rdquo;</em>. In this example, the worst Max can do if he picks row 0 is -9; if row 1, then 5; if row 2, then -8; and if row 3, then -10. Of these possible worst outcomes, Max prefers the largest, which is 5 (row 1).</p>
<p>Similarly, Min wants smaller numbers. The worst she can do if she picks column 0 is 10; if column 1, then 17; and if column 2, then 5. Of these possible worst outcomes,
<br  />Min prefers the smallest, which is 5 (column 2).</p>
<p>Since the &ldquo;best of the worst&rdquo; (the maximum of the minimums) for Max is 5, and the &ldquo;best of the worst&rdquo; (the minimum of the maximums) for Min is also 5, then Max
<br  />should always choose row 1, and Min should always choose column 2.</p>
<p>This entry of 5, at row 1 and column 2, is called a <em>saddle point</em>. A <em>saddle point</em> is defined to be an entry such that it is minimum in its row and maximum in its column. Indeed, if Min does choose column 2, then Max will do worse by choosing any other row; if Max does choose row 1, then Min will do worse by choosing any other column.</p>
<p>It is possible for there to be more than one saddle point, but in this case, it is known that they will have the same value.</p>
<h2>Specifications</h2>
<p>Here are the computational methods you shall implement. You shall develop a unit test for each of these methods.</p>
<ul>
<li><p><code>int[][] createRandomArray(int numberOfRows, int numberOfColumns, int minValue, int maxValue)</code>
<br  />Creates and returns an array of the given size and fills it with random values in the specified range.</p>
</li>
<li><p><code>int largest(int[] array)</code>
<br  />Finds the largest value in an array of integers.</p>
</li>
<li><p><code>int smallest(int[] array)</code>
<br  />Finds the smallest value in an array of integers.</p>
</li>
<li><p><code>int[] largestValues(int[][] array)</code>
<br  />Takes a two-dimensional array of integers and returns a one-dimensional array containing the largest values in each column (such as the array <code>[10, 17, 5]</code> in the above example).</p>
</li>
<li><p><code>int[] smallestValues(int[][] array)</code>
<br  />Takes a two-dimensional array of integers and returns a one-dimensional array containing the smallest values in each row (such as the array <code>[-9, 5, -8, -10]</code> in the above example).</p>
</li>
<li><p><code>boolean hasSaddlePoint(int[][] array)</code>
<br  />Takes a two-dimensional array of integers and returns <code>true</code> if it has a saddle point and <code>false</code> if it does not.</p>
</li>
<li><p><code>int saddlePointRow(int[][] array)</code>
<br  />Takes a two-dimensional array of integers that is known to have a saddle point, and returns the row number of that saddle point. If there is more than one saddle point, returns the number of any row that contains a saddle point.</p>
</li>
<li><p><code>int saddlePointColumn(int[][] array)</code>
<br  />Takes a two-dimensional array of integers that is known to have a saddle point, and returns the column number of that saddle point. If there is more than one saddle point, returns the number of any column that contains a saddle point.</p>
</li>
</ul>
<p>Here are the I/O methods for which you <strong>do not</strong> need unit tests:</p>
<ul>
<li><p><code>public static void main(String[] args)</code>
<br  />This is responsible for just calling <code>run()</code>.</p>
</li>
<li><p><code>void run()</code><br />
<br  />Creates arrays various sizes (including some 2x2 arrays and some larger), fills them with random values, and prints each array and information about it.
<br  />Keeps generating arrays until it has printed at least one with and one without a saddle point. (Smaller arrays are more likely to have a saddle point; about half of randomly generated 2 by 2 arrays will have one.)</p>
</li>
<li><p><code>void printArray(int[][] array)</code><br />
<br  />Prints the array.</p>
</li>
<li><p><code>void printArrayInfo(int[][] array)</code><br />
<br  />Prints whether the given array has a saddle point, and if so, where it is (row and column) and what its value is. (If there are multiple saddle points, just print any one.)</p>
</li>
</ul>
<p>To save you some typing, we have provided the file <code>SaddlePoints.java</code>, in which all the methods have been entered as stubs, and the comments have been mostly filled out. Start IntelliJ, create the project and the package, and away you go!</p>
<h3>JUnit tests in Java</h3>
<p>We also provide the template for your tests in <code>SaddlePointsTest.java</code>.  Here are some of the more useful JUnit methods:</p>
<ul>
<li><code>assertEquals(expectedValue, actualValue);</code></li>
<li><code>assertArrayEquals(expectedArray, actualArray);</code></li>
<li><code>assertTrue(condition);</code></li>
<li><code>assertFalse(condition);</code></li>
<li><code>fail();</code></li>
</ul>
<p>The method</p>
<pre><code>createRandomArray(numberOfRows, numberOfColumns, minValue, maxValue) 
</code></pre>
<p>should return a different value every time, but you can still test it. Testing whether it's &ldquo;really random&rdquo; is difficult, but the following tests are pretty easy:</p>
<ul>
<li>Test whether the array has the requested number of rows and columns.</li>
<li>Test if all the numbers in the array are in the specified range.</li>
<li>Test that the array isn't full of the same number, repeated over and over.
<br  />(This could happen even if your code is correct; but by choosing a larger array or a
<br  />larger range of values, you can make it extremely unlikely - say, once in a million times.)</li>
</ul>
<h3>Random Numbers</h3>
<p>You will need to import <code>java.util.Random</code>.  You will need to create a random number generator (an instance of the class <code>Random</code>); you will only need one of these.</p>
<p>To get numbers in a reasonable range, you will need to call one of the methods defined in <code>Random</code>. Please read  <a href="https://docs.oracle.com/javase/9/docs/api/java/util/Random.html">this documentation</a> for more information.</p>
<h3>Arrays in Java</h3>
<p>Arrays in Java are like lists in Python, and are indexed the same way. However, the size of an array is specified when you create the array, and you can't add or delete elements. (You can, however, assign a different array to the variable.) You can declare arrays like this:</p>
<ul>
<li><code>type [] name = new type[size];</code></li>
<li><code>type [][] name = new type[rows][columns];</code></li>
</ul>
<p>Declared in this way, all locations in the new array contain <code>null</code>, zero, or false, depending on the type of the array. You can put specific values in an array when you declare it (but not later) like this:</p>
<ul>
<li><code>type [] name = {value1, ..., valueN};</code></li>
<li><code>type [][] name = {{value1_1, ..., value1_N}, ... {valueN_1, ..., valueN_N}};</code></li>
</ul>
<p>To use a literal array in a statement, rather than in a declaration, the syntax is a little different:</p>
<ul>
<li><code>name = type [] {value1, ..., valueN};</code></li>
<li><code>name = type [][] {{value1_1, ..., value1_N}, ... {valueN_1, ..., valueN_N}};</code></li>
</ul>
<p>For testing purposes, you can start by using the following game,</p>
<pre><code>     int[][] with = {{-9, 12, -6},
                     { 7, 14,  5}, 
                     {10, -8,  3}, 
                     { 6, 17,-10}};
</code></pre>
<p>which has a saddle point, and this further game</p>
<pre><code>     int[][] without = {{ 1, -2,  3},
                        {-6,  5, -4}, 
                        { 7, -8,  9}};
</code></pre>
<p>which does not.</p>
<h3>Assessment Criteria:</h3>
<p>Please refer to Appendix C of the Programme Regulations for detailed Assessment Criteria.</p>
<h3>Plagiarism:</h3>
<p>This is cheating. Do not be tempted and certainly do not succumb to temptation. Plagiarised copies are invariably rooted out and severe penalties apply. All assignment submissions are electronically tested for plagiarism. More information may be accessed via: https://learn.london.ac.uk/course/view.php?id=3</p>
</div>