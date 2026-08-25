class Container
{
    public static void main(String args[])
    {
        int height[]={1,8,6,2,5,4,8,3,7};
        int maxWater=0;
        for(int i=0; i<height.length; i++)
        {
            for(int j=i+1; j<height.length; j++)
            {
                int width=j-i;
                int h=Math.min(height[i], height[j]);
                int area=h*width;

                maxWater=Math.max(area, maxWater);
            }
        }
        System.out.println("max water:"+maxWater);
    }
}