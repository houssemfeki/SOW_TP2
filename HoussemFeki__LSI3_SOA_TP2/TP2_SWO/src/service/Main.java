package service;

public class Main {

	public static void main(String[] args) {
		
		        BanqueService banqueService = new BanqueService();
		        double mdollars = 80.0; 
		        double meuros= banqueService.conversion(mdollars);
		        System.out.println(mdollars + " dollars = " + meuros + " euros");
		        
		        
		  }
	}

