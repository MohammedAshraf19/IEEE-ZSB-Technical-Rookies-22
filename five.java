import java.util.*;
public class Five {
    public static void main(String[] args)  {
        Scanner in = new Scanner(System.in);
 int m =in.nextInt();
 for(int i =1;i<=m;i++){
     int n = in.nextInt();
     int r = n;
     int count = 0;
     while(r > 0){
         if(r % 10 != 0 && n % (r % 10) == 0) count++;
         r = r / 10;
}
System.out.println(count);
 }
}
}
