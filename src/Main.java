import org.jetbrains.annotations.NotNull;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random r = new Random();

        Gryffindor[] studentsG = {
                new Gryffindor("Гарри Поттер", r.nextInt(101), r.nextInt(101), r.nextInt(101), r.nextInt(101), r.nextInt(101)),
                new Gryffindor("Гермиона Грейнджер", r.nextInt(101), r.nextInt(101), r.nextInt(101), r.nextInt(101), r.nextInt(101)),
                new Gryffindor("Рон Уизли", r.nextInt(101), r.nextInt(101), r.nextInt(101), r.nextInt(101), r.nextInt(101)),
        };

        testCompareArray(studentsG);

        Hufflepuff[] studentsH = {
                new Hufflepuff("Захария Смит", r.nextInt(101), r.nextInt(101), r.nextInt(101), r.nextInt(101), r.nextInt(101)),
                new Hufflepuff("Седрик Диггори", r.nextInt(101), r.nextInt(101), r.nextInt(101), r.nextInt(101), r.nextInt(101)),
                new Hufflepuff("Джастин Финч-Флетчли", r.nextInt(101), r.nextInt(101), r.nextInt(101), r.nextInt(101), r.nextInt(101)),
        };

        testCompareArray(studentsH);

        Ravenclaw[] studentsR = {
                new Ravenclaw("Чжоу Чанг", r.nextInt(101), r.nextInt(101), r.nextInt(101), r.nextInt(101), r.nextInt(101), r.nextInt(101)),
                new Ravenclaw("Падма Патил", r.nextInt(101), r.nextInt(101), r.nextInt(101), r.nextInt(101), r.nextInt(101), r.nextInt(101)),
                new Ravenclaw("Маркус Белби", r.nextInt(101), r.nextInt(101), r.nextInt(101), r.nextInt(101), r.nextInt(101), r.nextInt(101)),
        };

        testCompareArray(studentsR);

        Slytherin[] studentsS = {
                new Slytherin("Драко Малфой", r.nextInt(101), r.nextInt(101), r.nextInt(101), r.nextInt(101), r.nextInt(101), r.nextInt(101), r.nextInt(101)),
                new Slytherin("Грэхэм Монтегю", r.nextInt(101), r.nextInt(101), r.nextInt(101), r.nextInt(101), r.nextInt(101), r.nextInt(101), r.nextInt(101)),
                new Slytherin("Грегори Гойл", r.nextInt(101), r.nextInt(101), r.nextInt(101), r.nextInt(101), r.nextInt(101), r.nextInt(101), r.nextInt(101)),
        };

        testCompareArray(studentsS);

        testCompare(studentsG[0], studentsS[0]);
        testCompare((Hogwarts) studentsG[0], (Hogwarts) studentsG[1]);

    }

    private static <T extends Hogwarts> void testCompareArray(T @NotNull [] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i == j) continue;
                T a = arr[i], b = arr[j];
                testCompare(a, b);
            }
        }
    }

    private static <T1 extends Hogwarts, T2 extends Hogwarts> void testCompare(@NotNull T1 a, @NotNull T2 b) {
        System.out.println();
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        a.printCompare(b);
    }
}
