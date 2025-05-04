import itsc2214.*;
import java.util.*;
/**
* This is a class that allows the user to create a array of numbers and
* manipulate them with the method defined below.
@author  Ervin N Gordon III
@version Feb 04, 2025
*/
public class Project1 implements ArrayInt{

    private int capacity;
    private int[] numbers;
    private int size;
    /**
     * This is the constructor for the Project1 class.
     * @param capacity is the amount of elements that you assign to the 
     * array in the Project1 object.
     */
    public Project1(int capacity) {
        this.capacity = capacity;
        this.numbers = new int[capacity];
        this.size = 0;
    }
    /**
     * Returns the average of all elements in the array(has been tested).
     * @return Returns the average of all elements in the array(has been tested).
     */
    public double getAverage() throws IllegalStateException{
        if(this.isEmpty()){
            throw new IllegalStateException("This array has no values to average out.");
        }
        double sum = 0;
        for(int i= 0; i < this.size(); i++){
            sum +=  this.numbers[i];
        }
        return (double)sum / (double)this.size();
    }
    /**
     * Returns the median of a set of integers (has been tested).
     * @return Returns the median of a set of integers (has been tested).
     */
    public double getMedian(){
        Arrays.sort(this.numbers);
        int pos = this.numbers.length / 2;
        if(this.numbers.length % 2 != 0){
            return this.numbers[pos];
        }
        return  (double)(this.numbers[pos-1] + this.numbers[pos]) /2;  
    }
    /**
     * Returns the sum of the values two indexes of an array(has been tested).
     * @param index1 is the index of the first element that you want to add.
     * @param index2 is the index of the second element that you want to add.
     * @return return should return the minimum value that is in the array.
     */
    public int add(int index1, int index2){
        return this.numbers[index1] + this.numbers[index2];
    }
    /**
     * Returns the smallest value in a the array(has been tested).
     * @return  Returns the smallest value in a the array(has been tested).
     */
    public int getMinimum(){
        
        int min =Integer.MAX_VALUE;
        min = this.numbers[0];
        for(int i = 0; i< this.size(); i++){
            if(min > this.numbers[i]){
                min = this.numbers[i];
            }
        }
        return min;
    }
    /**
     * Returns the lagest value in the array(has been tested).
     * @return Returns the lagest value in the array(has been tested).
     */
    public int getMaximum(){
        
        int max = Integer.MIN_VALUE;
        for(int i = 0; i< this.size(); i++){
            if(max < this.numbers[i]){
                max = this.numbers[i];
            }
        }
        return max;
    }
    /**
     * Returns the difference between the largest and the smallest number in the array.
     * Method has been tested.
     * @return Returns the difference between the largest and the smallest number in the array.
     * Method has been tested.
     */
    public int getRange(){
        return this.getMaximum() - this.getMinimum();
    }

    /**
     * Returns the amount of element that can be held in an array (has been tested).
     * @return Returns the amount of elements in the array reguardless if it has a 
     * value stored in it.
     */
    public int getCapacity(){
        return this.numbers.length;
    }
    /**
     * Gets the number of element that are not equal to zero(has been tested).
     * @return Returns the number of elements in the array that are not equal to 0.
     */
    public int size(){ 
        int count =0;
        for(int n : this.numbers) {
            if(n !=0){
                count++;
            }else{
                continue;
            }
        }
        return count;
    }

    /**
     * Adds a value to the end of the array. 
     * Method has been tested and Exception has been tested.
     * @param var1 is the value the the user wants to set the element at the
     * end of the array to.
     */
    public void addValue(int var1) throws IllegalStateException {
        if (this.isFull()) {
            throw new IllegalStateException("Cannot add value: storage is full.");
        }
        this.numbers[this.size++] = var1;
    }
    /**
     * Returns the value in a specified index of the user(has been tested).
     * Exception has been tested.
     * @param index is the index of the element that the user wants to return.
     * @return Returns the value of the index the user wants.
    */
    public int getValue(int index) throws IndexOutOfBoundsException{
        if(index >= this.size()){
            throw new IndexOutOfBoundsException("Index out of Bounds.");
        }
        if(index < 0){
            throw new IndexOutOfBoundsException("Index out of Bounds.");
        }else{
            return this.numbers[index];
        }

    }
    /** 
     * Changes the values of a array element that is selected by the user
     * Method has been tested and Exception has been test.
     * @param var1 is the index of the element that the user wants to change.
     * @param var2 in the value that the user wants to set the index to.
     * @return returns the new value that the array has been set to.
     * */
    public int setValue(int var1, int var2) throws IndexOutOfBoundsException{
        if(var1 >= this.size()){
            throw new IndexOutOfBoundsException("Index out of Bounds.");
        }
        if(var1 < 0){
            throw new IndexOutOfBoundsException("Index out of Bounds.");
        }else{
            this.numbers[var1] = var2;
        }
        return this.numbers[var1];
    }
    
    /**
     * Adds a specified amount of random numbers between one and ten.
     * Method has been tested and Exception has been test.
     * @param n is the number of random value that the user 
     * wants to add to the end of the array.
     */
    public void addRandom(int n) throws IllegalStateException{
        if(this.isFull()){
            throw new IllegalStateException("Cannot add value: storage is full.");
        }        
                
        for(int i = 0; i < n ; i++){
            this.addValue((int)(Math.random() * 10) + 1);
             
                
        }   
        
    }
    /**
     * Determines is an Array is Empty (has been tested).
     * @return Returns true of false if the array is empty or not.
     */
    public boolean isEmpty(){
        if(this.size() == 0){
            return true;
        }
        return false;
      
    }
    /**
     * Determines if Array  is full(has been tested).
     * @return Returns true of false if the array is full or not.
     */
    public boolean isFull(){

        return this.size() == this.numbers.length;
    }
    /**
     * Determines is the array has duplicates(Has been tested).
     * @return Returns true or false if the array has two 
     * elements with the same value.
     */
    public boolean hasDuplicates() {
        for (int i = 0; i < this.size(); i++) {
            for (int j = i + 1; j < this.size(); j++) {
                if (this.numbers[i] == this.numbers[j]){
                    if(i != j) {
                        return true; 
                    }
                }
            }
        }
        return false; 
    }
    /**
     * Removes and element from an array (has been tested).
     * @param index is the element that the user wants to get rid of.
     */
    public void removeValueAt(int index) throws IndexOutOfBoundsException {
        if (index < 0 || index >= this.size()) {
            throw new IndexOutOfBoundsException("Index is out of bounds.");
        }
        for (int i = index; i < numbers.length - 1; i++) {
            this.numbers[i] = this.numbers[i + 1];
        }
        this.numbers[this.numbers.length - 1] = 0;
    }
}
