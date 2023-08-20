import java.util.ArrayList;
import java.util.Comparator;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        ArrayList<City>cities=new ArrayList<>();
        cities.add(new City(2,"Osh"));
        cities.add(new City(3,"Bishkek"));
        cities.add(new City(4,"Jalal-Abad"));
        cities.add(new City(5,"Nookat"));
        cities.add(new City(6,"Batken"));
        cities.add(new City(7,"Kara-Kol"));
        TreeSet<City> cities1 = new TreeSet<>(City.comparator);
        for (City city : cities) {
            if (city.getCode()%2!=0){
                cities1.add(city);
            }
        }
        for (City city : cities1) {
            System.out.println(city);
        }
    }
}