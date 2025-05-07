package Coding.Misc;

public class StringJoiner {
    public static void main(String[] args) {
        String[] arr = {"N","I","V","N","A","V"};
        System.out.println(joiner(";",arr));
        String s1 = "Hello";
        String s2 = "World";
        String s3 = s1+s2;
        s3.intern();
        String s4 = "HelloWorld";
        System.out.println(s3==s4);
        System.out.println(s3.equals(s4));
//        System.out.println(s2==s5);

    }
   public static String joiner(String sep, String[] arr){
        StringBuilder sb = new StringBuilder();
        int end =0;
        for(String s :arr){
            if(s!=null) {
                sb.append(s);
                end = sb.length();
                sb.append(sep);
            }
        }
        return sb.substring(0,end);
   }
}
