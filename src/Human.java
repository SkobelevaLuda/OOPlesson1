public class Human {
    int yearOfBirth;
    String name;
    String town;
    String jobTitle;

    Human(String name, int yearOfBirth, String town, String jobTitle){
        if (name!= null){
            this.name=name;
        }else {
            this.name="Информация не указана";
        }

        if (yearOfBirth>0){
            this.yearOfBirth=yearOfBirth;
        }else {
            this.yearOfBirth=0;
        }
        if (town!=null){
            this.town =town;
        }else {
            this.town="Информация не указана";
        }
        if (jobTitle!=null){
            this.jobTitle=jobTitle;
        }else{
            this.town="Информация не указана";
        }
    }


    void people() {
        System.out.println("Привет! Меня зовут "+name+" Я из города "+town+" Я родился в "+yearOfBirth+" году. " +
                "Я работаю на должности" +jobTitle+ ". Будем знакомы!");
    }
}
