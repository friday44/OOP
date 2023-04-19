package Excep3;

import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;

public class Excep3 {


    // Напишите приложение, которое будет запрашивать у пользователя следующие данные в произвольном порядке, разделенные пробелом:
    // Фамилия Имя Отчество датарождения номертелефона пол

    // Форматы данных:
    // фамилия, имя, отчество - строки
    // дата_рождения - строка формата dd.mm.yyyy
    // номер_телефона - целое беззнаковое число без форматирования
    // пол - символ латиницей f или m.

    // Приложение должно проверить введенные данные по количеству. Если количество не совпадает с требуемым, вернуть код ошибки, обработать его и показать пользователю сообщение, что он ввел меньше и больше данных, чем требуется.
    // Приложение должно попытаться распарсить полученные значения и выделить из них требуемые параметры. Если форматы данных не совпадают, нужно бросить исключение, соответствующее типу проблемы. Можно использовать встроенные типы java и создать свои. Исключение должно быть корректно обработано, пользователю выведено сообщение с информацией, что именно неверно.
    // Если всё введено и обработано верно, должен создаться файл с названием, равным фамилии, в него в одну строку должны записаться полученные данные, вида
    // <Фамилия><Имя><Отчество><датарождения> <номертелефона><пол>

    // Однофамильцы должны записаться в один и тот же файл, в отдельные строки.
    // Не забудьте закрыть соединение с файлом.
    // При возникновении проблемы с чтением-записью в файл, исключение должно быть корректно обработано, пользователь должен увидеть стектрейс ошибки.

    public class Excep {
        public static void main(String[] args) {

            String data = (
                    getSrtingData("фамилию:") +
                            getSrtingData("имя:") +
                            getSrtingData("отчество") +
                            getTimeData("дату рождения в формате dd.mm.yyyy") +
                            getPhoneNumber("телефон (10 цифр)") +
                            getGender("пол (m или f)"));

            String fileNane = getSrtingData("фамилию:");

            saveFile(data, fileNane);
        }

        public static String getSrtingData(String massage) {
            String text = new String();
            while (text.isEmpty()) {
                try {
                    Scanner sc = new Scanner(System.in);
                    System.out.println("Введите " + massage);
                    text = sc.nextLine();
                } catch (NullPointerException ex) {
                    System.out.println(ex + "Повторите ввод");
                }
            }
            if (!text.matches("^\\D*$")) {
                throw new RuntimeException("Поле содержит цифры");
            }
            return text;
        }

        public static String getTimeData(String massage) {
            String dateBirhsday = new String();
            while (dateBirhsday.isEmpty()) {
                try {
                    Scanner sc = new Scanner(System.in);
                    System.out.println("Введите " + massage);
                    dateBirhsday = sc.nextLine();
                } catch (NullPointerException ex) {
                    System.out.println(ex + "Повторите ввод");
                }
                if (!dateBirhsday.matches("[0-3][0-9].[0-1][0-9].[0-2][0-9][0-9][0-9]")) {
                    throw new RuntimeException("Неверный формат даты");
                }
            }
            return dateBirhsday;
        }

        public static String getPhoneNumber(String massage) {
            String phoneNumber = new String();
            while (phoneNumber.isEmpty()) {
                try {
                    Scanner sc = new Scanner(System.in);
                    System.out.println("Введите " + massage);
                    phoneNumber = sc.nextLine();
                } catch (NullPointerException ex) {
                    System.out.println(ex + "Повторите ввод");
                }
            }
            if (phoneNumber.length() != 10) {
                throw new RuntimeException("Неверное число символов");
            }
            if (!phoneNumber.matches("[0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9]")) {
                throw new RuntimeException("Номер телефона должен содержать только цифры");
            }
            return phoneNumber;
        }

        public static String getGender(String massage) {
            String gender = new String();
            while (gender.isEmpty()) {
                try {
                    Scanner sc = new Scanner(System.in);
                    System.out.println("Введите " + massage);
                    gender = sc.nextLine();
                } catch (NullPointerException ex) {
                    System.out.println(ex + "Повторите ввод");
                }
            }
            if (!gender.matches("[f,m]")) {
                throw new RuntimeException("Недопустимые символы");
            }
            return gender;
        }

        public static void saveFile(String data, String nameFile) {
            // String pathFile = "C:/geek/excep/excep3/text.txt";
            try (FileWriter fw = new FileWriter(nameFile,true)) {
                fw.append(data);
                fw.append('\n');
            }
            catch (IOException exception) {
                System.out.println(exception.getMessage());
            }
        }
    }

}
