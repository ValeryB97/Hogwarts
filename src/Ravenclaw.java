public class Ravenclaw extends Hogwarts {
    private final int smart;
    private final int wise;
    private final int witty;
    private final int fullOfCreativity;

    public Ravenclaw(String studentsName, int transgress, int wizPower, int smart, int wise, int witty, int fullOfCreativity) {
        super(studentsName, transgress, wizPower);
        this.smart = smart;
        this.wise = wise;
        this.witty = witty;
        this.fullOfCreativity = fullOfCreativity;
    }

    public void bestRavenclaw(Ravenclaw student) {
        if (this.smart + this.wise + this.witty + this.fullOfCreativity > student.smart + student.wise + student.witty + student.fullOfCreativity) {
            System.out.printf("%s лучший Пуфендуец, чем %s%n", this.getStudentsName(), student.getStudentsName());
        } else if (this.smart + this.wise + this.witty + this.fullOfCreativity < student.smart + student.wise + student.witty + student.fullOfCreativity) {
            System.out.printf("%s лучший Пуфендуец, чем %s%n", student.getStudentsName(), this.getStudentsName());
        } else {
            System.out.printf("%s такой же Пуфендуец, как и %s%n", this.getStudentsName(), student.getStudentsName());
        }
    }

    @Override
    public String toString() {
        return "Факультет Когтевран Имя студента: " + getStudentsName() +
                ", Трансгрессия " + getTransgress() +
                ", Сила магии " + getWizPower() +
                ", Ум " + smart +
                ", Мудрость " + wise +
                ", Остроумие " + witty +
                ", Креативность " + fullOfCreativity +
                '.';
    }
}
