package chess;

import java.util.ArrayList;
import java.util.Collection;

public class King extends ChessPiece{
    public King(ChessGame.TeamColor pieceColor) {
        super(pieceColor, PieceType.KING);
    }

    @Override
    public Collection<ChessMove> pieceMoves(ChessBoard board, ChessPosition myPosition) {

        ArrayList legalKingMovesList = new ArrayList<ChessMove>();

        return legalKingMovesList;
    }
}
