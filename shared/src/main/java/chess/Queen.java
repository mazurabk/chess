package chess;

import java.util.ArrayList;
import java.util.Collection;

public class Queen extends ChessPiece{
    public Queen(ChessGame.TeamColor pieceColor) {
        super(pieceColor, PieceType.QUEEN);
    }

    @Override
    public Collection<ChessMove> pieceMoves(ChessBoard board, ChessPosition myPosition) {

        ArrayList legalQueenMovesList = new ArrayList<ChessMove>();

        return legalQueenMovesList;
    }
}
