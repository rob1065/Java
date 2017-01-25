
package javaapplication24;

public class JavaApplication24 {

    
    public static void main(String[] args) {
        
       // Random random = new Random();
        
        int [][] one = {{3,4,5,6,7,9,2,3,4,10},
                        {15,25,34,56,78,4,6,7,2,9},
                        {22,55,77,99,1,2,3,4,6,9}
        };
        
        for(int row = 0; row < one.length; row++){
            for(int colum = 0; colum < one[row].length; colum++){
                  System.out.println(one[row][colum] +"\t ");
             }
            System.out.println();
                }
        
        }
    }
    



