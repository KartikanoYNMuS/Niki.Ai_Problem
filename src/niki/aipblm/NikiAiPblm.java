/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package niki.aipblm;

import java.util.Scanner;

/**
 *
 * @author jain
 */
public class NikiAiPblm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int t; //no. of test cases
        Scanner sc=new Scanner(System.in);
        t=sc.nextInt();
        if(t>=1 || t<=1000){
        while(t>0){
            long n;
            n=sc.nextLong();
            //As their is a pattern therefore solved in O(1) complexity
            long l=(n*(n-1))/2;
            double total=Math.pow(2,n);//total number of possibilities for length n string 
            long g=(long)total;//casting double to long
            long numfinal;
            numfinal=g-l;
            System.out.println(numfinal);
            t--;
        }
    }
        else{
            System.out.println("Allowed value of t is between 1 and 1000 ");
        }
    }
}
