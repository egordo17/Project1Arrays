import org.junit.*;
import static org.junit.Assert.*;
/**
* These are a list of test cases ran to test the methods that are defined
* in the Project1 class and the MyArray interface.
@author  @TODO Put Your Name in the author tag
@version Feb 07, 2025
*/
public class Project1Test {
    
    private Project1 runner;
    private Project1 runner2;
    private Project1 runner3;
    private Project1 runner4;
    private Project1 runner5;
    private Project1 runner6;
   /**
    * setup() method, runs before each of your test methods.
    * Use this method to recreate the objects needed for
    * testing your class.
    */
    @Before
    public void setup() 
    {
        runner = new Project1(10);
        runner.addValue(3);
        runner.addValue(4);
        runner.addValue(6);
        runner.addValue(8);
        runner.addValue(9);
        runner.addValue(1);
        runner.addValue(5);
        runner.addValue(7);
        runner.addValue(2);
        runner.addValue(10);
    }
    /**
     * setup() method, runs before each of your test methods.
     * Use this method to recreate the objects needed for
     * testing your class.
     */
    @Before
    public void setup2() 
    {
        runner2 = new Project1(9);
        runner2.addValue(9);
        runner2.addValue(2);
        runner2.addValue(8);
        runner2.addValue(5);
        runner2.addValue(3);
        runner2.addValue(7);
        runner2.addValue(4);
        runner2.addValue(1);
        runner2.addValue(10);
    }
   /**
    * setup() method, runs before each of your test methods.
    * Use this method to recreate the objects needed for
    * testing your class.
    */
    @Before
    public void setup3() 
    {
        runner3 = new Project1(10);
        runner3.addValue(3);
        runner3.addValue(4);
        runner3.addValue(6);
        runner3.addValue(8);
        runner3.addValue(9);
    }
   /**
    * setup() method, runs before each of your test methods.
    * Use this method to recreate the objects needed for
    * testing your class.
    */
    @Before
    public void setup4() 
    {
        runner4 = new Project1(10);
    }
   /**
    * setup() method, runs before each of your test methods.
    * Use this method to recreate the objects needed for
    * testing your class.
    */
    @Before
    public void setup5() 
    {
        runner5 = new Project1(0);
    }
   /**
    * setup() method, runs before each of your test methods.
    * Use this method to recreate the objects needed for
    * testing your class.
    */
    @Before
    public void setup6() 
    {
        runner6 = new Project1(1);
    }
   /**
    * Determine if size returns the correct size.
    */
    @Test
    public void determinIfSizeWorks()
    {
       
      // 1. call the method
        int s =runner3.size();
      // 2. check expected results
        assertEquals(5, s);
    }
   /**
    * Check to see if getAverage() returns average of elements array.
    */
    @Test
    public void testGetAverage()
    {
      // 1. set up initial conditions.
        double delta = 0.001;
      // 2. call the method.
        runner.getAverage();
      // 3. check expected results.
        assertEquals(5.5, runner.getAverage(), delta);
    }
   /**
    * Determine if median gives the corret value for an array with an odd number of elements.
    */
    @Test
    public void testGetMedian()
    {
      // 1. call the method
        double med = runner2.getMedian();
        double delta = 0.001;
      // 2. check expected results
        assertEquals(5, med, delta);
    }
   /**
    * Test if getMedian() will return the correct median of array with even number of elements.
    */
    @Test
    public void testGetMedianWithEvenNumOfElements()
    {
      
      // 1. call the method.
        double med = runner.getMedian();
        double delta = 0.001;
      // 2. check expected results.
        assertEquals(5.5,med , delta);
    }
   /**
    * makes sure that method is able to add two different elements and return it.
    */
    @Test
    public void testAdd()
    {
      // 1. call the method.
        int sum = runner.add(4, 7);
      // 2. check expected results.
        assertEquals(16, sum);
    }

   /**
    * Makes sure that the getMinimum returns the smallest value.
    */
    @Test
    public void testGetMinium()
    {
       
      // 1. call the method.
        int min = runner.getMinimum();
        int min2 = runner4.getMinimum();
        int min3 = runner6.getMinimum();
      // 2. check expected results.
        assertEquals(1, min);
        assertEquals(0, min2);
        assertEquals(0, min3);
    }

   /**
    * Makes sure that getMaximum() returns the largest value.
    */
    @Test
    public void testGetMaximum()
    {
      
      // 1. call the method.
        int max = runner.getMaximum();
      // 2. check expected results.
        assertEquals(10 , max);
    }

   /**
    * Tests if get the right range.
    */
    @Test
    public void testGetRange()
    {
      // 1. call the method
        int ra = runner.getRange();
      // 2. check expected results
        assertEquals(9, ra);
    }

