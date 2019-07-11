import java.util.Scanner;
class TicToc
{
    
    void user_turn(char arr[][])
    {
        System.out.println("User:");
        Scanner sc=new Scanner(System.in);
        String user_move=sc.next();
        int row=0, cols=0;
        if(!user_move.equals("N"))
        {
            for(int i=0;i<user_move.length();i++)
            {
                if(user_move.charAt(i)=='R')
                    cols++;
                else if(user_move.charAt(i)=='D')
                    row++;
            }
        }
        arr[row][cols]='x';

        display_board(arr);
    }

    void computer_move(char arr[][])
    {
        int check=0;
        for(int i=0;i<=1;i++)
        {
           if(i==0 && arr[i][0]=='x')
           {
               if(arr[i+1][0]=='x')
               {
                   arr[i+2][0]='o';
                   display_board(arr);
                   break;
               }
               else if(arr[i+1][1]=='x')
               {
                   arr[i+2][2]='o';
                   display_board(arr);
                   break;
               }
               else if(arr[i][1]=='x')
               {
                   arr[i][2]='o';
                   display_board(arr);
                   break;
               }
           }

           else if(i==1)
           {
              for(int j=0;j<2;j++)
              { 
                if(arr[i][j]=='x')
                {
                    if(arr[i-1][j]=='x')
                    {
                        arr[i+1][j]='o';
                        display_board(arr);
                        break;
                    }
                    else if(arr[i+1][j]=='x')
                    {
                        arr[i-1][j]='o';
                        display_board(arr);
                        break;
                    }
                }
              }
           }
        }

    }

    void display_board(char arr[][])
    {
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[0].length;j++)
            {
                if(arr[i][j]==0)
                    System.out.print(" ");
                else
                    System.out.print(arr[i][j]);
                if(j<2)
                    System.out.print("|");
            }
            System.out.println();
        }
    }
    
    
    public static void main(String args[])
    {
        System.out.println("Lets Start! Click Any button to start");

        char arr[][]=new char[3][3];

        TicToc tt=new TicToc();

        tt.user_turn(arr);
        tt.user_turn(arr);
        System.out.println("Computer turn:");
        tt.computer_move(arr);
    }
}