public class Slytherin extends Hogwarts {
    private final int cunning;
    private final int determination;
    private final int ambition;
    private final int resourcefulness;
    private final int thirstForPower;

    public Slytherin(String studentsName, int transgress, int wizPower, int cunning, int determination, int ambition, int resourcefulness, int thirstForPower) {
        super(studentsName, transgress, wizPower);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.thirstForPower = thirstForPower;
    }

    public void bestSlytherin(Slytherin student) {
        if (this.cunning + this.determination + this.ambition + this.resourcefulness + this.thirstForPower > student.cunning + student.determination + student.ambition + student.resourcefulness + student.thirstForPower) {
            System.out.printf("%s лучший Слизеринец, чем %s%n", this.getStudentsName(), student.getStudentsName());
        } else if (this.cunning + this.determination + this.ambition + this.resourcefulness + this.thirstForPower < student.cunning + student.determination + student.ambition + student.resourcefulness + student.thirstForPower) {
            System.out.printf("%s лучший Слизеринец, чем %s%n", student.getStudentsName(), this.getStudentsName());
        } else {
            System.out.printf("%s такой же Слизеринец, как и %s%n", this.getStudentsName(), student.getStudentsName());
        }
    }

    @Override
    public String toString() {
        return "Факультет Слизерин Имя студента: " + getStudentsName() +
                ", Трансгрессия " + getTransgress() +
                ", Сила магии " + getWizPower() +
                ", Хитрость " + cunning +
                ", Решительность " + determination +
                ", Амбициозность " + ambition +
                ", Находчивость " + resourcefulness +
                ", Жажада власти " + thirstForPower +
                '.';
    }
}
