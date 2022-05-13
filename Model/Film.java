package Model;

public class Film implements Comparable <Film> {
    
    private String title; // exemplo: “O Rei Leão”
    private String genre; // exemplo: “Musical infantil”
    private String classification; // exemplo: “Livre”
    private int year; // exemplo: 1994
    
    // métodos da classe (gets, sets, construtor, compareTo, toString)
    public Film(String g) {
        this.genre = g;
    }

    public void setTitle(String newTitle) {
        this.title = newTitle;
    }

    public void setGenre(String newGenre) {
        this.genre = newGenre;
    }

    public void setClassification(String newClassification) {
        this.classification = newClassification;
    }

    public void setYear(int newYear) {
        this.year = newYear;
    }

    public String getTitle() {
        return title;
    }

    public String getGenre() {
        return genre;
    }

    public String getClassification() {
        return classification;
    }

    public int getYear() {
        return year;
    }

    @Override
    public int compareTo(Film film) {
        int aux;
        aux = this.genre.compareTo(film.genre);
        return aux;
    }
}
