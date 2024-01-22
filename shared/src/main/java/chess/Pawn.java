package chess;

import java.util.ArrayList;
import java.util.Collection;

public class Pawn extends ChessPiece{
    public Pawn(ChessGame.TeamColor pieceColor) {
        super(pieceColor, PieceType.PAWN);
    }

    @Override
    public Collection<ChessMove> pieceMoves(ChessBoard board, ChessPosition myPosition) {

        ArrayList legalPawnMovesList = new ArrayList<ChessMove>();

        return legalPawnMovesList;
    }
}
