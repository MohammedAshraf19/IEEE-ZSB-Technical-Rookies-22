import java.util.*;
public class ten {
    public static void main(String[] args)  {
        Scanner s = new Scanner(System.in);
     int key =s.nextInt();
     int keyN =s.nextInt();
     int mosN =s.nextInt();
     int board [] =new int [keyN];
     int mouse [] =new int [mosN];
     int count = 0;
     for(int i =0 ;i<board.length;i++){
         board[i]=s.nextInt();
     }
     for(int i =0 ;i<mouse.length;i++){
         mouse[i]=s.nextInt();
     }

     for(int i =0 ;i<board.length;i++){
         for(int v =0 ;v<mouse.length;v++){
             if(board[i]+mouse[v]<=key&&board[i]+mouse[v]>count){
             count = board[i]+mouse[v];
             }
         }
     }
     if(count == 0)
     System.out.println(-1);
     else
     System.out.println(count);
 }
    
}
