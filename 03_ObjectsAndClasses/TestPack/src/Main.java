import com.skillbox.airport.Aircraft;
import com.skillbox.airport.Airport;

public class Main
{
    public static void main(String[] args)
    {
        Airport airport = Airport.getInstance();
        System.out.println("Модели самолетов находящиеся в парке " + airport.getAllAircrafts());
        System.out.println("Всего самолетов " + airport.getAllAircrafts().size());
    }
}
