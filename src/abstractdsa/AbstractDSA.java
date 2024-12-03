/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package abstractdsa;
/**
 *
 * @author kazybekkhairulla
 */
public class AbstractDSA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        String hello = "Hello my name is Kazybek!";
        String regex = "[,\\.\\s]";

        String[] helloArray = hello.split(" ");
        for (String i : helloArray){
            list.addFirst(i);
        }
        
        list.printAll();
    }
    
}
