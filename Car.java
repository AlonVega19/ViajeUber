//@author Alondra Yoclein Osornio Vega 09/02/2022
package Uber;
public class Car extends Account{
    String license;
    Account driver;
    public Car(String license, Account driver){
        this.license = license;
        this.driver = driver;
    }
	public void setLicense(String license) {
		this.license = license;
	}
	public String getLicense() {
		return license;
	}
	public void setDriver(Account driver) {
		this.driver = driver;
	}
	public Account getDriver() {
		return driver;
	}
        @Override
        public String toString(){
            String car="";
            car=car +"\nLicence: "+ this.getLicense();
            car=car + "\n********DRIVER************ \n"+ driver.toString()+"\n";
            return car;
        }
}