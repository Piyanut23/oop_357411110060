package OOP_lab6;

public class myString {
    public static void main(String[] args) {
        char[]c ={'H','e','l','l','o'};
        String str1 = new String(c);
        System.out.println(str1);
        String str2 = "Piyanut Raksin";
        System.out.println(str2);

        //String cancatenation
        //type 1 (+)
        String str3 = str1 + "   "+str2;
        System.out.println(str3);
        //type 2 (concat () method)
        String str4 = str3.concat("RMUTSV");
        System.out.println(str4);

        //string Methods
        System.out.println(str4.length());
        System.out.println(str4.substring(10,20));
        System.out.println(str4.toUpperCase());
        System.out.println(str4.toUpperCase());
        System.out.println(str4.toLowerCase());
        System.out.println( str4.replace('R','A'));


    }
        //main
}//class
