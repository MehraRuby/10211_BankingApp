package mypack;

class Customer 
{
	int custid;
	int accno;
	long initial_amt;
	long total_amt;
	String name;
	String contact;
	String email;
	
	public Customer() {}
	public Customer(int custid, int accno, long initial_amt, long total_amt, String name, String contact,
			String email) {
		super();
		this.custid = custid;
		this.accno = accno;
		this.initial_amt = initial_amt;
		this.total_amt = total_amt;
		this.name = name;
		this.contact = contact;
		this.email = email;
	}
	
}
