package Model;

import Controller.FilmController;

public class Category implements Comparable <Category> {
    
    private String description; // nome da categoria
    private FilmController list; // referência para a lista de filmes daquela categoria
    
    // métodos da classe (gets, sets, construtor, compareTo, toString)
    
    @Override
    public int compareTo(Category o) {
        return 0;
    } 
}