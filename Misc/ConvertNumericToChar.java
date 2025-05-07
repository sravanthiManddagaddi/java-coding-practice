public class ConvertNumericToChar {
    public static void main(String[] args) {
        System.out.println(convert("a2b3c4"));
    }
    public static String convert(String str){
        StringBuilder sb = new StringBuilder();
        for(int i =0; i<str.length();i++){
            if(Character.isAlphabetic(str.charAt(i))){
                sb.append(str.charAt(i));
            }else{
                int a = Character.getNumericValue(str.charAt(i));
                for(int x=1;x<a;x++){
                    sb.append(str.charAt(i-1));
                }
            }
        }
        return sb.toString();
    }  
}
