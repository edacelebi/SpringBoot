package springIntro;

public class CustomerManager implements ICustomerSevice{
	private ICustomerDal customerDal;
	
	//constructorInjection
	//public CustomerManager(ICustomerDal customerDal) {
		//this.customerDal = customerDal;
	//}

	//setter injection
	public void setCustomerDal(ICustomerDal customerDal) {
		this.customerDal = customerDal;
	}

	public void add() {
		//iş kuralları
		customerDal.add();
	}

}
