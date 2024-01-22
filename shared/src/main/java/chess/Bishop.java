package chess;

import java.util.ArrayList;
import java.util.Collection;

public class Bishop extends ChessPiece{

    public Bishop(ChessGame.TeamColor pieceColor) {
        super(pieceColor, PieceType.BISHOP);
    }

    @Override
    public Collection<ChessMove> pieceMoves(ChessBoard board, ChessPosition myPosition) {

        ArrayList legalBishopMovesList = new ArrayList<ChessMove>();

        return legalBishopMovesList;
    }
}
