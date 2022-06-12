/*  
            Write a program that show working of different functions of String and StringBufferclasss like 
            setCharAt(, setLength(), append(), insert(), concat()and equals().
    
*/

public class StringFunction {
    public static void main(String[] args) {
        StringBuffer strbuff = new StringBuffer("nikhil");
        StringBuilder strbuild = new StringBuilder("this is a string");
        // printing the original string
        System.out.println("The original String is : " + strbuild);
        // using .setCharAt
        strbuild.setCharAt(0, 'S');
        // printing the changed string
        System.out.println("After using setCharAt(0,'S') the string is : " + strbuild);
        ;
        // using .append
        strbuild.append(true);
        System.out.println("After using append() the string is : " + strbuild);
        // printing string length
        System.out.println(
                "The original length of the string is : " + strbuff.length() + ". And the string is : " + strbuff);
        // using .setLength
        strbuff.setLength(6);
        System.out.println("After using setLength(6) length the new length of the string is : " + strbuff.length()
                + ". And the string is : " + strbuff);
        // using .insert
        strbuff.insert(6, 'h');
        System.out.println("After using insert(6,'h') " + strbuff);
        String str1 = "nikhil", test = "nikhil";
        String str2 = " bansal";
        System.out.println(str1.equals(test)); 
        System.out.println(str1.equals(str2)); 
        System.out.println(str1.concat(str2)); 

    }
}