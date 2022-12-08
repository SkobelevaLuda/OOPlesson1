public class Human {
    private int yearOfBirth;
    String name;
    private String town;
    String jobTitle;

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public String getTown() {
        return town;
    }

    public void setYearOfBirth(int yearOfBirth) {
        if (yearOfBirth > 0) {
            this.yearOfBirth = yearOfBirth;
        } else {
            this.yearOfBirth = 0;
        }
    }

    public void setTown(String town) {
        if (town == null || town.isBlank()) {
            this.town = "Информация не указана";
        } else {
            this.town = town;
        }
    }

    public Human(String name, int yearOfBirth, String town, String jobTitle) {
        setYearOfBirth(yearOfBirth);
        if (name == null || name.isBlank()) {
            this.name = "Информация не указана";
        } else {
            this.name = name;
        }
        this.jobTitle = jobTitle;
        if (jobTitle == null || jobTitle.isBlank()) {
            this.jobTitle = "Информация не указана";
        } else {
            this.jobTitle = jobTitle;
        }
        setTown(town);
    }

    void people() {
        System.out.println("Привет! Меня зовут " + name + " Я из города " + town + " Я родился в " + yearOfBirth + " году. " +
                "Я работаю на должности" + jobTitle + ". Будем знакомы!");
    }
}
