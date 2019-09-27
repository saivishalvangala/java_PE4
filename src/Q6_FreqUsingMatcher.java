import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Q6_FreqUsingMatcher {
    public static void main(String[] args) {
        String str  ;
        Scanner sc =new Scanner(System.in);
        System.out.println("enyter the String");
        str=sc.nextLine();
        System.out.println("enter the matcher");
        String match=sc.nextLine();
        int count=isThere(str,match);
        System.out.println(count);
    }
    public static int isThere(String s,String name){
        s=s.toLowerCase();
        name=name.toLowerCase();
        Pattern pat=Pattern.compile(name);
        Matcher mat=pat.matcher(s);
        int count=0;
        while(mat.find()){
            count++;
        }
        return count;
    }
}
