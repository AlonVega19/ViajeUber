//@author Alondra Yoclein Osornio Vega 14/02/2022
package Uber;
public class Trip extends Account{
    Integer idTrip;
    User user;
    Car car;
    Route route;
    Double amount;
    Payment payment;
    Double progress;
    boolean completed;
    public Trip(Integer idTrip,User user,Car car,Route route,Double amount,Payment payment, Double progress,boolean completed){
        super();
        this.idTrip=idTrip;
        this.user=user;
        this.car=car;
        this.route=route;
        this.amount=amount;
        this.payment=payment;
        this.progress=progress;
        this.completed=completed;
    } 
    public Trip(Integer idAc, String name, String document, String email, String password) {
        super(idAc, name, document, email, password);
    } 
    public Integer getIdTrip() {
        return idTrip;
    } 
    public User getUserTrip() {
        return user;
    } 
    public Car getCar() {
        return car;
    } 
    public Route getRoute() {
        return route;
    } 
    public Double getAmount() {
        return amount;
    } 
    public Payment getPayment() {
        return payment;
    } 
    public Double getProgress() {
        return progress;
    } 
    public boolean isCompleted() {
        return completed;
    } 
    public void setIdTrip(Integer idTrip) {
        this.idTrip = idTrip;
    } 
    public void setUserTrip(User userTrip) {
        this.user = userTrip;
    } 
    public void setCar(Car car) {
        this.car = car;
    } 
    public void setRoute(Route route) {
        this.route = route;
    } 
    public void setAmount(Double amount) {
        this.amount = amount;
    } 
    public void setPayment(Payment payment) {
        this.payment = payment;
    } 
    public void setProgress(Double progress) {
        this.progress = progress;
    } 
    public void setCompleted(boolean completed) {
        this.completed = completed;
    }
    public String toString(){
        String car="";
        car="\n********TRIP************" + "\nId Trip:" + this.getIdTrip() + "\nAmount: "+ this.getAmount()+"\nProgress: "+ this.getProgress()+ "\n********CAR************ "+ this.getCar().toString()+ this.getUserTrip().toString()+"\n********ROUTE*************" + this.getRoute().toString()+"\n********PAYMENT***********"+this.getPayment();
        return car;
    }
}
