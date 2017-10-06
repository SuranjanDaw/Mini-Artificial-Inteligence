import java.io.*;
class Prime
{
    public static boolean Prime1(int x)throws IOException
    {
        int b=0;
        for(int i=1;i<=x;i++)
        {
            if(x%i==0)
            b++;
        }
        if(b==2)
        return true;
        else
        return false;
    }
}
        