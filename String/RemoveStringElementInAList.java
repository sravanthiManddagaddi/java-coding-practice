package Coding.String;

import java.util.ArrayList;

public class RemoveStringElementInAList {
    public static void main(String[] args) {
        ArrayList<String> orgList = new ArrayList<String>();
        String target = "apple";
        orgList.add("apple");
        orgList.add("banana");
        orgList.add("apple");
        orgList.add("orange");

        for(int i=0;i<orgList.size();i++){
            if(orgList.get(i).equals(target)){
                orgList.remove(i);
            }
        }
        System.out.println(orgList.size());
        System.out.println(orgList);
    }
}
