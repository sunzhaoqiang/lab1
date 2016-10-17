package first1;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class ys {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner in = new Scanner(System.in);
       System.out.println("请输入多项式：");
       String abs;
       int c=1;
       abs = in.nextLine();
       int b = abs.length();
       char[] A= new char[b];
       char[] C= new char[b];
       for(int i=0;i<b;i++)
       {
    	   A[i] = abs.charAt(i);
    	   C[i] = abs.charAt(i);
       }
       for(int i=0;i<b;i++)
       {
    	   if(i<b-1&&A[i]!='+'&&A[i]!='*')
    	   {
    		   if(A[i+1]!='+'&&A[i+1]!='*')
    		   {
    			   System.out.println("输入错误");
    			   c=0;
       			   break;
    		   }
    	   }
       }
       for(int i=0;i<b;i++)
       {
    	    String L=String.valueOf(A[i]);
    	    Pattern p = Pattern.compile("[a-zA-Z]");
    		Pattern p2 = Pattern.compile("[0-9]");
    		Pattern p3 = Pattern.compile("[*]");
    		Pattern p4 = Pattern.compile("[+]");
    		Matcher m1 = p.matcher(L);
    		Matcher m2 = p2.matcher(L);
    		Matcher m3 = p3.matcher(L);
    		Matcher m4 = p4.matcher(L);
    		if(c==1&&!m1.find()&&!m2.find()&&!m3.find()&&!m4.find())
    		{
    			System.out.println("输入错误");
    			break;
    		}
    		if(c==1&&i==b-1)
	        {
    			System.out.println(abs);
	        }
       }
       System.out.println("请输入未知数的值：");
       String zhi=in.nextLine();
       int plan=0;
       int g=0;
       int f = zhi.length();
       char[] B= new char[f];
       for(int i=0;i<f;i++)
       {
    	   B[i] = zhi.charAt(i);
       }
       String [] sss = zhi.split(" ");
       int u=0;
       if(sss[0].equals("!simplify")==false)
       {
    	   System.out.println("输入错误");
       }
       else
       {
    	   if(f==9)
           {
        	   System.out.println(abs);
           }
           else
           {
        	   for(int i=0;i<b;i++)
               {
            	   if(A[i]==B[10])
            	   {
            		   A[i]=B[12];
            	   }
            	   
               }
               while(f-12-u>1)
               {
            	   u=u+4;
            	   for(int i=0;i<b;i++)
                   {
                	   if(A[i]==B[10+u])
                	   {
                		   A[i]=B[12+u];
                	   }
                   }
               }
               for(int j=0;j<b;j++)
        		   System.out.print(A[j]);
               System.out.print("\n");
           }
       } 
       System.out.println("请输入要进行的求导：");
       String dp = in.nextLine();
       char[] Q= new char[5];
       int mm=0;
       String rt="";
       for(int i=0;i<5;i++)
       {
    	   Q[i] = dp.charAt(i);
       }
       for(int i=0;i<b;i++)
       {
    	   if(Q[0]!='!'||Q[1]!='d'||Q[2]!='/')
    	   {
    		   System.out.println("输入错误");
    		   break;
    	   }
    	   else if(i==b-1&&C[i]!=Q[4])
    	   {
    		   System.out.println("输入错误");
    	   }
    	   else
    	   {
    		   while(mm<b)
    	       {
    	    	   if(C[mm]==Q[4])
    	    	   {
    	    		   g=mm;
    	    		   while(g<b-1&&(C[g]==Q[4]||C[g]=='*'||C[g+1]=='*'))
    	    		   {
    	    			   if(C[g]==Q[4])
    	    			   {
    	        			   plan=plan+1;
    	    			   }
    	    			   g=g+1;
    	    		   }
    	    	   }
    	    	   if(plan==0)
    	    	   {
    	    		   rt=rt+C[mm];
    	    		   mm=mm+1;
    	    	   }
    	    	   else
    	    	   {
    	    		   String str=String.valueOf(plan);
    	    		   rt=rt+str;
    	    		   for(int j=mm+1;j<g+1;j++)
    	    		   {
    	    			   rt=rt+C[j];
    	    		   }
    	    		   mm=g+1;
    	    		   plan=0;
    	    	   }
    	       }
        	   System.out.println(rt);
        	   break;
    	   }
       }
       
       in.close();
	}

}
