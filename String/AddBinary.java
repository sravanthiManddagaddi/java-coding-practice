package Coding.String;

public class AddBinary {
    public static void main(String[] args) {
        String a ="1";
        String b = "11";
        System.out.println(addBinary(a,b));
    }
    public static String addBinary(String a, String b) {
        int aLen = a.length();
        int bLen = b.length();
    if(aLen<bLen){
        int setLen = bLen-aLen;
        String s ="";
        for(int i =0;i<setLen;i++){
            s = s +"0";
        }
        a = s + a;
    }else{
        int setLen = aLen-bLen;
        String s ="";
        for(int i =0;i<setLen;i++){
            s = s +"0";
        }
        b = s + b;
    }
    int carry = 0;
    String newValue = "";
    for(int j = a.length()-1;j>=0;j--){
        if(a.charAt(j) == '1' && b.charAt(j) == '1') {
            if (carry == 0) {
                newValue = "0" + newValue;
                carry = 1;
            } else {
                newValue = "1" + newValue;
                carry = 1;
            }
        }else if (a.charAt(j) == '0' && b.charAt(j) == '0'){
            if(carry == 1){
                newValue = "1"+newValue;
            }else newValue = "0" + newValue;
            carry = 0;
        }else {
            if (carry == 0) {
                newValue = "1" + newValue;
                carry = 0;
            } else {
                newValue = "0" + newValue;
                carry = 1;
            }
        }

        }
if(carry == 1){
    newValue = "1" + newValue;
    return newValue;
}
return newValue;
    }
    }
