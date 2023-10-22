public class Main {
    public static void main(String[] args) {

        String[] students = new String[3];
        students[0] = "Engin";
        students[1] = "Derin";
        students[2] = "Salih";

        for(int i = 0; i < students.length; i++) {
            System.out.println(students[i]);
        }

        for(String student:students) {
            System.out.println(student);
        }

        double[] myList = {1.2, 1.3, 4.3, 5.6};
        double total = 0;
        double max = myList[0];
        for(double number:myList) {
            if(max < number) {
                max = number;
            }

            total += number;
            System.out.println(number);
        }

        System.out.println(total);
        System.out.println(max);

        String[][] cities = new String[3][3];
        cities[0][0] = "Istanbul";
        cities[0][1] = "Bursa";
        cities[0][2] = "Bilecik";
        cities[1][0] = "Ankara";
        cities[1][1] = "Konya";
        cities[1][2] = "Kayseri";
        cities[2][0] = "Diyarbakır";
        cities[2][1] = "Şanlıurfa";
        cities[2][2] = "Gaziantep";

        for(int i = 0; i <= 2; i++) {
            System.out.println("----------------------------");
            for(int j = 0; j <=2; j++ ) {
                System.out.println(cities[i][j]);
            }
        }
    }
}