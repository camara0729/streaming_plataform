package Model;

import Controller.FilmController;

public class Category implements Comparable <Category> {
    
    private String description; // nome da categoria
    private FilmController list; // referência para a lista de filmes daquela categoria
    
    // métodos da classe (gets, sets, construtor, compareTo, toString)
    public Category(String d, FilmController l) {
        this.description = d;
        this.list = l;
    }

    public void setDescription(String newDescription) {
        this.description = newDescription;
    }

    public void setList(FilmController newList) {
        this.list = newList;
    }

    public String getDescription() {
        return description;
    }

    public FilmController getList() {
        return list;
    }

    @Override
    public int compareTo(Category cat) {
        int aux;
        aux = this.description.compareTo(cat.description);
        return aux;
    } 
}