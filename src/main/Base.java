import java.util.HashMap;
import java.util.Optional;

public class Base extends Field {

    Optional<Ant> ant;
    HashMap<Character,boolean[]> marker;
    boolean changed = false;
    boolean isNextToAntlion = false;

    public Base(Character type, int x, int y) {
        super(type, x, y);
    }
}
