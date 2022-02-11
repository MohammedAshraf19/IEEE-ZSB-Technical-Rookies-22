import java.util.*;
public class four {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int fine =0;
        int d1 = s.nextInt();
        int m1 = s.nextInt();
        int y1 = s.nextInt();
        int d2 = s.nextInt();
        int m2 = s.nextInt();
        int y2 = s.nextInt();
        if(d2==d1&&y1==y2&&m1==m2){
           System.out.println(fine);
        }
        else if(d1>d2&&y1==y2&&m1==m2){
            fine = (d1-d2)*15;
            System.out.println(fine);
        }
         else if(d1==d2&&y1==y2&&m1>m2){
            fine = (m1-m2)*500;
            System.out.println(fine);
        }
         else if(d1>d2&&y1==y2&&m1>m2){
            fine =(m1-m2)*500;
            System.out.println(fine);
        } 
        else if(d1<d2&&y1==y2&&m1==m2){
            fine = 0;
            System.out.println(fine);
        }
        else if(d1==d2&&y1==y2&&m1<m2){
            fine =0;
            System.out.println(fine);
        }
        else if(d1<d2&&y1==y2&&m1<m2){
            fine =0;
            System.out.println(fine);
        }
        else if(d1<d2&&y1<y2&&m1<m2){
            fine =0;
            System.out.println(fine);
        }
        else if(d1==d2&&y1==y2&&m1==m2){
            fine =0;
            System.out.println(fine);
        }
        else if(y1<y2){
            fine =0;
            System.out.println(fine);
        }
        else{
            fine =10000;
            System.out.println(fine);
        }   
              
        
      }
}
