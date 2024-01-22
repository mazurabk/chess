package chess;

import java.util.ArrayList;
import java.util.Collection;

public class Rook extends ChessPiece{
    public Rook(ChessGame.TeamColor pieceColor) {
        super(pieceColor, PieceType.ROOK);
    }

    @Override
    public Collection<ChessMove> pieceMoves(ChessBoard board, ChessPosition myPosition) {

        ArrayList legalRookMovesList = new ArrayList<ChessMove>();

        return legalRookMovesList;
    }
}
