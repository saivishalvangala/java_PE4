import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Q5_PresOfName {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the string");
        String s=scan.nextLine();
        System.out.println("enter the nae to be searched");
        String name=scan.nextLine();
        Boolean b=isThere(s,name);
        System.out.println(b);
    }
    public static boolean isThere(String s,String name){
        s=s.toLowerCase();
        name=name.toLowerCase();
        Pattern pat=Pattern.compile(name);
        Matcher mat=pat.matcher(s);
        return mat.find();
    }
}
