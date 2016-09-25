package nyc.c4q.ac21.signboard;

import java.util.Random;

/**
 * Created by Hyun on 9/24/16.
 */
public class RockYou {
// Josiel's sign
    public static void rockYou(SignBoard board, int cycles) {
        Random random = new Random();

        for (int i = 0; i < cycles; ++i) {
            SignBoard.Frame frame = board.newFrame();

            // Choose a color at random.
            int color = random.nextInt(7);
            if (color == 0)
                frame.setGreen();
            else if (color == 1)
                frame.setRed();
            else if (color == 2)
                frame.setWhite();
            else if (color == 3)
                frame.setYellow();
            else if (color == 4)
                frame.setBlue();
            else if (color == 5)
                frame.setMagenta();
            else if (color == 6)
                frame.setCyan();

            int rand = random.nextInt(10);
            int width = board.getWidth();
            int leftPosition = width / 4 - 12;
            int rightPosition = 2 * width / 4 - 7;
            int centerPosition = 2 * width / 4 - 9 + rand;
            int y = board.getHeight() / 2;
            // write a word.
            if (i  == 0 || i == 2) {
                frame.write(leftPosition - 5 + rand, y - 3, "WW        WW   EEEEEEE");
                frame.write(leftPosition - 5 + rand, y - 2, "WW        WW   EE");
                frame.write(leftPosition - 5 + rand, y - 1, "WW   WW   WW   EEEEE");
                frame.write(leftPosition - 5 + rand, y,     "WW WW  WW WW   EE");
                frame.write(leftPosition - 5 + rand, y + 1, "WWWW    WWWW   EE");
                frame.write(leftPosition - 5 + rand, y + 2, "WW        WW   EEEEEEE");


            } else if (i == 4 || i == 5 || i == 6 || i == 7) {

                frame.write(centerPosition - 65 , y - 4, "RRRRRRRR     OOOOO       CCCCCC   KKK   KKK    -------------------------------   !!!  !!!" );
                frame.write(centerPosition - 65 , y - 3, "RRR   RRR   OOOOOOO    CCCCCCCCC  KKK  KKK     YYY   YYY    OOOOO    UUU   UUU   !!!  !!!" );
                frame.write(centerPosition - 65 , y - 2, "RR   RRR   OOO   OOO  CCCC        KKK KKK       YYY YYY    OOOOOOO   UUU   UUU   !!!  !!!" );
                frame.write(centerPosition - 65 , y - 1, "RRRRRR     OOO   OOO  CCC         KKKKKK         YYYYY    OOO   OOO  UUU   UUU   !!!  !!!" );
                frame.write(centerPosition - 65 , y,     "RR  RRR    OOO   OOO  CCCC        KKK KKK         YYY     OOO   OOO  UUU   UUU   !!!  !!!" );
                frame.write(centerPosition - 65 , y + 1, "RRR   RRR   OOOOOOO    CCCCCCCCC  KKK  KKK        YYY     OOO   OOO  UUU   UUU   !!!  !!!" );
                frame.write(centerPosition - 65 , y + 2, "RRR    RRR   OOOOO       CCCCCC   KKK   KKK       YYY      OOOOOOO    UUUUUUU            " );
                frame.write(centerPosition - 65 , y + 3, "____________________________________________      YYY       OOOOO      UUUUU     !!!  !!!" );

            } else if (i == 1 || i == 3){

                frame.write(rightPosition - 1 + rand, y - 3, "WW        WW  IIIIIIII  LLL       LLL");
                frame.write(rightPosition - 1 + rand, y - 2, "WW        WW     II     LLL       LLL");
                frame.write(rightPosition - 1 + rand, y - 1, "WW   WW   WW     II     LLL       LLL");
                frame.write(rightPosition - 1 + rand, y    , "WW WW  WW WW     II     LLL       LLL");
                frame.write(rightPosition - 1 + rand, y + 1, "WWWW    WWWW     II     LLLLLLLL  LLLLLLLL");
                frame.write(rightPosition - 1 + rand, y + 2, "WW        WW  IIIIIIII  LLLLLLLL  LLLLLLLL");

            }

            frame.finish(.50);
        }
        SignBoard.Frame frame = board.newFrame();
        frame.finish(0.5);
    }


}
