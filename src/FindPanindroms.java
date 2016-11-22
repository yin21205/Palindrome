
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.StringTokenizer;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Yasitha
 */
public class FindPanindroms {
    
    
String filepath;

    public static void main(String[] args) {
        FindPanindroms findPanindroms = new FindPanindroms();
        for (String token : findPanindroms.getTokensList(new ReadFile().getFile())) {
            if(findPanindroms.isPanindrom(token))
                System.out.println(token);
        }
    }

    StringTokenizer st;
    List tokens;

    public List<String> getTokensList(String text) {
        st = new StringTokenizer(text, " +");
        tokens = new ArrayList<String>();
        while (st.hasMoreTokens()) {
            tokens.add(st.nextToken().trim());
        }
        return tokens;
    }

    char[] temp;
    String reversedText;
    Stack<Character> reverseStack;

    public boolean isPanindrom(String token) {
        temp = token.toCharArray();
        reverseStack = new Stack<>();
        for (char element : temp) {
            reverseStack.push(element);
        }
        reversedText = "";
        while (!reverseStack.empty()) {
            reversedText += reverseStack.pop();
        }
        if (token.equals(reversedText) & token.length()>2) {
            return true;
        } else {
            return false;
        }
    }
}
