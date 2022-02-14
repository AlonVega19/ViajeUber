//@author Alondra Yoclein Osornio Vega 14/02/2022
package Uber;
public class Payment {
    String idPayment;
    public Payment(){}
    public Payment(String idPayment){
        this.idPayment=idPayment; 
    }
    public String getIdPayment() {
        return idPayment;
    }
    public void setIdPayment(String idPayment) {
        this.idPayment = idPayment;
    }
    public String toString(){
        String car="";
        car= car+"id Payment:"+this.getIdPayment();
        return car; 
    }
}
