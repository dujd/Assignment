import java.util.Scanner;

public class Assignment {
	
	
	public static void main(String[] args) {
		
		
		System.out.print("Enter odd number between 2 and 10000: \n");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if ((n%2==0 || 2 > n || n > 10000)) 
			System.out.println("Number not odd or between 2 and 10000\n");
		
		else {
			for (int i = 0; i<=n;++i) {
				if (i<1) firstRow(n);
				else if (i==n) lastRow(n);
				else if (i<((n+1)/2)) upRow(n,i);
				else {downRow(n,i);}
				System.out.println();
			}		
		}	
		sc.close();		
	}
	
	 private static void stars(int count) {
	        for (int i = 0; i < count; ++i)
	            System.out.print("*");
	    }
	 
	    private static void dashes(int count) {
	        for (int i = 0; i < count; ++i)
	            System.out.print("-");
	    }
	    
	    private static void firstRow(int count) {
	    	dashes(count);
	    	stars(count);
	    	dashes(count);
	    	stars(count);
	    	dashes(count);
	    	dashes(count);
	    	stars(count);
	    	dashes(count);
	    	stars(count);
	    	dashes(count);
	    	
	    }
	    
	    private static void lastRow(int count) {
	    	stars(count);
	    	dashes(count);
	    	stars(count);
	    	dashes(count);
	    	stars(count);
	    	stars(count);
	    	dashes(count);
	    	stars(count);
	    	dashes(count);
	    	stars(count);
	    }
	    
	    private static void downRow(int count,int b) {
	    	dashes(count-b);
	    	stars(count);
	    	dashes((b*2)-count);
	    	stars((count*3)-b*2);
	    	dashes((b*2)-count);
	    	stars(count);
	    	dashes(count-b);
	    	dashes(count-b);
	    	stars(count);
	    	dashes((b*2)-count);
	    	stars((count*3)-b*2);
	    	dashes((b*2)-count);
	    	stars(count);
	    	dashes(count-b);
	    }
	    
	    private static void upRow(int count, int b) {
	    	dashes(count-b);
	    	stars(count+(2*b));
	    	dashes(count-(2*b));
	    	stars(count+(2*b));
	    	dashes(count-b);
	    	dashes(count-b);
	    	stars(count+(2*b));
	    	dashes(count-(2*b));
	    	stars(count+(2*b));
	    	dashes(count-b);
	    }


}
