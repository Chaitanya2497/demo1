package Day6;

public class Primerange {

	public static void main(String[] args) {
		 	 
     	int flag=0;
		int n;

		for(n=2;n<=20;n++)
		{
		flag=0;
		for( int i=2;i<n/2;i++)
		{
		if(n%i==0)
		{
		flag=1;
		break;

		}
		}

		if(flag==0) System.out.println( n);
		}
	}}

















