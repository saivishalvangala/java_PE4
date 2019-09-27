import java.util.*;
public class Q4_transposeString {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the String");
        String s=scan.nextLine();
        String res=transposeString(s);
        System.out.println(res);
    }
    public static String transposeString(String s){
        String[]arr=s.split(" ");
        for(int i=0;i<arr.length;i++)
        {
            StringBuilder sb=new StringBuilder(arr[i]);
            arr[i]=sb.reverse().toString();
        }
        String res=String.join(" ",arr);
        return res;
    }
}
