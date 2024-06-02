public class Griffindor extends Hogwarts {
    private final int nobility;
    private final int honor;
    private final int bravery;

    public Griffindor(String studentsName, int transgress, int wizPower, int nobility, int honor, int bravery) {
        super(studentsName, transgress, wizPower);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public void bestGriffindor(Griffindor student) {
        if (this.nobility + this.honor + bravery > student.nobility + student.honor + student.bravery) {
            System.out.printf("%s лучший Гриффендориц, чем %s%n", this.getStudentsName(), student.getStudentsName());
        } else if (this.nobility + this.honor + bravery < student.nobility + student.honor + student.bravery) {
            System.out.printf("%s лучший Гриффендориц, чем %s%n", student.getStudentsName(), this.getStudentsName());
        } else {
            System.out.printf("%s такой же Гриффендориц, как и %s%n", this.getStudentsName(), student.getStudentsName());
        }
    }

    @Override
    public String toString() {
        return "Факультет Грифиндор Имя студента: " + getStudentsName() +
                ", Трансгрессия " + getTransgress() +
                ", Сила магии " + getWizPower() +
                ", Благородство " + nobility +
                ", Честь " + honor +
                ", Храбрость " + bravery + ".";
    }
}
