public class Main {
    public static void main(String[] args) {
        Human maksim = new Human(" Максим ", 1988, "Минск ", " бренд-менеджером ");
        maksim.people();

        Human anya = new Human("  ", 1993, "Москва ",
                "  методистом образовательных программ ");
        anya.people();

        Human katya = new Human(" Катя ", 1992, " Калиниград ", " продакт-менеджером ");
        katya.people();

        Human artem = new Human(" Артем ", -1995, " Москва ",
                " директором по развитию бизнеса ");
        artem.people();

        Human vladimir = new Human(" Владимир ", 2001, " Казань ", " безработный ");
        vladimir.people();

        Flover roza = new Flover(" Роза", " Голландия ", " ", 35.59, 0);
        roza.flovers();

        Flover hrizantema = new Flover("Хризантема", " ", "", 15.00, -5);
        hrizantema.flovers();

        Flover pion = new Flover("Пион", " Англия ", "", 69.90, 1);
        pion.flovers();

        Flover gipsofila = new Flover("Гипсофила", " Турция ", "", 19.50, 10);
        gipsofila.flovers();


        Bouquet bouquet=new Bouquet (
                new Flover[]{roza,roza,roza,
                        hrizantema,hrizantema,hrizantema,hrizantema,hrizantema,
                        gipsofila}
                );
        bouquet.printInfo();
    }

}