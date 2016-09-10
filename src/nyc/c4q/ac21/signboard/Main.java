package nyc.c4q.ac21.signboard;

import java.util.Random;

public class Main {
    /**
     * Draws a scene with a scrolling multicolor zig-zag ribbon.
     * @param board
     *   The board on which to draw.
     * @param numCycles
     *   The number of cycles to draw for.
     */
    /*
    public static void ribbonScene(SignBoard board, int numCycles) {
        int width = board.getWidth();
        int height = board.getHeight();
        for (int i = 0; i < numCycles; ++i) {
            SignBoard.Frame frame = board.newFrame();

            for (int x = -2; x < width; ++x) {
                int y = (2 * height - 2 + x + i) % (2 * height - 2);
                if (y >= height)
                    y = 2 * height - y - 2;
                if (0 < x) {
                    frame.setYellow();
                    frame.write(x, y, "x");
                }
                if (0 < x + 1 && x + 1 < width) {
                    frame.setGreen();
                    frame.write(x + 1, y, "x");
                }
                if (x + 2 < width) {
                    frame.setRed();
                    frame.write(x + 2, y, "x");
                }
            }

            frame.finish(0.02);
        }
    }
    */

    /**
     * Draws a scene with text scrolling across the screen..
     * @param board
     *   The board on which to draw.
     * @param text
     *   The text to scroll.
     */
    /*
    public static void scrollTextScene(SignBoard board, String text) {
        int width = board.getWidth();
        int y = board.getHeight() / 2;
        for (int x = -text.length(); x <= width; ++x) {
            SignBoard.Frame frame = board.newFrame();

            if (x >= width)
                break;

            if (x < 0)
                // Scrolling on to the left side.
                frame.write(0, y, text.substring(-x));
            else if (x + text.length() <= width)
                // Fully on the board.
                frame.write(x, y, text);
            else
                // Scrolling off the board.
                frame.write(x, y, text.substring(0, width - x));

            frame.finish(0.02);
        }
    }
    */

    /**
     * Draws a scene which flashes the words "FRESH" and "HOT".
     * @param board
     *   The board on which to draw.
     * @param cycles
     *   The number of cycles to draw for.
     */
    /*
    public static void flashFreshHotScene(SignBoard board, int cycles) {
        Random random = new Random();
        int width = board.getWidth();
        int leftPosition = width / 4 - 12;
        int rightPosition = 3 * width / 4 - 7;
        int y = board.getHeight() / 2;

        for (int i = 0; i < cycles * 2; ++i) {
            SignBoard.Frame frame = board.newFrame();

            // Choose a color at random.
            int color = random.nextInt(4);
            if (color == 0)
                frame.setGreen();
            else if (color == 1)
                frame.setRed();
            else if (color == 2)
                frame.setWhite();
            else
                frame.setYellow();
            // Write a word.
            if (i % 2 == 0) {
                frame.write(leftPosition, y - 2, "FFFF RRR  EEEE  SSS H  H");
                frame.write(leftPosition, y - 1, "F    R RR E    SS   H  H");
                frame.write(leftPosition, y    , "FFR  RRR  EEE   SS  HHHH");
                frame.write(leftPosition, y + 1, "F    R R  E      SS H  H");
                frame.write(leftPosition, y + 2, "F    R  R EEEE SSS  H  H");
            }
            else {
                frame.write(rightPosition, y - 2, "H  H  OO  TTTT");
                frame.write(rightPosition, y - 1, "H  H O  O  TT ");
                frame.write(rightPosition, y    , "HHHH O  O  TT ");
                frame.write(rightPosition, y + 1, "H  H O  O  TT ");
                frame.write(rightPosition, y + 2, "H  H  OO   TT ");
            }

            frame.finish(0.25);
        }

    }
    */

    public static void makeSomeNoise(SignBoard board, int cycles) {
        Random random = new Random();
        int width = board.getWidth();
        int leftPosition = width / 2 - 17;
        //int rightPosition = 3 * width / 4 - 7;
        int y = board.getHeight() / 2;

        for (int i = 0; i < cycles * 2; i++) {
            SignBoard.Frame frame = board.newFrame();

            // Choose a color at random.

            // Write a word.
            if (i % 3 == 0) {
                for (int j=0; j < 10; j++) {
                    int xposition = random.nextInt(3);

                    SignBoard.Frame frame1 = board.newFrame();
                    frame1.write(leftPosition - xposition, y - 2, "###     ###    ###    ##   ## #####  ");
                    frame1.write(leftPosition - xposition, y - 1, "## ## ## ##   ## ##   ## ##   ###    ");
                    frame1.write(leftPosition - xposition, y    , "##  ##   ##  ## # ##  ### ##  ##     ");
                    frame1.write(leftPosition - xposition, y + 1, "##       ## ##     ## ##   ## ###### ");
                    frame1.finish(0.1);
                }
                SignBoard.Frame frame1 = board.newFrame();
                frame1.finish(0.5);
            }
            else if (i % 3 == 1) {
                for (int j=0; j < 10; j++) {
                    int xposition = random.nextInt(5);

                    SignBoard.Frame frame1 = board.newFrame();
                    frame.write(leftPosition - 3 - xposition, y - 3, " ######    #####    ###       ##  ######  ");
                    frame.write(leftPosition - 3 - xposition, y - 2, "##       ##     ##  ## ##  ## ##  ##      ");
                    frame.write(leftPosition - 3 - xposition, y - 1, " #####   ##     ##  ##   ##   ##  #####   ");
                    frame.write(leftPosition - 3 - xposition, y,     "     ##  ##     ##  ##        ##  ##      ");
                    frame.write(leftPosition - 3 - xposition, y + 1, "######     #####    ##        ##  ####### ");
                    frame1.finish(0.1);
                }
                SignBoard.Frame frame1 = board.newFrame();
                frame1.finish(0.5);
            } else {
                for (int j=0; j < 15; j++) {
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
                    frame1.finish(0.1);
                }
                SignBoard.Frame frame1 = board.newFrame();
                frame1.finish(0.5);
            }

            frame.finish(0.10);
        }

    }

    public static void main(String[] args) {
        SignBoard signBoard = new SignBoard(8);

        // Run the sign board forever.
        while (true) {
            makeSomeNoise(signBoard, 8);
        }
    }
}
