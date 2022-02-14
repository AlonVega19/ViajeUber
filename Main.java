//@author Alondra Yoclein Osornio Vega 14/02/2022
package Uber;
public class Main { 
    public static void main(String[] args) {
        Driver driver= new Driver(12455, "Alonso Juarez",  "INE", "alonso78@gmail.com", "dafaca");
        User    user = new User(458740, "Alicia Alcantar", "INE", "alice1232@gmail.com", "48xdadx");
        Route   route= new Route(2312, "Plaza Fundadores", "Tec 100");
        Card     card= new Card("44595", "2354323443", 234, "05-2022");
        UberX      ux= new UberX("POH098", driver, 5266,"Nissan ", "Sentra", 2);
        UberPool   up= new UberPool("MGED78", driver, 4545,"Nissan", "Versa", 1);
        UberVan    uv= new UberVan("POH098", driver, 5266,"Nissan", "Sentra", 3);
        UberBlack  ub= new UberBlack("ASD56", driver, 5266,"Nissan", "Sentra", 1);
        int cartype;
        cartype=3;
        switch (cartype){
            case 1 ->{
                Trip tripuberX= new Trip(16625, user, ux, route, 50.12, card,142.5, true);
                System.out.println(tripuberX);
            }
            case 2 ->{
                Trip tripuberV= new Trip(16625, user, uv, route, 50.12, card,142.5, true);
                System.out.println(tripuberV);
            }
            case 3 ->{
                Trip tripuberP= new Trip(16625, user, up, route, 50.12, card,142.5, true);
                System.out.println(tripuberP);
            }
            case 4 ->{
                Trip tripuberB= new Trip(16625, user, ub, route, 50.12, card,142.5, true);
                System.out.println(tripuberB);
            }
        } 
    }
} 