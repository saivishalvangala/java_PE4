import java.util.*;
public class Q1_FreqOfChar {
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the String");
        String s=scan.nextLine();
        s=s.toLowerCase();
        char [] arr=s.toCharArray();
//        for(int i=0;i<arr.length;i++)
//        {
//            System.out.println(arr[i]);
//        }

        ArrayList<Character> l=new ArrayList<Character>();

        for(char c:arr)
        {
            l.add(c);
        }


  //      System.out.println(l);

        int n=Collections.frequency(l,'a');

        System.out.println("the frequncy of letter a is: "+n);


    }
}
