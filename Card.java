//@author Alondra Yoclein Osornio Vega 14/02/2022
package Uber;
public class Card extends Payment{
    Integer cvv;
    String date,number;
    public Card(){}
    public Card(String idPayment, String number, Integer cvv, String date){
        super(idPayment);
        this.number=number;
        this.cvv=cvv;
        this.date=date;
    }
    public void setNumber(String number) {
        this.number = number;
    }
    public void setCvv(Integer cvv) {
        this.cvv = cvv;
    }
    public void setDate(String date) {
        this.date = date;
    }
    public String getNumber() {
        return number;
    }
    public Integer getCvv() {
        return cvv;
    }
    public String getDate() {
        return date;
    }
    public String toString(){
        String card="";
        card=card+"\nCard\n"+this.getClass().getSimpleName();
        card=card+ " Number: "+ this.getNumber()+"\nDate: "+this.getDate()+"\n"+super.toString();
        return card;
    }
}
