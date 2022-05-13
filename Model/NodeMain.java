package Model;

public class NodeMain {
    
    private NodeMain prev;
    private Category info; 
    private NodeMain next;
    
    public NodeMain(Category cat) {
        this.info = cat;
    }

    public void setInfoMain(Category value) {
        this.info = value;
    }

    public void setPrevMain(NodeMain newPrev) {
        this.prev = newPrev;
    }

    public void setNextMain(NodeMain newNext) {
        this.next = newNext;
    }

    public Category getInfoMain() {
        return this.info;
    }

    public NodeMain getPrevMain() {
        return this.prev;
    }

    public NodeMain getNextMain() {
        return this.next;
    }
}

