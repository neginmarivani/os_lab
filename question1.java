
import java.util.Scanner;

public class question1 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int T = in.nextInt();
		
		
		int k = in.nextInt();
		
		long[] result = new long[100001];
		
		result[0]=1;
		long[] sum = new long[100001];
		
		sum[0]=0;
		int [][] tests =new int [2][T];
		int max_num = 0 ;
		 
		for(int i=0 ; i< T ;i++){
			
			int a = in.nextInt();
			int b = in.nextInt();
			tests[0][i]= a;
			tests[1][i]=b;
			if(max_num < Math.max(a, b))
			 max_num= Math.max(a, b);
		}
		for(int j=1; j<= max_num  ;j++ ){
			
				if(k <= j){
					result [j]= (result [(j- k)] + result [j-1])%1000000007;
					sum[j]= (sum[j-1]+result[j]);
				}
				else if( k > j){
					result [j]=result [j-1]%1000000007;
					sum[j]= (sum[j-1]+result[j]);
				}
				
		}
		 for(int i = 0; i < T; i++){	
			int a= tests[0][i];
			int b=tests[1][i];
			System.out.println((sum[b]-sum[a-1])%(1000000007));
		}
			
	}

}

