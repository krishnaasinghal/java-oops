import java.util.Scanner;
class input_reverse{
    public static void main(String[] args){
        Scanner S=new Scanner(System.in);
        System.out.println("eneter a no");
        int n=S.nextInt();
        int sum=0;
        while(n>0){
            int digit=n%10;
            sum=sum*10+digit;
            n=n/10;
        }
        System.out.println(sum);
    }
}