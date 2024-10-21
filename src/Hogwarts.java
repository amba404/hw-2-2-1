import org.jetbrains.annotations.NotNull;

public class Hogwarts {
    private final String name;
    private int magicPower;
    private int transgressionDistance;

    public Hogwarts(@NotNull String name, int magicPower, int transgressionDistance) {
        if (name.isBlank()) throw new IllegalArgumentException("Имя указано неверно");
        this.name = name;
        this.setMagicPower(magicPower);
        this.setTransgressionDistance(transgressionDistance);
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
        if (transgressionDistance < 0) throw new IllegalArgumentException("Расстояние трансгрессии указано неверно");
        this.transgressionDistance = transgressionDistance;
    }

    public void printCompare(@NotNull Hogwarts student) {
        StringBuilder res = new StringBuilder(getName());

        int magicPower1 = this.getMagicPower();
        int magicPower2 = student.getMagicPower();
        int transDist1 = this.getTransgressionDistance();
        int transDist2 = student.getTransgressionDistance();

        int cmpMagic = magicPower1 > magicPower2 ? 1 :  magicPower1 < magicPower2 ? 2 : 0;
        int cmpTransDist = transDist1 > transDist2 ? 1 :  transDist1 < transDist2 ? 2 : 0;

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
                res.append(" магическиой силой");
            }

            if (cmpMagic != 0 & cmpTransDist != 0) {
                res.append(", но");
            }

            if (cmpTransDist > 0) {
                res.append(cmpTransDist == 1 ? " бОльшей" : " меньшей");
                res.append(" дистанцией трансгрессии");
            }

        }

        res.append(", чем ").append(student.getName());

        System.out.println(res);
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", magicPower=" + magicPower +
                ", transgressionDistance=" + transgressionDistance;
    }
}
