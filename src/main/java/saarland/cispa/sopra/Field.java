package saarland.cispa.sopra;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import saarland.cispa.sopra.systemtests.FieldInfo;
import saarland.cispa.sopra.systemtests.AntInfo;

abstract class Field implements FieldInfo {

    private final int posX;
    private final int posY;
    private final char type;
    private AntInfo ant;
    private final Map<Character, boolean[]> marker = new HashMap<Character, boolean[]>();
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
        if(ant==null) return null; else
        return Optional.of(ant);
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

    public boolean getMarker(char ident, int num) {
        return marker.get(ident)[num];
    }

    public boolean getIsNextToAntlion() {
        return isNextToAntlion;
    }

    public boolean getChanged() {
        return changed;
    }

    public boolean isAccessible() {
        return this.ant == null && this.type != '#';
    }


    public void setMarker(char ident, int num, boolean bool) {
        this.marker.get(ident)[num] = bool;
    }

    public void setAnt(Ant ant) {
        this.ant = ant;
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
