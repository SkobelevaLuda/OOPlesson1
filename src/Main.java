public class Main {
    public static void main(String[] args) {
        Human maksim = new Human ();
        maksim.yearOfBirth = 1988;
        maksim.name= " Максим ";
        maksim.town = " Минск ";
        maksim.jobTitle = " бренд-менеджером ";
        maksim.people();

        Human anya = new Human ();
        anya.yearOfBirth = 1993;
        anya.name= " Аня ";
        anya.town = " Москва ";
        anya.jobTitle = " методистом образовательных программ ";
        anya.people();

        Human katya = new Human ();
        katya.yearOfBirth = 1992;
        katya.name= " Катя ";
        katya.town = " Калининград ";
        katya.jobTitle = " продакт-менеджером ";
        katya.people();

        Human artem = new Human ();
        artem.yearOfBirth = 1995;
        artem.name= " Артем ";
        artem.town = " Москва ";
        artem.jobTitle = " директором по развитию бизнеса ";
        artem.people();

    }
}