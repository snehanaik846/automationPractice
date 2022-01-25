package package1;

public class finalkey {

	    final int assign = 30 ;
	    static final int $_ = 0;

	    public static void main(String[] args)
	    {
	        //final int result = 20;
	        final int assign;
	        
	        finalkey f = new finalkey();
	        assign = 20;

	        System.out.println($_);
	        System.out.println(f.assign);
	        System.out.println(f.process($_));
	        
	       
	    }

	    int process(int a)
	    {
	        return a + 5;
	    }

}
