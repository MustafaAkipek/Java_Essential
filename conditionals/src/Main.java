public class Main {
    public static void main(String[] args) {
        int number = 20;

        if(number < 0) {
            System.out.println("This is a negative number.");
        }else if(number == 0) {
            System.out.println("This is a neutral number.");
        }else{
            System.out.println("This is a positive number.");
        }

        char grade = 'A';

        switch (grade) {
            case 'A':
                System.out.println("Excellent");
                break;
            case 'B':
                System.out.println("Very nice");
                break;
            case 'C':
                System.out.println("Nice");
                break;
            case 'D':
                System.out.println("Not bad");
                break;
            case 'E':
                System.out.println("Bad");
                break;
            default:
                System.out.println("This grade is invalid");
        }

    }
}