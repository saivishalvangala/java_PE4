import java.sql.SQLOutput;
import java.util.*;
public class Q2_ReplaceChars {
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the string");
        String s=scan.nextLine();
        String s1="";
        while(true)
        {
            System.out.println("want to replace character?yes Or no");
            String flag=scan.nextLine();
            if(flag.equalsIgnoreCase("no"))
            {
                break;
            }
            System.out.println("enter the character or String to be replaced");
            String old=scan.nextLine();
            System.out.println("enter the new character or String");
            String newone=scan.nextLine();
            s1=s.replaceAll(old,newone);

        }
        System.out.println(s1);
    }
}
