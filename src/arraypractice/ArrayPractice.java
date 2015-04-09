/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraypractice;

/**
 *
 * @author MHerzog
 */
public class ArrayPractice {
    
    public static void sum(int[] array){
        int sum = 0;
        for(int i= 0; i< array.length; i++){
            sum += array[i];
        }
        System.out.printf("Sum: %d\n", sum);
    }
    
    public static void main(String[] args) {
        int[] array2 = {5, 5, 5, 5, 6};
        int[] array3 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        sum(array2);
        sum(array3);
    }
    
}
