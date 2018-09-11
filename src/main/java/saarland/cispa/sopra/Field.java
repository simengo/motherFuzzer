package saarland.cispa.sopra;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import saarland.cispa.sopra.systemtests.FieldInfo;
import saarland.cispa.sopra.systemtests.AntInfo;

public abstract class Field implements FieldInfo {

    private final int posX;
    private final int posY;
    private final char type;
    private Map<Character, boolean[]> marker = new HashMap<Character, boolean[]>();
    private AntInfo ant;
    private boolean isNextToAntlion;
    private boolean changed;

    public Field(char type, int posX, int posY) {
        this.posX = posX;
        this.posY = posY;
        this.type = type;
        this.ant = null;
        this.isNextToAntlion = false;
        this.changed = false;
    }

    @Override
    public Optional<AntInfo> getAnt() {

        return Optional.ofNullable(ant);

    }

    public void setAnt(Ant ant) {
        this.ant = ant;
    }

    @Override
    public int getX() {
        return posX;
    }

    @Override
    public int getY() {
        return posY;
    }

    @Override
    public char getType() {
        return type;
    }

    @Override
    public Map<Character, boolean[]> getMarkers() {

        return marker;
    }

    public void setMarker(Map<Character, boolean[]> marker) {
        this.marker = marker;
    }

    public boolean getMarker(char ident, int num) {
        return marker.get(ident)[num];
    }

    public boolean getIsNextToAntlion() {
        return isNextToAntlion;
    }

    public boolean getChanged() {
        return changed;
    }

    public void setChanged(boolean bool) {
        this.changed = bool;
    }

    public boolean isAccessible() {
        return this.ant == null && this.type != '#';
    }

    public void setMarker(char ident, int num, boolean bool) {
        this.marker.get(ident)[num] = bool;
    }

    public void setNextToAntlion(boolean nextToAntlion) {
        isNextToAntlion = nextToAntlion;
    }

    public void removeAnt() {
        this.ant = null;
    }

    @Override
    public String toString() {
        return "Field{" +
            "posX=" + posX +
            ", posY=" + posY +
            ", ant=" + ant +
            '}';
    }
}
