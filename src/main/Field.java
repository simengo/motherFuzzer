import java.util.HashMap;
import java.util.Optional;

import saarland.cispa.sopra.systemtests.FieldInfo;
import saarland.cispa.sopra.systemtests.AntInfo;

abstract class Field implements FieldInfo {

    int posX;
    int posY;
    char type;
    AntInfo ant;
    HashMap<Character, boolean[]> marker;
    boolean isNextToAntlion;
    boolean changed;

    public Field(char type, int x, int y) {
        this.posX = x;
        this.posY = y;
        this.type = type;
        this.ant = null;
        this.marker = new HashMap<>();
        this.isNextToAntlion = false;
        this.changed = false;
    }

    public int getFood() {
        return 0;
    }

    public Optional<AntInfo> getAnt() {
        return Optional.of(ant);
    }

    public int getX() {
        return posX;
    }

    public int getY() {
        return posY;
    }

    public char getType() {
        return type;
    }

    public HashMap<Character, boolean[]> getMarkers() {

        return marker;
    }

    public boolean getMarker(char c, int i) {
        return marker.get(c)[i];
    }

    public boolean isNextToAntlion() {
        return isNextToAntlion;
    }

    public boolean isChanged() {
        return changed;
    }

    public boolean isAccessible() {
        if (this.ant == null && this.type != '#') {
            return true;
        }
        return false;
    }


    public void setMarker(char c, int i, boolean b) {
        this.marker.get(c)[i] = b;
    }

    public void setAnt(Ant ant) {
        this.ant = (AntInfo) ant;
    }

    public void setNextToAntlion(boolean nextToAntlion) {
        isNextToAntlion = nextToAntlion;
    }

    public void setChanged() {
        this.changed = true;
    }

    public void removeAnt() {
        this.ant = null;
    }

}
