package org.example.structures;

import java.util.Arrays;

public class Arrays2D {


    public static void main(String[] args) {
        char[][]board = new char[5][5];
        for(int i = 0; i< 5 ; i++){
            for (int j =0;j<5;j++){
                board[i][j]='-';
            }
        }
        System.out.println(Arrays.deepToString(board));

        char[][] x=new char[][]{
                new char[]{'*','*','*'},
                new char[]{'*','*','*'},
                new char[]{'*','*','*'}

        };
        System.out.println(Arrays.deepToString(x));

    }

}
