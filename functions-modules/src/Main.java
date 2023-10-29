public class Main {
    public static void main(String[] args) {
        numberPuzzle();
        giveMessage("Gek");
    }

    public static void numberPuzzle() {
        int[] numbers = new int[]{1, 2, 5, 7, 9, 0};
        int tobeSearched = 5;
        boolean isThere = false;

        for (int number: numbers) {
            if(number == tobeSearched) {
                isThere = true;
                break;
            }
        }

        if(isThere) {
            System.out.println("The number is available: " + tobeSearched);
        }else{
            System.out.println("The number is not available: " + tobeSearched);
        }
    }

    public static void giveMessage(String message) {
        System.out.println(message);
    }
}