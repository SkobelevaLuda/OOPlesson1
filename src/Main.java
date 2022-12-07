public class Main {
    public static void main(String[] args) {
        Human maksim = new Human (" Максим ", 1988, "Минск "," бренд-менеджером ");
        maksim.people();

        Human anya = new Human ( " Аня ",1993, "Москва ",
                "  методистом образовательных программ ");
        anya.people();

        Human katya = new Human (" Катя ", 1992, " Калиниград ", " продакт-менеджером ");
        katya.people();

        Human artem = new Human (" Артем ", 1995, " Москва ",
                " директором по развитию бизнеса ");
        artem.people();

    }
}