/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abstractdsa.LinkedListIB;

/**
 *
 * @author kazybekkhairulla
 */
public class LinkedListDemo {
    public static void main(String[] args)
    {
        List myList = new List();
        // add to front
        myList.addToFront(5);
        myList.printlist();
        myList.addToFront(10);
        myList.printlist();
        myList.addToFront(3);
        myList.printlist();
        myList.addToFront(1);
        myList.printlist();
        myList.addToFront(13);
        myList.printlist();
        
        myList.addToBack(0);
        myList.printlist();
        myList.removeFromBack();
        myList.printlist();
        myList.removeFromBack();
        myList.printlist();
        myList.removeFromBack();
        myList.printlist();
        myList.removeFromBack();
        myList.printlist();
        myList.removeFromBack();
        myList.printlist();
        //myList.removeFromBack();
        
    }
}
