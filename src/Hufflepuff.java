public class Hufflepuff extends Hogwarts {
    private final int hardworking;
    private final int loyal;
    private final int honest;

    public Hufflepuff(String studentsName, int transgress, int wizPower, int hardworking, int loyal, int honest) {
        super(studentsName, transgress, wizPower);
        this.hardworking = hardworking;
        this.loyal = loyal;
        this.honest = honest;
    }

    public void bestHufflepuff(Hufflepuff student) {
        if (this.hardworking + this.loyal + this.honest > student.hardworking + student.loyal + student.honest) {
            System.out.printf("%s лучший Пуфендуец, чем %s%n", this.getStudentsName(), student.getStudentsName());
        } else if (this.hardworking + this.loyal + this.honest < student.hardworking + student.loyal + student.honest) {
            System.out.printf("%s лучший Пуфендуец, чем %s%n", student.getStudentsName(), this.getStudentsName());
        } else {
            System.out.printf("%s такой же Пуфендуец, как и %s%n", this.getStudentsName(), student.getStudentsName());
        }
    }

    @Override
    public String toString() {
        return "Факультет Пуфендуй Имя студента: " + getStudentsName() +
                ", Трансгрессия " + getTransgress() +
                ", Сила магии " + getWizPower() +
                ", Трудолюбие " + hardworking +
                ", Верность " + loyal +
                ", Честность " + honest +
                '.';
    }
}
