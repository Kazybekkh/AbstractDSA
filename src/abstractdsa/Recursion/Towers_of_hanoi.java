/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abstractdsa.Recursion;

/**
 *
 * @author kazybekkhairulla
 */

public class Towers_of_hanoi
{

    
    public static void main(String[] args)
    {
        recursiveHanoi(10, "A", "B","C");
    }
    
    public static void recursiveHanoi(int diskNumber, String source_peg, String temp_peg, String destin_peg){
        if (diskNumber == 1){
            System.out.println("Move 1 disk from " + source_peg + " to " + destin_peg);
        }
        else
        {
            recursiveHanoi(diskNumber - 1, source_peg, destin_peg, temp_peg);
            recursiveHanoi(1, source_peg, temp_peg, destin_peg);
            recursiveHanoi(diskNumber -1, temp_peg, source_peg, destin_peg);
        }
    }
}