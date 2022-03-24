package immutableclass;

public class Account {
	private final int accNo;
	private final String name;
	private final Bank details;
	
	
	public Account(int accNo, String name, Bank details) {
		super();
		this.accNo = accNo;
		this.name = name;
		
		Bank dummyBank = new Bank();
		dummyBank.setBankName(details.getBankName());
		dummyBank.setBranch(details.getBranch());
		dummyBank.setBranchCode(details.getBranchCode());
		
		this.details=dummyBank;
		
	}


	public int getAccNo() {
		return accNo;
	}


	public String getName() {
		return name;
	}


	public Bank getDetails() {
		
		Bank cloneDetails=new Bank();
		
		cloneDetails.setBankName(this.details.getBankName());
		cloneDetails.setBranch(this.details.getBranch());
		cloneDetails.setBranchCode(this.details.getBranchCode());
		
		return cloneDetails;
		
	}


	@Override
	public String toString() {
		return "Account [accNo=" + accNo + ", name=" + name + ", details=" + details + "]";
	}
	
	 
	

}
