public class Main {
    public static void main(String[] args) {
        Hogwarts[] students = {
                new Hogwarts("Драко Малфой", 10, 20),
                new Hogwarts("Захария Смит", 10, 22),
                new Hogwarts("Волан-Де-Морт", 80, 220),
        };

        for (int i = 0; i < students.length; i++) {
            for (int j = 0; j < students.length; j++) {
                if (i == j) continue;
                Hogwarts a = students[i], b = students[j];
                a.printCompare(b);
            }

        }

    }
}
