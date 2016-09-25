package nyc.c4q.ac21.signboard;

import java.util.Random;

/**
 * Created by Hyun on 9/24/16.
 */
public class MakeSomeNoise {
    // Rusi's Signboard:
    public static void makeSomeNoise(SignBoard board, int cycles) {
        Random random = new Random();
        int width = board.getWidth();
        int leftPosition = width / 2 - 17;
        //int rightPosition = 3 * width / 4 - 7;
        int y = board.getHeight() / 2;

        for (int i = 0; i < cycles; i++) {
            SignBoard.Frame frame = board.newFrame();

            // Choose a color at random.
            // Write a word.
            if (i % 3 == 0) {
                for (int j = 0; j < 10; j++) {
                    int xposition = random.nextInt(3);

                    SignBoard.Frame frame1 = board.newFrame();
                    frame1.write(leftPosition - xposition, y - 2, "###     ###    ###    ##   ## #####  ");
                    frame1.write(leftPosition - xposition, y - 1, "## ## ## ##   ## ##   ## ##   ###    ");
                    frame1.write(leftPosition - xposition, y,     "##  ##   ##  ## # ##  ### ##  ##     ");
                    frame1.write(leftPosition - xposition, y + 1, "##       ## ##     ## ##   ## ###### ");
                    frame1.finish(0.1);
                }
                SignBoard.Frame frame1 = board.newFrame();
                frame1.finish(0.5);
            } else if (i % 3 == 1) {
                for (int j = 0; j < 10; j++) {
                    int xposition = random.nextInt(5);

                    SignBoard.Frame frame1 = board.newFrame();
                    frame.write(leftPosition - 3 - xposition, y - 3, " ######    #####    ###       ##  ######  ");
                    frame.write(leftPosition - 3 - xposition, y - 2, "##       ##     ##  ## ##  ## ##  ##      ");
                    frame.write(leftPosition - 3 - xposition, y - 1, " #####   ##     ##  ##   ##   ##  #####   ");
                    frame.write(leftPosition - 3 - xposition, y, "         ##   ##   ##   ##   ##   ##  ##    ");
                    frame.write(leftPosition - 3 - xposition, y + 1, "######     #####    ##        ##  ####### ");
                    frame1.finish(0.1);
                }
                SignBoard.Frame frame1 = board.newFrame();
                frame1.finish(0.5);
            } else {
                for (int j = 0; j < 15; j++) {
                    int xposition = random.nextInt(7);

                    SignBoard.Frame frame1 = board.newFrame();

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

                    frame.write(leftPosition - 15 - xposition, y - 4, "#####     ###      #######     #########    #########    #########  ");
                    frame.write(leftPosition - 15 - xposition, y - 3, "### ##    ###    ###     ###      ###      ###     ###   ###    ##  ");
                    frame.write(leftPosition - 15 - xposition, y - 2, "###  ##   ###   ###       ###     ###      ###           ###        ");
                    frame.write(leftPosition - 15 - xposition, y - 1, "###   ##  ###   ###       ###     ###       ########     ######     ");
                    frame.write(leftPosition - 15 - xposition, y,     "###    ## ###   ###       ###     ###              ###   ###        ");
                    frame.write(leftPosition - 15 - xposition, y + 1, "###     #####    ###     ###      ###      ###     ###   ###    ### ");
                    frame.write(leftPosition - 15 - xposition, y + 2, "###      ####      #######     #########    #########    ########## ");
                    frame1.finish(0.2);
                }
                SignBoard.Frame frame1 = board.newFrame();
                frame1.finish(0.5);
            }

            frame.finish(0.10);
        }
        SignBoard.Frame frame = board.newFrame();
        frame.finish(0.25);
    }


}
