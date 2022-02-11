public class first {
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);
        int no=1000;
        int size = s.nextInt();
        int [] arr = new int[size];
        for(int i =0;i<=size-1;i++){
            arr[i]=s.nextInt();
        }
        for(int i =0;i<=size-1;i++){
            for(int k =i+1;k<=size-1;k++){
            if(arr[i]==arr[k]){
               if(k-i<no)
                    no = k-i;
            }
        }
        }
        System.out.println(no);
    }
}
