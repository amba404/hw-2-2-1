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

        for (int i = 0; i < studentsG.length; i++) {
            for (int j = 0; j < studentsG.length; j++) {
                if (i == j) continue;
                Gryffindor a = studentsG[i], b = studentsG[j];
                System.out.println("a = " + a);
                System.out.println("b = " + b);
                a.printCompare(b);
            }
        }


        Hufflepuff[] studentsH = {
                new Hufflepuff("Захария Смит", r.nextInt(101), r.nextInt(101), r.nextInt(101), r.nextInt(101), r.nextInt(101)),
                new Hufflepuff("Седрик Диггори", r.nextInt(101), r.nextInt(101), r.nextInt(101), r.nextInt(101), r.nextInt(101)),
                new Hufflepuff("Джастин Финч-Флетчли", r.nextInt(101), r.nextInt(101), r.nextInt(101), r.nextInt(101), r.nextInt(101)),
        };

        for (int i = 0; i < studentsH.length; i++) {
            for (int j = 0; j < studentsH.length; j++) {
                if (i == j) continue;
                Hufflepuff a = studentsH[i], b = studentsH[j];
                System.out.println("a = " + a);
                System.out.println("b = " + b);
                a.printCompare(b);
            }
        }

        Ravenclaw[] studentsR = {
                new Ravenclaw("Чжоу Чанг", r.nextInt(101), r.nextInt(101), r.nextInt(101), r.nextInt(101), r.nextInt(101), r.nextInt(101)),
                new Ravenclaw("Падма Патил", r.nextInt(101), r.nextInt(101), r.nextInt(101), r.nextInt(101), r.nextInt(101), r.nextInt(101)),
                new Ravenclaw("Маркус Белби", r.nextInt(101), r.nextInt(101), r.nextInt(101), r.nextInt(101), r.nextInt(101), r.nextInt(101)),
        };

        for (int i = 0; i < studentsR.length; i++) {
            for (int j = 0; j < studentsR.length; j++) {

                if (i == j) continue;
                Ravenclaw a = studentsR[i], b = studentsR[j];
                System.out.println("a = " + a);
                System.out.println("b = " + b);
                a.printCompare(b);
            }
        }

        Slytherin[] studentsS = {
                new Slytherin("Драко Малфой", r.nextInt(101), r.nextInt(101), r.nextInt(101), r.nextInt(101), r.nextInt(101), r.nextInt(101), r.nextInt(101)),
                new Slytherin("Грэхэм Монтегю", r.nextInt(101), r.nextInt(101), r.nextInt(101), r.nextInt(101), r.nextInt(101), r.nextInt(101), r.nextInt(101)),
                new Slytherin("Грегори Гойл", r.nextInt(101), r.nextInt(101), r.nextInt(101), r.nextInt(101), r.nextInt(101), r.nextInt(101), r.nextInt(101)),
        };

        for (int i = 0; i < studentsS.length; i++) {
            for (int j = 0; j < studentsS.length; j++) {
                if (i == j) continue;
                Slytherin a = studentsS[i], b = studentsS[j];
                System.out.println("a = " + a);
                System.out.println("b = " + b);
                a.printCompare(b);
            }
        }

        testCompare(studentsG[0], studentsS[0]);
        testCompareArray(studentsG);

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
        /*
        несмотря на то, что в метод переданы объекты одного класса, напр. Gryffindor,
        вызывается Hogwarts.printCompare(Hogwarts), а не Gryffindor.printCompare(Gryffindor).
        WTF?
         */
        a.printCompare(b);
    }
}
