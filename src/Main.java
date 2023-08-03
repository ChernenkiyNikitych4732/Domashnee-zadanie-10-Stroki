public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }
    private static void task1() {
        System.out.println("Задача №1");
        System.out.println("Представьте, что вы работаете в небольшой компании. Данные сотрудников хранятся в неструктурированном формате. Бухгалтерия попросила написать программу, в которой  можно работать с Ф. И. О. сотрудников.\n" +
                "\n" +
                "Напишите четыре строки:\n" +
                "\n" +
                "С именем Name — для хранения имени.\n" +
                "С именем Fathername — для хранения отчества.\n" +
                "С именем Surname— для хранения фамилии.\n" +
                "С именем fullName — для хранения Ф. И. О. сотрудника в формате \"Фамилия Имя Отчество\".\n" +
                "Выведите в консоль фразу: «ФИО сотрудника — …");
        System.out.println("Решение задачи 1");
        String Surname = "Иванов";
        String Name = "Иван";
        String Fathername = "Иванович";
        Surname = "Черненький";
        Name = "Никита";
        Fathername = "Александрович";
        String fullName = Surname + " " + Name + " " + Fathername;
        System.out.print("ФИО сотрудника - " + fullName);
        System.out.println();
    }
    private static void task2() {
        System.out.println("Задача №2");
        System.out.println("Решение задачи №2");
        System.out.println("Для ежемесячного отчета и ведения документации бухгалтерии нужны Ф. И. О. сотрудников, полностью написанные заглавными буквами (верхним регистром).\n" +
                "\n" +
                "Напишите программу, которая изменит написание Ф.И.О. сотрудника с \"Ivanov Ivan Ivanovich\" на полностью заглавные буквы.\n" +
                "\n" +
                "В качестве строки с исходными данными используйте строку fullName.\n" +
                "\n" +
                "Результат программы выведите в консоль в формате: \"Данные ФИО сотрудника для заполнения отчета — …\"");
        String fullName = "Ivanov Ivan Ivanovich";
        fullName = "Сhernenkiy Nikita Alexandrovich";
        System.out.println("ФИО сотрудника - " + fullName);
        System.out.println("Данные ФИО сотрудника для заполнения отчета - " + fullName.toUpperCase());
    }
    private static void task3() {
        System.out.println("Задача №3");
        System.out.println("Система, в которой мы работаем, не принимает символ «ё». Напишите программу, которая заменяет символ «ё» на символ «е».\n" +
                "\n" +
                "В качестве исходных данных используйте строку fullName и данные в ней — \"Иванов Семён Семёнович\".\n" +
                "\n" +
                "Выведите результат программы в консоль в формате: «Данные ФИО сотрудника — ...».");
        System.out.println("Решение задачи №3");
        String fullName = "Иванов Семён Семёнович";
        System.out.println("Исходные данные ФИО сотрудника - " + fullName);
        fullName = fullName.replace("ё", "е");
        System.out.println("Данные ФИО сотрудник - " + fullName);
    }
}