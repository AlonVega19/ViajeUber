//@author Alondra Yoclein Osornio Vega 14/02/2022
package Uber;
public class Paypal extends Payment{
    String email;
    public Paypal(){}
    public Paypal (String idPayment, String email){
        super(idPayment);
        this.email=email;
    } 
    public String getEmail() {
        return email;
    } 
    public void setEmail(String email) {
        this.email = email;
    } 
    public String toString(){
        return "PAYMENT: "+ this.getClass().getSimpleName();
    } 
}
