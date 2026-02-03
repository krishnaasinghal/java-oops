class ReverseNumber
{
    public static void main(String[] args){
        int num =123;
        int sum =0;
        while (num>0){
            int digit =num%10;
            sum=sum*10+digit;
            num=num/10;
        }
        System.out.println("The reversed number is: "+sum);
    }
}