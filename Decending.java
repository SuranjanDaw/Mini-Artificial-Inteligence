class Decending
{
    public static void Decending1(int x[])
    {
        int a=0;
        for(int j=0;j<x.length;j++)
            for(int i=0;i<x.length-1;i++)
        {
            if(x[i]<x[i+1])   
            {
                a=x[i];
                x[i]=x[i+1];
                x[i+1]=a;
            }
        }
    }
}