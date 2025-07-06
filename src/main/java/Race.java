import java.util.ArrayList;
import java.util.List;
public class Race {
    private String leader = "";;
    private int maxDistance = 0;
    public void defineLeader(Car car){
        int newCarDistance = 24 * car.raceCar;

        if (newCarDistance > maxDistance) {
            leader = car.carName;
            maxDistance = newCarDistance;
        }
    }

    // Метод для получения имени победителя
    public String getWinnerName() {
        return leader;
    }
}
