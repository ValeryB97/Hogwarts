public class Main {
    public static void main(String[] args) {
        Griffindor harryPotter = new Griffindor("Гарри Поттер", 43, 42, 53, 65, 89);
        Griffindor hermioneGranger = new Griffindor("Гермионна Грейнджер", 56, 78, 67, 54, 43);
        Griffindor ronaldWeasley = new Griffindor("Рональд Уизли", 53, 35, 65, 76, 43);
        Slytherin dracoMalfoy = new Slytherin("Драко Малфой", 43, 54, 65, 76, 43, 45, 34);
        Slytherin grahamMontague = new Slytherin("Грэхэм Монтегю", 32, 65, 34, 23, 54, 64, 14);
        Slytherin gregoryGoyle = new Slytherin("Грегори Гойл", 43, 42, 53, 65, 53, 23, 43);
        Hufflepuff zachariahSmith = new Hufflepuff("Захария Смит", 43, 46, 65, 24, 54);
        Hufflepuff cedricDiggory = new Hufflepuff("Седрик Диггори", 34, 64, 42, 65, 53);
        Hufflepuff justinFinchFletchley = new Hufflepuff("Джастин Финч-Флетчли", 64, 34, 54, 64, 42);
        Ravenclaw zhouChang = new Ravenclaw("Чжоу Чанг", 54, 53, 42, 65, 76, 43);
        Ravenclaw padmaPatil = new Ravenclaw("Падма Патил", 56, 52, 54, 76, 43, 23);
        Ravenclaw marcusBelby = new Ravenclaw("Маркус Белби", 34, 43, 54, 65, 76, 87);
        System.out.println(hermioneGranger);
        System.out.println(dracoMalfoy);
        System.out.println(zachariahSmith);
        System.out.println(padmaPatil);
        harryPotter.powerDifference(gregoryGoyle);
        hermioneGranger.bestGriffindor(ronaldWeasley);
        dracoMalfoy.bestSlytherin(grahamMontague);
        cedricDiggory.bestHufflepuff(justinFinchFletchley);
        zhouChang.bestRavenclaw(marcusBelby);

    }
}