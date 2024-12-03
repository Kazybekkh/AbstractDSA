/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abstractdsa;

/**
 *
 * @author kazybekkhairulla
 */
public class rpnCalculator
{
    public static void main(String[] args)
    {
        StaticStack myStack = new StaticStack(10);
        String data = "";
        do
        {
            data = IBIO.input("Enter a digit or a sign: ");
            
            if (data.equals("+"))
            {
                myStack.push(myStack.pop() + myStack.pop());
            }
            else if (data.equals("*"))
            {
                myStack.push(myStack.pop() * myStack.pop());
            }
            else if (data.equals("-"))
            {
                int d1 = myStack.pop();
                int d2 = myStack.pop();
                myStack.push(d2-d1);
                // if you don't do this, you end up with negative number. First number is below the subsequent num, so to get the first num use this.
            }
            else if (data.equals("/"))
            {
                myStack.push(myStack.pop() * myStack.pop());
            }
            else if(data.equals("="))
            {
                System.out.println(myStack.pop());
            }
            else
            {
                myStack.push(Integer.parseInt(data));
            }
        }
        while(!data.equals("="));
        
        // you can use substring
    }
    
}