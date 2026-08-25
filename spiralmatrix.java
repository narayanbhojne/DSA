class spiralmatrix
{
    public static void main(String args[])
    {
        int arr[][]={   {1,2,3},
                          {4,5,6},
                          {7,8,9}
                    };
        int top=0;
        int buttom=arr.length-1;
        int left=0;
        int right=arr[0].length-1;

        while(top<=buttom && left<=right)
        {
            for(int i=left; i<=right; i++)
            {
                System.out.print(arr[top][i]+" ");
            }
            top++;
            for(int j=top; j<=buttom; j++)
            {
                System.out.print(arr[j][right]+" ");
            }
            right--;

            if(top<=buttom)
            {
                for(int k=right; k>=left; k--)
                {
                    System.out.print(arr[buttom][k]+" ");
                }
            }
            buttom--;

            if(left<=right)
            {
                for(int l=buttom; l>=top; l--)
                {
                    System.out.print(arr[l][left]+" ");
                }
            }
            left++;

        }
    }
} 

/* class spiralmatrix
{
    public static void main(String args[])
    {
        int arr[][]={{1,2,3}, {4,5,6}, {7,8,9}};

        int top=0;
        int bottom=arr.length-1;
        int left=0;
        int right=arr[0].length-1;

        for(int i=left; i<=right; i++)
        {
            System.out.print(arr[top][i]+" ");
        }
        top++;

        for(int i=top; i<=bottom; i++)
        {
            System.out.print(arr[i][right]+" ");
        }
        right--;

        if(top<=bottom)
        {
            for(int i=right; i>=left; i--)
            {
                System.out.print(arr[bottom][i]+" ");
            }

        }
        bottom--;
        
        if(left<=right)
        {
            for(int i=bottom; i>=top; i--)
            {
                System.out.print(arr[i][left]+" ");
            }
        }
        left++;
    }
} */