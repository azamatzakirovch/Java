package org.example;

public class First {

    public static boolean in(String word, String character){
        int length = word.length();

        for(int i = 0; i < length; i++){
            if(word.charAt(i) == character.charAt(0)){
                return true;
            }
        }
        return false;
    }


    public static String removeDuplicates(String s) {
        int length = s.length();
        String newString = "";

        for(int i = 0; i < length; i++){
            if(in(newString, String.valueOf(s.charAt(i)))){
                continue;
            }else{
                newString += s.charAt(i);
            }
        }
        return newString;
    }

    public static void main(String[] args){
        System.out.println(removeDuplicates("==============================TASK1=============================="));
        System.out.println(removeDuplicates("aabbcc"));
    }
}
