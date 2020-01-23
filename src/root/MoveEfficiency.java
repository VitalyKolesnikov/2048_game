package root;

public class MoveEfficiency implements Comparable<MoveEfficiency> {
    private int numberOfEmptyTiles, score;
    private Move move;

    public MoveEfficiency(int numberOfEmptyTiles, int score, Move move) {
        this.numberOfEmptyTiles = numberOfEmptyTiles;
        this.score = score;
        this.move = move;
    }

    public Move getMove() {
        return move;
    }

    @Override
    public int compareTo(MoveEfficiency o) {
        int tilesComparison = Integer.compare(this.numberOfEmptyTiles, o.numberOfEmptyTiles);
        if (tilesComparison > 0) {
            return 1;
        } else if (tilesComparison < 0) {
            return -1;
        } else {
            return Integer.compare(this.score, o.score);
        }
    }
}