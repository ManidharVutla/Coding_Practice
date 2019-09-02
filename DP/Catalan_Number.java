import java.util.*;
class Catalan_Number
{
     // A recursive function to find nth catalan number 
  
    int catalan(int n) { 
        int cat[]=new int[n+1];

        cat[0]=cat[1]=1;

        for(int i=2;i<=n;i++)
        {
            cat[i]=0;
            for(int j=0;j<i;j++)
                cat[i]+=cat[j] * cat[i-j-1];
        } 

        //System.out.println(Arrays.toString(cat));
        return cat[n];
    } 
  
    public static void main(String[] args) { 
        Catalan_Number cn = new Catalan_Number(); 
    
        System.out.println(cn.catalan(5)); 
        
    } 
} 
