package chess;

/**
 * A chessboard that can hold and rearrange chess pieces.
 * <p>
 * Note: You can add to this class, but you may not alter
 * signature of the existing methods.
 */
public class ChessBoard {

    private ChessPiece[][] chessBoard = new ChessPiece[8][8];

    public ChessBoard() {

    }

    /**
     * Adds a chess piece to the chessboard
     *
     * @param position where to add the piece to
     * @param piece    the piece to add
     */
    public void addPiece(ChessPosition position, ChessPiece piece) {

        chessBoard[position.getRow()][position.getColumn()] = piece;
    }

    /**
     * Gets a chess piece on the chessboard
     *
     * @param position The position to get the piece from
     * @return Either the piece at the position, or null if no piece is at that
     * position
     */
    public ChessPiece getPiece(ChessPosition position) {
        return chessBoard[position.getColumn()][position.getColumn()];
    }

    /**
     * Sets the board to the default starting board
     * (How the game of chess normally starts)
     */
    public void resetBoard() {
        for(int i = 0; i < 8; i++){
            for(int j = 0; j < 8; j++){
                chessBoard[i][j] = null;
            }
        }

        setupPiecesForColor(0, ChessGame.TeamColor.WHITE);
        setupPiecesForColor(7, ChessGame.TeamColor.BLACK);
    }

    public void setupPiecesForColor(int row, ChessGame.TeamColor color){
        chessBoard[row][0] = new Rook(color);
        chessBoard[row][1] = new Knight(color);
        chessBoard[row][2] = new Bishop(color);
        chessBoard[row][3] = new Queen(color);
        chessBoard[row][4] = new King(color);
        chessBoard[row][5] = new Bishop(color);
        chessBoard[row][6] = new Knight(color);
        chessBoard[row][7] = new Rook(color);

        //Setting up the paws
        if(row == 1 || row == 6){
            for(int j = 0; j < 8; j++){
                chessBoard[row][j] = new Pawn(color);
            }
        }
    }
}
