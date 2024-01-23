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

        calculateDiagonalMoves(legalBishopMovesList, board, myPosition);

        return legalBishopMovesList;
    }

    private void calculateDiagonalMoves(Collection<ChessMove> legalBishopMoves, ChessBoard board, ChessPosition myPosition){
        int row = myPosition.getRow();
        int col = myPosition.getColumn();

        calculateDiagonal(legalBishopMoves, board, myPosition, row, col, 1, 1, 7 - row, 7 - col);
        calculateDiagonal(legalBishopMoves, board, myPosition, row, col, 1, -1, 7 - row, col);
        calculateDiagonal(legalBishopMoves, board, myPosition, row, col, -1, -1, row, col);
        calculateDiagonal(legalBishopMoves, board, myPosition, row, col, -1, 1, row, 7 - col);
    }

    private void calculateDiagonal(Collection<ChessMove> legalBishopMoves, ChessBoard board, ChessPosition myPosition, int row, int col, int rowOffset, int colOffset, int rowRange, int colRange){
        int newRow = row;
        int newCol = col;

        for(int i = 0; i < Math.min(rowRange, colRange); i++){
            newRow += rowOffset;
            newCol += colOffset;

            ChessPosition newPosition = new ChessPosition(newRow, newCol);
            if(!isValidMove(legalBishopMoves, board, myPosition, newPosition)){
                break;
            }
        }
    }

    private boolean isValidMove(Collection<ChessMove> legalBishopMoves, ChessBoard board, ChessPosition myPosition, ChessPosition newPosition){
        ChessPiece pieceAtNewPosition = board.getPiece(newPosition);

        //Check to see if the new position is occupied
        if(pieceAtNewPosition != null){

            //Check teams
            if(pieceAtNewPosition.getTeamColor() != this.getTeamColor()){
                legalBishopMoves.add(new ChessMove(myPosition, newPosition));
            }
            return false;
        } else {
            legalBishopMoves.add(new ChessMove(myPosition, newPosition));
            return true;
        }
    }
}
