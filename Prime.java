public class Prime{
    public static void main(String[] args){
       int n=100;
        int i;
        int j;
        int c;
        for(i=2;i<n;i++){
            c=0;
            for(j=1;j<=i;j++){
                if(i%j==0){
                    c++;
                }
                
            }
            if(c==2){
                System.out.println(i);
            }
        }
    }
}