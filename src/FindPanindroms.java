
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
    static int count = 0;
    //static problem
    private static String url;
    public static void main(String[] args) {
        FindPanindroms findPanindroms = new FindPanindroms();
        for (String token : findPanindroms.getTokensList(new ReadFile(url).getFile())) {
            if (findPanindroms.isPanindrom(token)) {
                System.out.println(token);
                count++;
            }
        }
        System.out.println("Total of " + count + " Palindromes");

    }

    StringTokenizer st;
    List<String> tokens;

    public List<String> getTokensList(String text) {
//        st = new StringTokenizer(text, " +");
        st = new StringTokenizer(text, "/n");
        tokens = new ArrayList<String>();
        while (st.hasMoreTokens()) {
            tokens.add(st.nextToken().trim());
            count++;
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
        if (token.equals(reversedText) & token.length() > 2) {
            return true;
        } else {
            return false;
        }
    }
}
