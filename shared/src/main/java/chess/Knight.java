package chess;

import java.util.ArrayList;
import java.util.Collection;

public class Knight extends ChessPiece{
    public Knight(ChessGame.TeamColor pieceColor) {
        super(pieceColor, PieceType.KNIGHT);
    }

    @Override
    public Collection<ChessMove> pieceMoves(ChessBoard board, ChessPosition myPosition) {

        ArrayList legalKnightMovesList = new ArrayList<ChessMove>();

        return legalKnightMovesList;
    }
}
