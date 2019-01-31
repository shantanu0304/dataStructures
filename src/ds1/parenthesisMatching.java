package ds1;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class parenthesisMatching {
    public static void main(String[] args) {

        Scanner ob = new Scanner(System.in);
        int c=0;


        int t = ob.nextInt();
        for (int j = 0; j <t ; j++) {
            Stack<Character> stack = new Stack<Character>();
            String s = ob.next();
            c=0;

            for(int i=0;i<s.length();i++)
            {
                if(s.charAt(i) == '<')
                {
                    stack.push(s.charAt(i));
                }
                else {
                    if(stack.empty() == false){
                        if ((s.charAt(i) == '>')&&(stack.peek() == '<')) {
                            stack.pop();
                            c += 2;
                        }
                    }

                }
            }

            System.out.println(c);

        }


    }

}
