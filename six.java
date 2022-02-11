import java.util.*;
public class six {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int tr =s.nextInt();
       
        
       for(int k =1;k<=tr;k++){
        int have=s.nextInt();
        int cost =s.nextInt();
        int wrap =s.nextInt();
           
        int num = have/cost;
        int eat =num;
        int eat2=0;
       
           x1: for(int i=0;;i++){
            if(num>=wrap){
                eat2++;
                num =num-wrap;
                num++;
            }
            else{
                break x1;
            }
        }
            System.out.println(eat+eat2);
           
       }
      }
}
