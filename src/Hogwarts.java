import org.jetbrains.annotations.NotNull;

public abstract class Hogwarts {
    static private final int MIX_PROP_VAL = 0;
    static private final int MAX_PROP_VAL = 100;
    private final String name;
    private int magicPower;
    private int transgressionDistance;

    public Hogwarts(@NotNull String name, int magicPower, int transgressionDistance) {
        if (name.isBlank()) throw new IllegalArgumentException("Имя указано неверно");
        this.name = name;
        this.setMagicPower(magicPower);
        this.setTransgressionDistance(transgressionDistance);
    }

    static protected boolean isWrongPropVal(int val) {
        return (val > Hogwarts.MAX_PROP_VAL || val < Hogwarts.MIX_PROP_VAL);
    }

    public static void printCompareHogwarts(@NotNull Hogwarts a, @NotNull Hogwarts b) {
        StringBuilder res = new StringBuilder(a.getName());

        int magicPower1 = a.getMagicPower();
        int magicPower2 = b.getMagicPower();
        int transDist1 = a.getTransgressionDistance();
        int transDist2 = b.getTransgressionDistance();

        int cmpMagic = magicPower1 > magicPower2 ? 1 : magicPower1 < magicPower2 ? 2 : 0;
        int cmpTransDist = transDist1 > transDist2 ? 1 : transDist1 < transDist2 ? 2 : 0;

        if (cmpMagic == 0 & cmpTransDist == 0) {
            res.append(" ни хуже, ни лучше");
        } else if (cmpMagic == 1 & cmpTransDist == 1) {
            res.append(" по-любому сильнее");
        } else if (cmpMagic == 2 & cmpTransDist == 2) {
            res.append(" по-любому слабее");
        } else {
            res.append(" обладает");
            if (cmpMagic > 0) {
                res.append(cmpMagic == 1 ? " бОльшей" : " меньшей");
                res.append(" магической силой");
            }

            if (cmpMagic != 0 & cmpTransDist != 0) {
                res.append(", но");
            }

            if (cmpTransDist > 0) {
                res.append(cmpTransDist == 1 ? " бОльшей" : " меньшей");
                res.append(" дистанцией трансгрессии");
            }

        }

        res.append(", чем ").append(b.getName());

        System.out.println(res);
    }

    public String getName() {
        return name;
    }

    public int getMagicPower() {
        return magicPower;
    }

    public void setMagicPower(int magicPower) {
        if (magicPower < 0) throw new IllegalArgumentException("Сила магии указана неверно");
        this.magicPower = magicPower;
    }

    public int getTransgressionDistance() {
        return transgressionDistance;
    }

    public void setTransgressionDistance(int transgressionDistance) {
        if (transgressionDistance < 0) throw new IllegalArgumentException("Дистанция трансгрессии указана неверно");
        this.transgressionDistance = transgressionDistance;
    }

    public void printCompare(@NotNull Hogwarts student) {
        printCompareHogwarts(this, student);
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", magicPower=" + magicPower +
                ", transgressionDistance=" + transgressionDistance;
    }
}
