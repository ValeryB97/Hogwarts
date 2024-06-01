public class Hogwarts {
    private final String studentsName;
    private final int transgress;
    private final int wizPower;

    public Hogwarts(String studentsName, int transgress, int wizPower) {
        this.studentsName = studentsName;
        this.transgress = transgress;
        this.wizPower = wizPower;
    }

    public String getStudentsName() {
        return studentsName;
    }

    public int getTransgress() {
        return transgress;
    }

    public int getWizPower() {
        return wizPower;
    }

    public void powerDifference(Hogwarts student) {
        if (this.transgress + this.wizPower > student.transgress + student.wizPower) {
            System.out.printf("%s обладает большей мощностью магии, чем %s%n", this.studentsName, student.studentsName);
        } else if (this.transgress + this.wizPower < student.transgress + student.wizPower) {
            System.out.printf("%s обладает большей мощностью магии, чем %s%n", student.studentsName, this.studentsName);
        } else {
            System.out.printf("%s обладает такой же мощностью магии, как и %s%n", this.studentsName, student.studentsName);
        }
    }

    @Override
    public String toString() {
        return "Имя студента: " + studentsName +
                ", Трансгрессия " + transgress +
                ", Сила магии " + wizPower + ".";
    }
}
