package bank;

import org.springframework.stereotype.Component;

@Component

public class LoanAccount implements Account {

	@Override
	public void getDetails() {
	
		System.out.println("Loan account....");
	}

}
