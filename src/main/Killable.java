public class Killable extends Instruction {
    int jumpPc;

    public Killable(int jumpPc) {
        this.jumpPc = jumpPc;
    }

    private void killcheck() {

    }

    private boolean isSurrounded() {
        return false;
    }

    private void removeDeadAnts() {

    }
}
