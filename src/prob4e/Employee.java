package prob4e;

import java.util.ArrayList;
import java.util.List;

public class Employee {

	private String name;
	private List<Account> accounts = new ArrayList<>();

	public String getName() {
		return name;
	}

	public Employee(String name) {
		this.name = name;
	}

	public double computeUpdatedBalanceSum() {
		//implement
		double sum = 0;
		for (Account account : accounts) {
			sum+=account.computeUpdatedBalance();
		}
		return sum;
	}

	public void addAccount(Account account) {
		if(account != null) {
			accounts.add(account);
		}
	}


}
