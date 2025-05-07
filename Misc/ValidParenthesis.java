package Coding.Misc;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Stack;

public class ValidParenthesis {
    public static void main(String[] args) {
        System.out.println(isParenthesisValid("()")); //valid true
        String str ="([)]"; //not valid false
        System.out.println(isParenthesisValid(str));
        System.out.println(isParenthesisValid("{([])}")); //valid true
        HashMap<String,String> map1 = new HashMap<>();
        map1.put("a","test1");
        map1.put("b","test2");
        map1.put("c","test3");
        map1.put("d","test4");
        HashMap<String,String> map2 = new HashMap<>();
        map2.put("a","test1");
        map2.put("b","test2");
        map2.put("c","test3");
        map2.put("e","test4");
        HashSet<String> uncommonSet = new HashSet<>(map1.keySet());
        uncommonSet.addAll(map2.keySet());
        System.out.println("Combined set "+ uncommonSet);
        HashSet<String> commonSet = new HashSet<>(map1.keySet());
        commonSet.retainAll(map2.keySet());
        System.out.println("Common Keys "+ commonSet);
        uncommonSet.removeAll(commonSet);
        System.out.println("Difference in keyset: "+uncommonSet);


    }
    public static boolean isParenthesisValid(String str) {
        Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i < str.length(); i++) {
            char a = str.charAt(i);
            if(stack.empty()){
                stack.push(a);
            }else if(stack.peek()=='(' && a==')'){
                stack.pop();
            }else if(stack.peek()=='[' && a==']'){
                stack.pop();
            }else if(stack.peek()=='{' && a=='}'){
                stack.pop();
            }else stack.push(a);
        }
        return stack.isEmpty();
    }
    public static boolean isValid(String s) {
        Map<Character, Integer> brackets = new HashMap<Character,Integer>();
        brackets.put('(',0);
        brackets.put(')',0);
        brackets.put('[',0);
        brackets.put(']',0);
        brackets.put('{',0);
        brackets.put('}',0);
        for(int i=0; i<s.length();i++){
            char a = s.charAt(i);
            switch (a){
                case'(':
                    brackets.put('(',brackets.get('(')+1);
                    break;
                case ')':
                    brackets.put(')',brackets.get(')')+1);
                    break;
                case '[':
                    brackets.put('[',brackets.get('[')+1);
                    break;
                case ']':
                    brackets.put(']',brackets.get(']')+1);
                    break;
                case '{':
                    brackets.put('{',brackets.get('{')+1);
                    break;
                case '}':
                    brackets.put('}',brackets.get('}')+1);
                    break;
            }
        }
        if ((brackets.get('(')==brackets.get(')')) && (brackets.get('[')==brackets.get(']')) && (brackets.get('{')==brackets.get('}'))){
            return true;
        }else return false;

    }
}