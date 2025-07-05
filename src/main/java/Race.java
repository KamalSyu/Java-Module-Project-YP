import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Race {
    List<String> leader = new ArrayList<>();
    int distance = 0;
    public void defineLeader(Car car){
        int newCarDistance = 24 * car.raceCar;

        if(newCarDistance > this.distance){
            leader.clear();
            leader.add(car.carName);
            this.distance = newCarDistance;
        }else if (newCarDistance == this.distance) {
            leader.add(car.carName);
        }
    }
    // Метод для получения имени победителя
    public List<String> getWinnerName() {
        return leader;
    }

}
