package lk.ijse.dep.service;

public abstract class Player {
    protected Board board;
    public Player(Board board){
        this.board = board;
    }

    public void movePiece(int i) {
    }
}
