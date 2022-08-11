package Stack;

import java.util.Stack;

public class Main {

        public static void main(String[] args) {
            System.out.println(reverseString("abce"));
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
