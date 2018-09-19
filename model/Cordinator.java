import java.util.LinkedList;

public class Cordinator {

    private Integer id;
    private static Cordinator _cordinator;
    private LinkedList<Integer> stack;

    private Cordinator() {
        _cordinator = new Cordinator();
    }

    public static Cordinator getCordinator() {
        if (_cordinator == null) {
            _cordinator = new Cordinator();
        }
        return _cordinator;
    }

    public void sendRequest(Integer id) {
        this.stack.addLast(id);
    }

    public Integer processRequest () {
        return this.stack.getFirst();
    }

    public void killCordinator () {
        this.stack = null;
        _cordinator = null;
        this.id = null;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

}
