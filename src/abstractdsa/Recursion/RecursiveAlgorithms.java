/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abstractdsa.Recursion;

/**
 *
 * @author kazybekkhairulla
 */

public class RecursiveAlgorithms
{

    
    public static void main(String[] args)
    {
        System.out.println(factorial(5));
        System.out.println(sum(5));
        System.out.println(fibbonaci(40));
    }
    public static int factorial (int n){
        if (n==1){
            return 1;
        }
        else{
            return n*factorial(n-1);
        }
    }
    public static int sum(int n)
    {
        if (n==1)
            return 1;
        else
            return n+sum(n-1);
    }
    public static int fibbonaci(int n)
    {
        if (n==1)
            return 1;
        else if (n==0)
            return 0;
        else
            return fibbonaci(n-1)+fibbonaci(n-2);
    }
    String newname;
    public static String reversename(String name)
    {
        
        /*
        EMILY
        Y EMIL
        YL EMI
        YLI EM
        YLIM E
        YLIME
        
        
        if (name.length() == 0)
            return newname + reversename();
        else
            return name-name[name.length()];
        */
        return "";
    }
}
