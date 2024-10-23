import org.jetbrains.annotations.NotNull;

public class Hufflepuff extends Hogwarts {
    private int diligence;
    private int loyalty;
    private int honesty;

    public Hufflepuff(@NotNull String name, int magicPower, int transgressionDistance, int diligence, int loyalty, int honesty) {
        super(name, magicPower, transgressionDistance);
        this.setDiligence(diligence);
        this.setLoyalty(loyalty);
        this.setHonesty(honesty);
    }

    @Override
    public String toString() {
        return super.toString() +
                ", diligence=" + diligence +
                ", loyalty=" + loyalty +
                ", honesty=" + honesty;
    }

    public int getDiligence() {
        return diligence;
    }

    public void setDiligence(int diligence) {
        if (isWrongPropVal(diligence)) throw new IllegalArgumentException("Значение diligence не верно");
        this.diligence = diligence;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        if (isWrongPropVal(loyalty)) throw new IllegalArgumentException("Значение loyalty не верно");
        this.loyalty = loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setHonesty(int honesty) {
        if (isWrongPropVal(honesty)) throw new IllegalArgumentException("Значение honesty не верно");
        this.honesty = honesty;
    }

    @Override
    public void printCompare(@NotNull Hogwarts student) {
        if (getClass() != student.getClass()) {
            super.printCompare(student);
            return;
        }
        Hufflepuff a = this, b = (Hufflepuff) student;
        int sumA = a.getDiligence() + a.getLoyalty() + a.getHonesty();
        int sumB = b.getDiligence() + b.getLoyalty() + b.getHonesty();
        StringBuilder res = new StringBuilder(a.getName());

        if (sumA > sumB) {
            res.append(" лучший Пуффендуец, чем ");
        } else if (sumA < sumB) {
            res.append(" худший Пуффендуец, чем ");
        } else {
            res.append(" такой же Пуффендуец, как и ");
        }

        res.append(b.getName());

        System.out.println(res);

    }
}
