import java.util.Scanner;
public class second {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        String st = s.next();
        int size = s.nextInt();
        String all = "";
        int count =1;
        for(int i =0;;i++){
            all = all + st;
            if(all.length()>=size)
                break;
        }
        for(int i =1;i<=size-1;i++){
            if(all.charAt(0)==all.charAt(i)){
                count++;
            }
        }
        System.out.println(count);
      }
    
}
