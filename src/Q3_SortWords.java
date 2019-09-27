import java.util.*;
public class Q3_SortWords {
    public static void main(String []args)
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the string");
        String s=scan.nextLine();

        String []arr=s.split(" ");
        Arrays.sort(arr);
        for(String s1:arr){
            System.out.println(s1);
        }
    }
}
