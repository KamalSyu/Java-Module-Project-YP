import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Race race = new Race();

        Car[] cars = new Car[3];
        for (int i = 0; i < 3; i++) {
            System.out.println("Введите название " + (i + 1) + " автомобиля");
            cars[i] = new Car();
            while (true) {
                cars[i].carName = scanner.next();
                if (!cars[i].carName.isEmpty()) {
                    break;
                } else {
                    System.out.println("Пожалуйста, введите название автомобиля.");
                }
            }

            while (true) { // Бесконечный цикл для повторного запроса ввода
                System.out.println("Введите скорость " + (i + 1) + " автомобиля (не больше 250 и не меньше 1)");
                try {
                    int speed = scanner.nextInt();
                    if (speed > 0 && speed <= 250) {
                        cars[i].raceCar = speed;
                        break;
                    } else {
                        System.out.println("Ошибка, введите скорость заново (не больше 250 и не меньше 1)");
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Вы ввели некорректное значение. Пожалуйста, введите целое число.");
                    scanner.next();
                }
                if (scanner.hasNextLine() && scanner.nextLine().isEmpty()) {
                    System.out.println("Пожалуйста, введите скорость автомобиля.");
                }
            }
        }
        scanner.close();

        for (Car car : cars) {
            race.defineLeader(car);
        }

        // Выводим название машины-победителя
        List<String> winners = race.getWinnerName();
        if (winners.size() == 1) {
            System.out.println("Наш победитель - самая быстрая машина: " + winners.get(0));
        } else {
            System.out.print("Победителей несколько - самые быстрые машины: ");
            for (int i = 0; i < winners.size(); i++) {
                System.out.print(winners.get(i));
                if (i < winners.size() - 1) {
                    System.out.print(", ");
                }
            }
        }
    }
}