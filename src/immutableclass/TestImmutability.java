package immutableclass;

public class TestImmutability {
	public static void main(String[] args) {
	
		Bank bk = new Bank();
		bk.setBankName("Bank of India");
		bk.setBranch("Mumbai");
		bk.setBranchCode(15467);
		
		Account acc = new Account(12478632,"Bobby",bk);
		System.out.println("Original Account: "+acc);
		acc.getDetails().setBranchCode(10265);
		acc.getDetails().setBranch("Pune");
		bk.setBranchCode(4785);
		System.out.println("After modifing fields in Bank-Account: "+acc);
	}
	
}
