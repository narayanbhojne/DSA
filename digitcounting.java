class digitcounting
{
    public static void main(String[] args) {

     int num=1234566555;
     int count=0;
     if(num<0){
        num=-num;
     }
     else{
        if(num==0)
        {
            count=1;
        }
     } 

     while (num>0) { 

        num=num/10;
        count++;
         
     }  
     System.out.println("count="+count);
    }
}