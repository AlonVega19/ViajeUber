//@author Alondra Yoclein Osornio Vega 14/02/2022
package Uber; 
public class User extends Account{
    //public User(){}
    public User(Integer idAc, String name, String document, String email, String password){
        super(idAc, name, document, email, password); 
    }
   @Override
    public String toString(){
        return "\n*********USER**************\n " + super.toString();
    } 
} 