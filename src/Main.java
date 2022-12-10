public class Main {
    public static void main(String[] args) {

        //task #1
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullsName = lastName + " " + firstName + " " + middleName;
        System.out.println("ФИО сотрудника — " + fullsName);
        System.out.println();


        //task #2
        String fullName = "Ivanov Ivan Ivanovich";
        String fullNameUpper = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullNameUpper);
        System.out.println();

        //task #3
        String fullName1 = "Иванов Семён Семёнович";
        String fullName2 = fullName1.replace('ё', 'e');
        System.out.println("Данные ФИО сотрудника — " + fullName2);
        System.out.println();
    }
}