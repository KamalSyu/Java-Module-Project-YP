import java.util.InputMismatchException;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Race race = new Race();
        int min = 0;
        int max = 250;

        for (int i = 0; i < 3; i++) {
            System.out.println("Введите название " + (i + 1) + " автомобиля");
            String carName = scanner.next();
            while (carName.isEmpty()) {
                System.out.println("Пожалуйста, введите название автомобиля.");
                carName = scanner.next();
            }

            int speed;
            while (true) { // Бесконечный цикл для повторного запроса ввода
                System.out.println("Введите скорость " + (i + 1) + " автомобиля (не больше 250 и не меньше 1)");
                try {
                    speed = scanner.nextInt();
                    if (speed > min && speed <= max) {
                        break;
                    } else {
                        System.out.println("Ошибка, неправильно ввели скорость");
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Вы ввели некорректное значение. Пожалуйста, введите целое число.");
                    scanner.next();
                }
            }

            // Создаем экземпляр Car с уже введенными значениями
            Car car = new Car(carName, speed);

            // Определяем текущего лидера
            race.defineLeader(car);
        }
        scanner.close();

        // Выводим название машины-победителя
        String winners = race.getWinnerName();
        if (winners != null) {
            System.out.println("Наш победитель - самая быстрая машина: " + winners);
        } else {
            System.out.println("Нет данных о победителях.");
        }
    }
}