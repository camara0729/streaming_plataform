package Model;

public class NodeAux {

    private NodeAux prev;
    private Film info;  
    private NodeAux next;
    
    public NodeAux(Film film) {
        this.info = film;
    }

    public void setInfoAux(Film value) {
        this.info = value;
    }

    public void setPrevAux(NodeAux newPrev) {
        this.prev = newPrev;
    }

    public void setNextAux(NodeAux newNext) {
        this.next = newNext;
    }

    public Film getInfoAux() {
        return this.info;
    }

    public NodeAux getPrevAux() {
        return this.prev;
    }

    public NodeAux getNextAux() {
        return this.next;
    }
}
