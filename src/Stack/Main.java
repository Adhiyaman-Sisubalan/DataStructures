package Stack;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class Main {

        public static void main(String[] args) {
            //System.out.println(reverseString("abcd"));

            String str = "[(1+2)]";

            Expression ex = new Expression();
            System.out.println(ex.isBalanced(str));
        }

        public static String reverseString(String item){
            if(item == null)
                throw new IllegalArgumentException();
            Stack st = new Stack();
            for (var i : item.toCharArray())
                st.push(i);
            StringBuffer reversedString = new StringBuffer();
            while (!st.empty())
                reversedString.append(st.pop());

            return reversedString.toString();
        }



    }
