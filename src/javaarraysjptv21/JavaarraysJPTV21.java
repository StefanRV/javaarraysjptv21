/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaarraysjptv21;

import java.util.Random;

/**
 *
 * @author pupil
 */
public class JavaarraysJPTV21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Random random = new Random();
        int numsum = 0;
        int max = 0;
        int min = 10;
        int max2 = 0;
        int min2 = 100;
        
        System.out.println("----Одномерные массивы----");
        int[] nums = new int[10];
        for(int i = 0; i < nums.length; i++){
            nums[i] = random.nextInt(10);
        }
            
        for(int i = 0; i < nums.length; i++){
            System.out.printf(" %3d ",nums[i]);
            numsum = nums[i] + numsum;
            if(min > nums[i]) min = nums[i];
            if(max < nums[i]) max = nums[i];
        }
        System.out.println("");
        System.out.println("sum = "+numsum);
        System.out.println("");
        System.out.println("min = "+min);
        System.out.println("");
        System.out.println("max = "+max);
        System.out.println("---многомерные массивы---");
        int [][] nums2 = new int[3][3];
        int sum2 = 0;
        int vertsum = 0;
        int horizsum = 0;
        int disum = 0;
        int disum2 = 0;
        int numb = 2;

        for(int i = 0; i<nums2.length; i++){
            for(int j = 0; j<nums2.length; j++){
                nums2[i][j] = random.nextInt(5);
                
            }
        }
        for(int i = 0; i < nums2.length; i++){
            for(int j = 0; j<nums2.length; j++){
                System.out.printf("%4d", nums2[i][j]);
                
                sum2 = nums2[i][j] + sum2;
                horizsum = horizsum + nums2[0][0];
                if(min2 > nums2[i][j]) min2 = nums2[i][j];
                if(max2 < nums2[i][j]) max2 = nums2[i][j];
                if(i == j) disum = disum + nums2[j][i];
                if(i == numb - j) disum2 = disum2 + nums2[j][i];
                
            }
            
            vertsum = vertsum + nums2[i][0+1];
            System.out.println("");
            
            
            
            
        }
        System.out.println("");
        System.out.printf("sum = "+sum2);
        System.out.println("");
        System.out.printf("min= "+min2);
        System.out.println("");
        System.out.printf("max= "+max2);
        System.out.println("");
        System.out.printf("vertsum= "+vertsum);
        System.out.println("");
        System.out.println("disum= "+disum);
        System.out.println("");
        System.out.println("disum2= "+disum2);
        System.out.println("horizsum= "+horizsum);
    }
    
}
