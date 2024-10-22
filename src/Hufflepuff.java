import org.jetbrains.annotations.NotNull;

public class Hufflepuff extends Hogwarts {
    private int diligence;
    private int loyalty;
    private int honesty;

    @Override
    public String toString() {
        return super.toString() +
                ", diligence=" + diligence +
                ", loyalty=" + loyalty +
                ", honesty=" + honesty;
    }

    public Hufflepuff(@NotNull String name, int magicPower, int transgressionDistance, int diligence, int loyalty, int honesty) {
        super(name, magicPower, transgressionDistance);
        this.setDiligence(diligence);
        this.setLoyalty(loyalty);
        this.setHonesty(honesty);
    }

    public int getDiligence() {
        return diligence;
    }

    public void setDiligence(int diligence) {
        if (!checkVal(diligence)) throw new IllegalArgumentException("Значение diligence не верно");
        this.diligence = diligence;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        if (!checkVal(loyalty)) throw new IllegalArgumentException("Значение loyalty не верно");
        this.loyalty = loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setHonesty(int honesty) {
        if (!checkVal(honesty)) throw new IllegalArgumentException("Значение honesty не верно");
        this.honesty = honesty;
    }

    public void printCompare(@NotNull Hufflepuff student) {
        Hufflepuff a = this, b = student;
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
