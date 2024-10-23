import org.jetbrains.annotations.NotNull;

public class Slytherin extends Hogwarts {
    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int lustForPower;

    public Slytherin(@NotNull String name, int magicPower, int transgressionDistance, int cunning, int determination, int ambition, int resourcefulness, int lustForPower) {
        super(name, magicPower, transgressionDistance);
        this.setCunning(cunning);
        this.setDetermination(determination);
        this.setAmbition(ambition);
        this.setResourcefulness(resourcefulness);
        this.setLustForPower(lustForPower);
    }

    @Override
    public String toString() {
        return super.toString() +
                ", cunning=" + cunning +
                ", determination=" + determination +
                ", ambition=" + ambition +
                ", resourcefulness=" + resourcefulness +
                ", lustForPower=" + lustForPower;
    }

    public int getCunning() {
        return cunning;
    }

    public void setCunning(int cunning) {
        if (isWrongPropVal(cunning)) throw new IllegalArgumentException("Значение cunning не верно");
        this.cunning = cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        if (isWrongPropVal(determination)) throw new IllegalArgumentException("Значение determination не верно");
        this.determination = determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        if (isWrongPropVal(ambition)) throw new IllegalArgumentException("Значение ambition не верно");
        this.ambition = ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(int resourcefulness) {
        if (isWrongPropVal(resourcefulness)) throw new IllegalArgumentException("Значение resourcefulness не верно");
        this.resourcefulness = resourcefulness;
    }

    public int getLustForPower() {
        return lustForPower;
    }

    public void setLustForPower(int lustForPower) {
        if (isWrongPropVal(lustForPower)) throw new IllegalArgumentException("Значение lustForPower не верно");
        this.lustForPower = lustForPower;
    }

    @Override
    public void printCompare(@NotNull Hogwarts student) {
        if (getClass() != student.getClass()) {
            super.printCompare(student);
            return;
        }
        Slytherin a = this, b = (Slytherin) student;
        int sumA = a.getCunning() + a.getDetermination() + a.getAmbition() + a.getResourcefulness() + a.getLustForPower();
        int sumB = b.getCunning() + b.getDetermination() + b.getAmbition() + b.getResourcefulness() + b.getLustForPower();
        StringBuilder res = new StringBuilder(a.getName());

        if (sumA > sumB) {
            res.append(" лучший Слизеринец, чем ");
        } else if (sumA < sumB) {
            res.append(" худший Слизеринец, чем ");
        } else {
            res.append(" такой же Слизеринец, как и ");
        }

        res.append(b.getName());

        System.out.println(res);

    }
}
