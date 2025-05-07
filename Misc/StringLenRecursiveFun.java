public class StringLenRecursiveFun {
    public static void main(String[] args) {
        System.out.println(findLen("Hello"));
    }
    public static int findLen(String str){
        if (str.isEmpty()){
            return 0;
        }else{
            return 1 + findLen(str.substring(1));
        }
    }
}
