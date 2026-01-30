import java.util.*;
class Hello
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      int m[] = new int[10];
      int i,p=0,k=0,lb=0,ub=9;
      System.out.println("Enter 10 numbers:");
      for(i=0;i<10;i++)
      {
        m[i]=sc.nextInt();
      }
      System.out.println("The number to be searched:");
      int ns=sc.nextInt();
      while(lb<=ub)
      {
        p = (lb+ub)/2;
        if(m[p]<=ns)
        {
          lb=p+1;
        }
        if(m[p]>=ns)
        {
          ub=p-1;
        }
        if(m[p]==ns)
        {
          k=1;
          break;
        }
      }
      if(k==1)
      {
        System.out.println("Number found at position:"+(p+1));
      }
      else
      {
        System.out.println("Number not found");
      }
      sc.close();
    }
    
  }  
