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
    }
}
