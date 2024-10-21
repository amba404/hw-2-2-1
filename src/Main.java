import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random r = new Random();

        Gryffindor[] students = {
                new Gryffindor("Гарри Поттер", r.nextInt(101), r.nextInt(101), r.nextInt(101), r.nextInt(101), r.nextInt(101)),
                new Gryffindor("Гермиона Грейнджер", r.nextInt(101), r.nextInt(101), r.nextInt(101), r.nextInt(101), r.nextInt(101)),
                new Gryffindor("Рон Уизли", r.nextInt(101), r.nextInt(101), r.nextInt(101), r.nextInt(101), r.nextInt(101)),
        };

        for (int i = 0; i < students.length; i++) {
            for (int j = 0; j < students.length; j++) {
                if (i == j) continue;
                Gryffindor a = students[i], b = students[j];
                System.out.println("a = " + a);
                System.out.println("b = " + b);
                a.printCompare(b);
            }
        }


    }
}
