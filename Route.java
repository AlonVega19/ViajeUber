//@author Alondra Yoclein Osornio Vega 14/02/2022
package Uber; 
import java.util.ArrayList;
class Route {
    Integer id;
    String start, end;
    public Route(){}
    public Route(int id, String start, String end){
        this.id=id;
        this.start=start;
        this.end=end;   
    } 
    public Integer getId() {
        return id;
    } 
    public String getStart() {
        return start;
    } 
    public String getEnd() {
        return end;
    } 
    public void setId(Integer id) {
        this.id = id;
    } 
    public void setStart(String start) {
        this.start = start;
    } 
    public void setEnd(String end) {
        this.end = end;
    }
    public String toString(){
        String route="";
        route= route + "\nStart: "+ this.getStart()+"\nEnd: "+this.getEnd();
        return route;
    }
}