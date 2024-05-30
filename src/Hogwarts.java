public class Hogwarts {
    private String studentsName;
    private int transgress;
    private int wiz;

    public Hogwarts(String studentsName, int transgress, int wiz) {
        this.studentsName = studentsName;
        this.transgress = transgress;
        this.wiz = wiz;
    }

    public String getStudentsName() {
        return studentsName;
    }

    public void setStudentsName(String studentsName) {
        this.studentsName = studentsName;
    }


    public int getTransgress() {
        return transgress;
    }

    public void setTransgress(int transgress) {
        this.transgress = transgress;
    }

    public int getWiz() {
        return wiz;
    }

    public void setWiz(int wiz) {
        this.wiz = wiz;
    }

    @Override
    public String toString() {
        return "Имя студента: " + studentsName +
                ", Трансгрессия " + transgress +
                ", Сила магии " + wiz + ".";
    }
}
