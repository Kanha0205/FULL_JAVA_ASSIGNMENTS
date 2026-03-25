package bank;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BankOperation {
	public static void main(String[] args) {
		
		
		AnnotationConfigApplicationContext cx = new AnnotationConfigApplicationContext(AppConfig.class);
		
		
		Account sv = cx.getBean("savingAccount",Account.class);
				
		Account ln = cx.getBean("loanAccount",Account.class); 	
		
		
		sv.getDetails();
		ln.getDetails();
	}

}
