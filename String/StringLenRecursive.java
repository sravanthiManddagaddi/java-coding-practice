package Coding.String;

public class StringLenRecursive {
    public static void main(String[] args) {
        System.out.println(stringLenRec("Hello World"));
    }
    public static int stringLenRec(String s){
        if(s.isEmpty()){
            return 0;
        }else{
            return 1+ stringLenRec(s.substring(1));
        }
    }
    public static int stringLenTryCatch(String s){
        int count = 0;
        try{
            while(true){
                s.charAt(count);
                count++;
            }
        }catch(StringIndexOutOfBoundsException e){
            return count;
        }
    }
//        System.out.println(stringLenTryCatch("Hello World"));

}
