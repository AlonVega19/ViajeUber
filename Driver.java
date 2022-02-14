//@author Alondra Yoclein Osornio Vega 14/02/2022
package Uber; 
public class Driver extends Account {
    //public Driver(){}
    public Driver(Integer idAc, String name,String document,String email,String password ){
        super(idAc,name,document, email,password );
    }
    public String toString(){
        return super.toString();
    } 
}
