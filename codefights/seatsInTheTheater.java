int seatsInTheater(int nCols, int nRows, int col, int row) {
    int rows = nRows-row;
    int cols = nCols - col + 1;
    return rows*cols;
}
