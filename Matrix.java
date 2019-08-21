import java.util.Random;

public class Matrix {

    private int[][] matrix;
    private int size;

    public static void main(String[] args) {
        Matrix matrix;
        matrix = new Matrix();
        matrix.setSize(5);
        matrix.setMatrix();
        matrix.displayMatrix();
        if (matrix.hasEvenNoOfOnesInRowsCols()){
            System.out.println("has even no of ones in rows and cols");
        }
        else {
            System.out.println("not passes test");
        }
    }

    private int getNoOfOnesInRow(int rowIndex){
        if (rowIndex >= 0 && rowIndex < size){
            int count = 0;
            for (int i=0; i<size; i++){
                if (matrix[rowIndex][i] == 1){
                    count++;
                }
            }
            return count;
        }
        return -1;
    }

    private int getNoOfOnesInCol(int colIndex){
        if (colIndex >= 0 && colIndex < size){
            int count = 0;
            for (int i=0; i<size; i++){
                if (matrix[i][colIndex] == 1){
                    count++;
                }
            }
            return count;
        }
        return -1;
    }

    public void setSize(int size){
        this.size = size;
    }

    public void setMatrix(){
        matrix = new int[size][size];
        for (int i=0; i<size; i++){
            for (int j=0; j<size; j++){
                Random rand;
                rand = new Random();
                int elem = rand.nextInt(2);
                matrix[i][j] = elem;
            }
        }
    }

    public void displayMatrix(){
        for (int i=0; i<size; i++){
            for (int j=0; j<size; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println("");
        }
    }

    public boolean hasEvenNoOfOnesInRowsCols(){
        for (int i=0; i<size; i++){
            int onesInRow = getNoOfOnesInRow(i);
            int onesInCol = getNoOfOnesInCol(i);
            if ( (onesInRow % 2 != 0) || (onesInCol % 2 != 0)){
                return false;
            }
        }
        return true;
    }
}
