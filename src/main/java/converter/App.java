package converter;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        
    	Scanner input = new Scanner(System.in);
    	
    	int chosen = getMenu(input);
    	
    	if(chosen == 1) {
    		System.out.print("Enter GEL amount: ");
    		String GELAMOUNTSTR = input.nextLine();
    		double GELAMOUNT = Double.parseDouble(GELAMOUNTSTR);
    		
    		double RESULT = GELtoUSD(GELAMOUNT);
    		
    		System.out.println("GEL: "+GELAMOUNT+"\nUSD: "+RESULT);
    	}else if(chosen==2) {
    		System.out.print("Enter USD amount: ");
    		String USDAMOUNTSTR = input.nextLine();
    		double USDAMOUNT = Double.parseDouble(USDAMOUNTSTR);
    		
    		double RESULT = USDtoGEL(USDAMOUNT);
    		
    		System.out.println("USD: "+USDAMOUNT+"\nGEL: "+RESULT);
    	}else {
    		System.out.println("GOODBYEEEE !!!");
    		System.exit(0);
    	}
    	
    }
    
    public static double USDtoGEL(double USD) {
    	double GEL = 2.59;
    	
    	double RESULT = USD * GEL;
    	return RESULT;
    }
    
    public static double GELtoUSD(double GEL) {
    	double USD = 0.39;
    	
    	double RESULT = USD * GEL;
    	return RESULT;
    }
    
    public static int getMenu(Scanner input){
    	String[] menuItems = {"GEL to USD","USD to GEL","EXIT"};
    	
    	System.out.println("=== GEL/USD CONVERTER ===");
    	for(int i=0;i<menuItems.length;i++) {
    		System.out.println((i+1)+") "+menuItems[i]);
    	}
    	
    	System.out.print("Choose: ");
    	String chosenSTR = input.nextLine();
    	int chosen = Integer.parseInt(chosenSTR);
    	
    	while(chosen < 0 || chosen >3) {
    		System.out.print("Choose: ");
        	chosenSTR = input.nextLine();
        	chosen = Integer.parseInt(chosenSTR);
        	
        	if(chosen >0 && chosen <= 3) {
        		break;
        	}else {
        		continue;
        	}
    	}
    	
    	return chosen;
    	
    }
}
