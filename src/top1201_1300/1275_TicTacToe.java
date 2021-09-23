package top1201_1300;

class Solution {
    public String tictactoe(int[][] moves) {
        char[][] platform = new char[3][3];
        for (int i = 0; i < moves.length; i++) {
            if (i%2==0) {
                platform[moves[i][0]][moves[i][1]] = 'A';
            } else {
                platform[moves[i][0]][moves[i][1]] = 'B';
            }
        }

        boolean a = false,
                b = false;
        for (int j = 0; j < 3; j++) {
            if((platform[j][0]=='A' && platform[j][0]==platform[j][1] && platform[j][0]==platform[j][2]) ||
                    (platform[0][j]=='A' && platform[0][j]==platform[1][j] && platform[1][j]==platform[2][j])) {
                a = true;
            }
            if ((platform[j][0]=='B' && platform[j][0]==platform[j][1] && platform[j][0]==platform[j][2]) ||
                    (platform[0][j]=='B' && platform[0][j]==platform[1][j] && platform[1][j]==platform[2][j])) {
                b = true;
            }
        }
        if (
                platform[0][0]==platform[1][1] && platform[1][1] == platform[2][2] ||
                        platform[2][0]==platform[1][1] && platform[1][1]==platform[0][2]
        ) {
            if (platform[1][1] == 'A') {
                a = true;
            }
            if (platform[1][1] == 'B') {
                b = true;
            }
        }

        if (a) return "A";
        if (b) return "B";
        else {
            if(moves.length == 9) return "Draw";
            else return "Pending";
        }
    }
}