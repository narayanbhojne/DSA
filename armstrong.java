class armstrong
{
    public static void main(String[] args) {
        
        int number=2;
        int original=number;
        int sum=0;

        while(number!=0)
        {
            int digit=number%10;
            sum=sum+(digit*digit*digit);
            number=number/10;
        }
        if(original==sum)
        {
            System.out.println("Armstrong");
        }
        else
        {
            System.out.println("Not armstrong");
        }
    }
}