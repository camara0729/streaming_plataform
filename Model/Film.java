package Model;

public class Film implements Comparable <Film> {
    
    private String title; // exemplo: “O Rei Leão”
    private String genre; // exemplo: “Musical infantil”
    private String classification; // exemplo: “Livre”
    private int year; // exemplo: 1994
    
    // métodos da classe (gets, sets, construtor, compareTo, toString)
    
    @Override
    public int compareTo(Film o) {
        return 0;
    }
}
