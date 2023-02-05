package Problems;

import java.util.LinkedList;

public class NumberOfIsLand {

    void callDFS(int arr[][], int i, int j, int row, int col) {
        if(i<0 || i>=row || j<0 || j>=col || arr[i][j]==0) {
            return;
        }
        arr[i][j]=0;    // to replace visited concept

        callDFS(arr, i+1, j, row, col);
        callDFS(arr, i-1, j, row, col);
        callDFS(arr, i,j+1, row,  col);
        callDFS(arr, i, j-1, row, col);
        callDFS(arr, i-1, j+1, row, col);
        callDFS(arr, i+1, j+1, row, col);
        callDFS(arr, i+1, j-1, row, col);
        callDFS(arr, i-1, j-1, row, col);
    }

    int getNumberOfIsland(int arr[][]) {
        int row = arr.length;
        int col = arr[0].length;
        int noOfIsland = 0;
        for(int i=0;i<row;i++) {
            for(int j=0;j<col;j++) {
                if(arr[i][j]==1) {
                    noOfIsland++;
                    callDFS(arr, i, j, row, col);
                }
            }
        }
        return noOfIsland;
    }

    public static void main(String[] args) {
        int arr[][] = {
                { 1, 1, 0, 0, 0 },
                { 0, 1, 0, 0, 1 },
                { 1, 0, 0, 1, 1 },
                { 0, 0, 0, 0, 0 },
                { 1, 0, 1, 0, 1 }
        };

        NumberOfIsLand ob = new NumberOfIsLand();
        System.out.println("No. of Island: " + ob.getNumberOfIsland(arr));
    }
}
