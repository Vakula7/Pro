package java2;

public class PrintOnce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s=sc.nextLine();
		String str[]=s.split("");
		String n[]=new String[s.length()];
		for(int i=0;i<str.length;i++)
		{
	      if(str[i]!="z")
	    	  {
	    		  n[i]=str[i];
	    		  for(int j=0;j<str.length;j++)
	    		  {
	    			  if(n[i].equals(str[j]))
	    			  {
	    				  str[j]="z";
	    			  }
	    		  }
	    	  }
	    	
	    		  
		}
		
		for(int z=0;z<n.length;z++)
		{   if(n[z]!=null)
			System.out.print(n[z]);
		}

	}

}
