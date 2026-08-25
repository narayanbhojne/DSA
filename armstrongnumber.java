class armstrongnumber
{
    public static void main(String[] args) {
        
        int a=153;
        int original=a;
        int sum=0;

        while(a!=0)
        {
            int digit=a%10;
            sum=sum+(digit*digit*digit);
            a=a/10;
        }
        
        if(original==sum)
        {
            System.out.println("armstrong");
        }
        else
        {
            System.err.println("not armstrong");
        }
    }
}