//@author Alondra Yoclein Osornio Vega 14/02/2022
package Uber;
public class Account {
    Integer idAc;
    String name;
    String document;
    String email;
    String password;
    public Account(Integer idAc, String name,String document,String email,String password ){
        this.idAc = idAc;
        this.name = name;
        this.document=document;
        this.email=email;
        this.password=password;
    }
    public Account() {
    }
    public void setIdAc(Integer idAc) {
        this.idAc = idAc;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setDocument(String document) {
        this.document = document;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public Integer getIdAc() {
        return idAc;
    }
    public String getName() {
        return name;
    }
    public String getDocument() {
        return document;
    }
    public String getEmail() {
        return email;
    }
    public String getPassword() {
        return password;
    }
    public String toString(){
        String acc="";
        acc="Id Account: " + this.getIdAc() + "\nName: " + this.getName() + "\nDocument: " +this.getDocument() + "\nEmail: " + this.getEmail();
        return acc;
    }
}