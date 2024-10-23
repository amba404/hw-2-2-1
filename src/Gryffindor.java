import org.jetbrains.annotations.NotNull;

public class Gryffindor extends Hogwarts {
    private int nobility;
    private int honor;
    private int bravery;

    public Gryffindor(@NotNull String name, int magicPower, int transgressionDistance, int nobility, int honor, int bravery) {
        super(name, magicPower, transgressionDistance);
        this.setNobility(nobility);
        this.setHonor(honor);
        this.setBravery(bravery);
    }

    @Override
    public String toString() {
        return super.toString() +
                ", nobility=" + nobility +
                ", honor=" + honor +
                ", bravery=" + bravery;
    }

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        if (isWrongPropVal(nobility)) throw new IllegalArgumentException("Значение nobility не верно");
        this.nobility = nobility;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        if (isWrongPropVal(honor)) throw new IllegalArgumentException("Значение honor не верно");
        this.honor = honor;
    }

    public int getBravery() {
        return bravery;
    }

    public void setBravery(int bravery) {
        if (isWrongPropVal(bravery)) throw new IllegalArgumentException("Значение bravery не верно");
        this.bravery = bravery;
    }

    @Override
    public void printCompare(@NotNull Hogwarts student) {
        if (!getClass().equals(student.getClass())) {
            super.printCompare(student);
            return;
        }
        Gryffindor a = this, b = (Gryffindor) student;
        int sumA = a.getNobility() + a.getHonor() + a.getBravery();
        int sumB = b.getNobility() + b.getHonor() + b.getBravery();
        StringBuilder res = new StringBuilder(a.getName());

        if (sumA > sumB) {
            res.append(" лучший Гриффиндорец, чем ");
        } else if (sumA < sumB) {
            res.append(" худший Гриффиндорец, чем ");
        } else {
            res.append(" такой же Гриффиндорец, как и ");
        }

        res.append(b.getName());

        System.out.println(res);

    }
}
