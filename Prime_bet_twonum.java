import java.util.Scanner;
class Prime_bet_twonum
{
public static void main(String[] args)
{
Scanner s = new Scanner(System.in);
int n1 = s.nextInt();
int n2 = s.nextInt();
int i;
int flag =1;
 for( i =n1 ; i<= n2; i++)
{
 if(i==0 || i==1)
  continue;
else
{ flag = 1 ;
 for(int j = 2; j<i/2; j++)
{
if(i%j == 0)
{
flag = 0;
break;
}
}

if (flag ==1)
System.out.println(i + " ");
}
}
}
}