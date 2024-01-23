package chess;

import java.util.ArrayList;
import java.util.Collection;

public class Rook extends ChessPiece{
    public Rook(ChessGame.TeamColor pieceColor) {
        super(pieceColor, PieceType.ROOK);
    }

    @Override
    public Collection<ChessMove> pieceMoves(ChessBoard board, ChessPosition myPosition) {

        int row = myPosition.getRow();
        int col = myPosition.getColumn();

        ArrayList legalRookMovesList = new ArrayList<ChessMove>();
        calculateLateralMoves(legalRookMovesList, board, myPosition, row, col);

        return legalRookMovesList;
    }

    private void calculateLateralMoves(Collection<ChessMove> legalRookMoves, ChessBoard board, ChessPosition myPosition, int row, int col){

        calculateLateral(legalRookMoves, board, myPosition, row, col, 7 - col, 1, 0);
        calculateLateral(legalRookMoves, board, myPosition, row, col, col, -1, 0);
        calculateLateral(legalRookMoves, board, myPosition, row, col, 7 - row, 0, 1);
        calculateLateral(legalRookMoves, board, myPosition, row, col, row, 0, -1);
    }

    private void calculateLateral(Collection<ChessMove> legalRookMovesList, ChessBoard board, ChessPosition myPosition, int row, int col, int range, int rowOffset, int colOffset){
        int newRow = row;
        int newCol = col;

        for(int i = 0; i < range; i++){
            newRow += rowOffset;
            newCol += colOffset;

            ChessPosition newPosition = new ChessPosition(newRow, newCol);
            if(board.getPiece(newPosition) == null){
                legalRookMovesList.add(new ChessMove(myPosition, newPosition));
            } else if(board.getPiece(newPosition).getTeamColor() != this.getTeamColor()){
                legalRookMovesList.add(new ChessMove(myPosition, newPosition));
                break;
            } else {
                break;
            }
        }
    }
}
