package Maze;

import java.util.Scanner;

public class Maze {
    byte maze[][];
    public Maze(int n, int m){
        makeMaze(n,m);
        printMaze();
    }
    private void makeMaze(int n, int m){
        /**
         *  1. make size
         *  2. fill maze
         */
        maze = new byte[n][m];  //Make maze size
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < n; i++) {   // maze[i][] repeat
            String input = scanner.next();
            for (int j = 0; j < m; j++)
                maze[i][j] = Byte.parseByte(input.substring(j,j+1));
        }
    }
    private void printMaze() {  //Print maze struct
        for(byte[] cloumn : maze) {
            for(byte value : cloumn)
                System.out.print(value);
            System.out.println();
        }
    }
}
