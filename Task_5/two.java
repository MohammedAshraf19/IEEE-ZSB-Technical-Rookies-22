import java.util.Scanner;

public class two {

    public static void main(String[] args) {
       Scanner s =new Scanner(System.in);
       int a;
       int t =s.nextInt();
       int n =s.nextInt();
       int sum =0;
       int z = 0;
       while(true){
           t--;
           a =s.nextInt();
           sum=(86400-a)+sum;
        z++;
        if(n<=sum)
        {
            break;
        }
       }
       System.out.println(z);
       
    }
    
}
