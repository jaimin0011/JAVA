package Array;

public class function {

    public static void update(int marks[]) {
        for (int i = 0; i < marks.length; i++) {
            marks[i] = marks[i] + 20;
        }
    }

    public static void main(String[] args) {

        int marks[] = { 50, 60, 70 };
        update(marks);

        // print our marks
        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i] + " ");
        }
        System.out.println();

    }
}
