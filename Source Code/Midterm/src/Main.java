public class Main {

    public static void main(String[] args) {
	    boolean x = true;
	    int i = -9;
	    int j = 7;
	    double d =4.8;
	    String s = "is the";

	    if (!x) {
	        System.out.print("MAy");
        }
	    else {
	    	if ((j%2)==0){
	    		System.out.print("July");
			}
	    	else {
	    		System.out.print("OCtober");
			}
		}
	    System.out.print(s);

	    if ((i>0 && j<0) || x) {
	    	System.out.print("nicest");
		}
	    else if (j>0 && i<0) {
	    	System.out.print("best");
		}
		else {
			System.out.print("most aweseome");
		}

		if (j>=5) {
			System.out.print(":");
		}
		else {
			System.out.print("<");
		}
    }
}
