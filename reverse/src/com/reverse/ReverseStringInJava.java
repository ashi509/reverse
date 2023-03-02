package com.reverse;

public class ReverseStringInJava {
    public static void main(String[] args) {
        StringBuffer d=new StringBuffer("Reverse String :");
        System.out.println("By using StringBuffer Class=======>>>>>>>>>>"+d.reverse());

        StringBuilder s=new StringBuilder("The reverse String");
        System.out.println("This is StringBuilder class-------->>>>>>>>"+s.reverse());


        String  str="Hellow this is java program";
    String str1="";
        System.out.println("This is normal string------>>>>>"+str);
    int r;
    r=str.length();
    for(int i=r-1; i>=0; i--){
        str1=str1+str.charAt(i);
    }
        System.out.println("This is reverse string------>>>>>"+str1);



    }


}
