import java.util.*;
class Sudako {
    public static void  main(String...args) {
       char[][] board = {
    {'5','3','.','.','7','.','.','.','.'},
    {'6','.','.','1','9','5','.','.','.'},
    {'.','9','8','.','.','.','.','6','.'},
    {'8','.','.','.','6','.','.','.','3'},
    {'4','.','.','8','.','3','.','.','1'},
    {'7','.','.','.','2','.','.','.','6'},
    {'.','6','.','.','.','.','2','8','.'},
    {'.','.','.','4','1','9','.','.','5'},
    {'.','.','.','.','8','.','.','7','9'}
};
 

    ArrayList<ArrayList<char[][]>> res=new ArrayList<>();
    solve(board,0,0,res);

    System.out.println(res);
    }

    public  static void solve(char[][] board,int row,int col, ArrayList<ArrayList<char[][]>> res)
    {

        
    
      if(row==board.length&&col==board.length)
     {

     ArrayList<char[][]> al=new ArrayList<>();
       System.out.println(Arrays.deepToString(board));

     al.add(board);

     res.add(al);

        return ;
     }
    
    if(col==board.length)
    {
        col=0;
        row++;
    }


     if(row<0||row>=board.length||col<0||col >=board[0].length)
     {
      
       return ;

     }
     
     char c=board[row][col];

     if(c!='.')
     {
        solve(board,row,col+1,res);
     }
   else{
     for(int i=1;i<=9;i++)
        {
        char a=(char) (i+48);

        board[row][col]= a;

     if(isUp(a,board,row,col)&&isDown(a,board,row,col)&&isLeft(a,board,row,col)&&isRight(a,board,row,col)){
     
        solve(board,row,col+1,res);
     }
        }
   }

    
    }

   public  static boolean isUp(char a, char [][] board,int row,int col)
    {
        for(int i=row-1;i>=0;i--)
        {
            if(board[i][col]==a)
            {
                return false;
            }
        }
        return true;
    }

     public static boolean isDown(char a, char [][] board,int row,int col)
    {
        for(int i=row+1;i<board.length;i++)
        {
            if(board[i][col]==a)
            {
                return false;
            }
        }
        return true;
    }

     public static boolean isRight(char a, char [][] board,int row,int col)
    {
        for(int i=col+1;i<board.length;i++)
        {
            if(board[row][i]==a)
            {
                return false;
            }
        }
        return true;
    }

     public static boolean isLeft(char a, char [][] board,int row,int col)
    {
        for(int i=col-1;i>=0;i--)
        {
            if(board[row][i]==a)
            {
                return false;
            }
        }
        return true;
    }

}
