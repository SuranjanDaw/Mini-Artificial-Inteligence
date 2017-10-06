import java.io.*;
public class Magic_number
{
    int a[];
    int sum,n;
    Magic_number()
    {
        sum=0;
    }
    void pain()throws IOException 
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.print("enter the range");
        n=Integer.parseInt(br.readLine());
        a=new int[n];
        for(int i=0;i<n;i++)
        {
            int b=Integer.parseInt(br.readLine());
            if(b>0)
            a[i]=b;
            else
            {
                System.out.print("must enter a natural no.");i--;
            }
        }
        /*for(int j=0;j<n;j++)
        System.out.print(a[j]);*/
    }
    void magic(int z)
    {
        sum=0;
        while (z>0)
        {
            int h=z%10;
            sum=sum+h;
            z/=10;
        }
        if(sum<10)
        {
            if(sum==1)
            System.out.print("MAGIC NUMBER");
            else
            System.out.print("NOT A MAGIC NUMBER");
        }
        else if(sum>9)
        magic(sum);
    }
    void brain()throws IOException
    {
        for(int i=0;i<n;i++)
        magic(a[i]);
    }
    public static void main()throws IOException
    {
        Magic_number obj=new Magic_number();
        obj.pain();
        obj.brain();
    }
}
   