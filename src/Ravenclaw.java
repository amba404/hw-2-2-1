import org.jetbrains.annotations.NotNull;

public class Ravenclaw extends Hogwarts {
    private int intelligence;
    private int wisdom;
    private int wit;
    private int creativity;

    public Ravenclaw(@NotNull String name, int magicPower, int transgressionDistance, int intelligence, int wisdom, int wit, int creativity) {
        super(name, magicPower, transgressionDistance);
        this.setIntelligence(intelligence);
        this.setWisdom(wisdom);
        this.setWit(wit);
        this.setCreativity(creativity);
    }

    @Override
    public String toString() {
        return super.toString() +
                ", intelligence=" + intelligence +
                ", wisdom=" + wisdom +
                ", wit=" + wit +
                ", creativity=" + creativity;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        if (isWrongPropVal(intelligence)) throw new IllegalArgumentException("Значение intelligence не верно");
        this.intelligence = intelligence;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        if (isWrongPropVal(wisdom)) throw new IllegalArgumentException("Значение wisdom не верно");
        this.wisdom = wisdom;
    }

    public int getWit() {
        return wit;
    }

    public void setWit(int wit) {
        if (isWrongPropVal(wit)) throw new IllegalArgumentException("Значение wit не верно");
        this.wit = wit;
    }

    public int getCreativity() {
        return creativity;
    }

    public void setCreativity(int creativity) {
        if (isWrongPropVal(creativity)) throw new IllegalArgumentException("Значение creativity не верно");
        this.creativity = creativity;
    }

    @Override
    public void printCompare(@NotNull Hogwarts student) {
        if (!getClass().equals(student.getClass())) {
            super.printCompare(student);
            return;
        }
        Ravenclaw a = this, b = (Ravenclaw) student;
        int sumA = a.getIntelligence() + a.getWisdom() + a.getWit() + a.getCreativity();
        int sumB = b.getIntelligence() + b.getWisdom() + b.getWit() + b.getCreativity();
        StringBuilder res = new StringBuilder(a.getName());

        if (sumA > sumB) {
            res.append(" лучший Когтевранец, чем ");
        } else if (sumA < sumB) {
            res.append(" худший Когтевранец, чем ");
        } else {
            res.append(" такой же Когтевранец, как и ");
        }

        res.append(b.getName());

        System.out.println(res);

    }
}