   /**
    * Test to see if the method will return the capacity that is set by the user.
    */
    @Test
    public void testGetCapacity()
    {
       
      // 2. call the method.
        int cap = runner.getCapacity();
      // 3. check expected results.
        assertEquals(10, cap);
    }

   /**
    * This test if the addValue method will add a value to the end of the collection of data.
    */
    @Test
    public void testAddValue()
    {
      // 1. call the method
        runner3.addValue(5);
        int s = runner3.size();
      // 2. check expected results
        assertEquals(6, s);
    }

   /**
    * Test if getValue returns the correct value.
    */
    @Test
    public void testGetValue()
    {
      // 1. call the method.
        int v = runner.getValue(5);
        
      // 2. check expected results.
        assertEquals(1, v);
        
    }

   /**
    * Tests if setValue changes the value of an elemnet in the array.
    */
    @Test
    public void testSetValue()
    {
      // 1. call the method.
        runner.setValue(9, 5);
        int m = runner.getValue(9);
       
       
      // 2. check expected results.
        assertEquals(5, m);
        
    }

   /**
    * Tests if addRandom adds the specified amount of random variables to the array.
    */
    @Test
    public void testAddRandom()
    {
       
      //1. call the method
        runner3.addRandom(3);
        int s = runner3.size();
      // 2. check expected results
        assertEquals(8, s);
    }

   /**
    * Test if returns  false when full and true if empty.
    */
    @Test
    public void testIsEmpty()
    {
      // 1. call the method
        boolean b = runner.isEmpty();
        boolean b2 = runner5.isEmpty();
      // 3. check expected results
        assertEquals(false, b);
        assertEquals(true, b2);
    }

   /**
    * Test if it returns true if full and false if empty.
    */
    @Test
    public void testIsFull()
    {
      // 1. set up initial conditions
      // 2. call the method
        boolean b = runner.isFull();
        boolean b2 = runner3.isFull();
      // 3. check expected results
        assertEquals(true, b);
        assertEquals(false, b2);
    }
   /**
    * Test to see if returns true if two elements have the same values and false 
    * if all elements have different values.
    */
    @Test
    public void testHasDuplicates()
    {
      // 1. set up initial conditions.
        runner4.addValue(1);
        runner4.addValue(1);
      
      // 2. check expected results.
        assertTrue(runner4.hasDuplicates());
        assertFalse(runner.hasDuplicates());
    }
   /**
    * Test if removeValue works.
    */
    @Test (expected = IndexOutOfBoundsException.class)
    public void testRemoveValue()
    {
      // 1. call the method.
        runner.removeValueAt(7);
        int m = runner.getValue(9);
        runner.removeValueAt(-1);
      // 3. check expected results.
        assertEquals(0, m);
    }

   /**
    * Tests if addValue() will throws exception.
    */
    @Test(expected = IllegalStateException.class)
    public void testAddValueThrowsException()
    {
      // 1. call the method.
        runner.addValue(12); 
    }
   /**
    * Tests if getValue throws exception.
    */
    @Test (expected = IndexOutOfBoundsException.class)
    public void testGetValueException()
    {
      // 1. call the method.
        runner.getValue(11);
         
    }
   /**
    * Tests if getValue throws exception.
    */
    @Test (expected = IndexOutOfBoundsException.class)
    public void testGetValueException2()
    {
      // 1. call the method.
        
        runner.getValue(-1);  
    }

   /**
    * Tests if setValueException() throw exception.
    */
    @Test (expected = IndexOutOfBoundsException.class)
    public void testSetValueException()
    {
      // 1. call the method.
        runner.setValue(11, 3);
        
    }
   /**
    * Tests if setValueException() throw exception.
    */
    @Test (expected = IndexOutOfBoundsException.class)
    public void testSetValueException2()
    {
      // 1. call the method.
        
        runner.setValue(-1, 3);
    }
   /**
    * Test if addRandom() throws exception.
    */
    @Test(expected = IllegalStateException.class)
    public void testAddRandomException()
    {
      //1. Call method.
        runner3.addRandom(7);
    }
/**
    * Test if addRandom() throws exception.
    */
    @Test(expected = IllegalStateException.class)
    public void testAddRandomExceptionWhenAlreadyFull()
    {
      //1. Call method.
        runner.addRandom(7);
    }
   /**
    * Tests if removeValueAt() throws exception.
    */
    @Test(expected = IndexOutOfBoundsException.class)
    public void testRemoveValueAtException()
    {
      // 1. call the method
        runner.removeValueAt(11);

    }
   /**
    * Testing to determine if getMedian() will return zero for an empty array.
    */
    @Test
    public void testGetMedian2()
    {
      // 1. Call the method.
        double num = runner4.getMedian();
        double delta = .001;
      // 2. Check expected results.
        assertEquals(0, num, delta);
    }
}
    

