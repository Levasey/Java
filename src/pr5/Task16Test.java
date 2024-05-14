package pr5;

public class Task16Test {
    public static void main(String[] args) {
        Task16 puzzle = new Task16();
        puzzle.vor(1);
        puzzle.vor(3);
        if (puzzle.big == 5 && puzzle.small == 0) {
            System.out.println("Получилось как ожидалось");
        } else {
            System.out.println("Получилось: " + puzzle.big + "/8" + puzzle.small + "/5");
        }
    }
}
