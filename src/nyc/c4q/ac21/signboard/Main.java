package nyc.c4q.ac21.signboard;

import java.util.Random;

public class Main {

        public static void flashFreshHotScene(SignBoard board, int cycles) {
            Random random = new Random();
            int width = board.getWidth();
            int leftPosition = width / 4 - 12;
            int rightPosition = 3 * width / 4 - 7;
            int centerPosition = 2 * width / 4 - 9;
            int y = board.getHeight() / 2;

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

                // write a word.
                if (i  == 0 || i == 2) {
                    frame.write(leftPosition - 5 + rand, y - 3, "WW        WW   EEEEEEE");
                    frame.write(leftPosition - 5 + rand, y - 2, "WW        WW   EE");
                    frame.write(leftPosition - 5 + rand, y - 1, "WW   WW   WW   EEEEE");
                    frame.write(leftPosition - 5 + rand, y,     "WW WW  WW WW   EE");
                    frame.write(leftPosition - 5 + rand, y + 1, "WWWW    WWWW   EE");
                    frame.write(leftPosition - 5 + rand, y + 2, "WW        WW   EEEEEEE");


                } else if (i == 4 || i == 5 || i == 6 || i == 7) {

                    frame.write(leftPosition - 5 + rand, y - 4, "RRRRRRRR      OOOOO       CCCCCC    KKK   KKK        -------------------------------     !!!  !!!");
                    frame.write(leftPosition - 5 + rand, y - 3, "RRR   RRR    OOOOOOO    CCCCCCCCC   KKK  KKK         YYY   YYY    OOOOO    UUU   UUU     !!!  !!!");
                    frame.write(leftPosition - 5 + rand, y - 2, "RR   RRR    OOO   OOO  CCCC         KKK KKK           YYY YYY    OOOOOOO   UUU   UUU     !!!  !!!");
                    frame.write(leftPosition - 5 + rand, y - 1, "RRRRRR      OOO   OOO  CCC          KKKKKK             YYYYY    OOO   OOO  UUU   UUU     !!!  !!!");
                    frame.write(leftPosition - 5 + rand, y,     "RR  RRR     OOO   OOO  CCCC         KKK KKK             YYY     OOO   OOO  UUU   UUU     !!!  !!!");
                    frame.write(leftPosition - 5 + rand, y + 1, "RRR   RRR    OOOOOOO    CCCCCCCCC   KKK  KKK            YYY     OOO   OOO  UUU   UUU     !!!  !!!");
                    frame.write(leftPosition - 5 + rand, y + 2, "RRR    RRR    OOOOO       CCCCCC    KKK   KKK           YYY      OOOOOOO    UUUUUUU              ");
                    frame.write(leftPosition - 5 + rand, y + 3, "_____________________________________________           YYY       OOOOO      UUUUU       !!!  !!!");

                } else if (i == 1 || i == 3){

                    frame.write(rightPosition - 5 + rand, y - 2, "WW        WW  IIIIIIII  LL        LL");
                    frame.write(rightPosition - 5 + rand, y - 1, "WW        WW     II     LL        LL");
                    frame.write(rightPosition - 5 + rand, y,     "WW   WW   WW     II     LL        LL");
                    frame.write(rightPosition - 5 + rand, y + 1, "WW WW  WW WW     II     LL        LL");
                    frame.write(rightPosition - 5 + rand, y + 2, "WWWW    WWWW     II     LL        LL");
                    frame.write(rightPosition - 5 + rand, y + 3, "WW        WW  IIIIIIII  LLLLLLLL  LLLLLLLL");

                }

                frame.finish(.50);
            }
            SignBoard.Frame frame = board.newFrame();
            frame.finish(0.5);
        }


    // Hyunkim Signboard:
    public static void ribbonScene(SignBoard board, int numCycles) {

        int width = board.getWidth();
        int height = board.getHeight();
        double middlePosition = (width / 2.25 - 12);
        double oppositeSide = (width / 1.5 - 18);
        int z = board.getHeight() / 2;
        double movingBall = (width / 1.75 - 12);


        for (int i = 0; i < numCycles; ++i) {

            SignBoard.Frame frame = board.newFrame();

            for (int x = -2; x < width; ++x) {
                int y = (2 * height - 2 + x + i) % (2 * height - 2);

                if (y >= height)
                    y = 2 * height - y - 2;

                if (0 < x) {
                    frame.setBlue();                             // blue
                    frame.write((int) middlePosition, z-4, "   _ _ _ _LETS GO TEAM!!!_ _ _ _ ");
                    frame.write((int) middlePosition, z-3, "  |              |              |");
                    frame.write((int) middlePosition, z-2, "  |__            |            __|");
                    frame.write((int) middlePosition, z-1, " .|  | |.       .|.       .| |  |.");
                    frame.write((int) middlePosition, z  , " ||  | | )     ( | )     ( | |  ||");
                    frame.write((int) middlePosition, z+1, " .|__| |.       .|.       .| |__|.");
                    frame.write((int) middlePosition, z+2, "  |                             |");
                    frame.write((int) middlePosition, z+3, "  |_ _ _ _ _ _ _ | _ _ _ _ _ _ _|");
                }
                if (0 < z + 1 && z + 1 < width) {
                    frame.setGreen();                           // green human
                    frame.write((int) middlePosition, y,   "  O{-<                       >-}O");
                    //frame.write((int) oppositeSide, z,">-}O");
                }

                if (0 < z + 1 && z + 1 < width) {
                    frame.setRed();
                    frame.write((int) movingBall, y, "@");
                }

                if (x + 2 < width) {
                    frame.setMagenta();                         // magenta background
                    frame.write(x + 2, y , "~");
                }
            }

            frame.finish(.25);
        }
        SignBoard.Frame frame = board.newFrame();
        frame.finish(0.25);
    }

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
                    frame1.write(leftPosition - xposition, y, "##  ##   ##  ## # ##  ### ##  ##     ");
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
                    frame.write(leftPosition - 3 - xposition, y, "     ##  ##     ##  ##        ##  ##      ");
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
                    frame.write(leftPosition - 15 - xposition, y, "###    ## ###   ###       ###     ###              ###   ###        ");
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

    public static void testScene(SignBoard board, String textA, String textB, String textC) {
        String newLine = "\n";
        String aline1 = " _____ ____ ___ _____ ___ ";
        String aLine2 = "|_   _| ___| _ |  |  | _ |";
        String aLine3 = "  | | | ___|   |     |   |";
        String aLine4 = "  |_| |____|_|_|_|_|_|_|_|";
        String bLine1 = " _____ ____ ___ _____ ___ ";
        String bLine2 = "|_   _| ___| _ |  |  |  _ \\";
        String bLine3 = "  | | | ___|   |     |  _ <";
        String bLine4 = "  |_| |____|_|_|_|_|_|____/";
        String[] teamA = new String[]{aline1, aLine2, aLine3, aLine4};
        String[] teamB = new String[]{bLine1, bLine2, bLine3, bLine4};
        int width = board.getWidth();
        int y = board.getHeight() / 2;
        int accelTime = 0;
        double time = 0;
        for (int x = -textA.length(); x <= width / 2 - textA.length(); ++x) {
            SignBoard.Frame frame = board.newFrame();

            int j = 0;
            for (int i = teamA.length - 1; i >= 0; i--) {
                String aThisLine = teamA[j];
                String bThisLine = teamB[j];
                j++;
                if (x < 0) {
                    // Scrolling on to the left side.
                    frame.setWhite();
                    frame.write(0, y - i, aThisLine.substring(-x));

                    frame.write(width / 2, y - i, bThisLine);
                } else {
                    frame.write(x, y - i, aThisLine);
                    frame.write(width / 2, y - i, bThisLine);
                }
            }
            accelTime += .5;
            time = -.01 * accelTime + .02;
            frame.finish(time);

        }
        for (int x = (width / 2) + 1; x <= width - textB.length(); ++x) {
            SignBoard.Frame frame = board.newFrame();
            int j = 0;
            for (int i = teamA.length - 1; i >= 0; i--) {
                String aThisLine = teamA[j];
                String bThisLine = teamB[j];
                j++;
                if (x + textB.length() >= width) {
                    break;
                }
                frame.setYellow();
                frame.write(x, y - i, bThisLine);
                frame.setGreen();
                frame.write(width / 2 - textA.length(), y - i, aThisLine);
            }
            if (x + textB.length() >= width) {
                break;
            }
            frame.finish(.025);
        }
        accelTime = 0;
        time = 0;
        for (int x = width - textB.length(); x >= width / 2; --x) {
            SignBoard.Frame frame = board.newFrame();
            int j = 0;
            for (int i = teamA.length - 1; i >= 0; i--) {
                String aThisLine = teamA[j];
                String bThisLine = teamB[j];
                j++;
                if (x <= width / 2) {
                    break;
                }
                frame.setRed();
                frame.write(x, y - i, bThisLine);
                frame.setGreen();
                frame.write(width / 2 - textA.length(), y - i, aThisLine);
            }
            if (x <= width / 2) {
                break;
            }
            frame.finish(.05);
        }
        for (int x = 0; x <= textC.length() + 4; x++) {
            SignBoard.Frame frame = board.newFrame();
            int j = 0;
            for (int i = teamA.length - 1; i >= 0; i--) {
                String aThisLine = teamA[j];
                String bThisLine = teamB[j];
                j++;
                changeColor(frame);
                frame.write(width / 2 - x - textA.length(), y - i, aThisLine);
                changeColor(frame);
                frame.write(width / 2 + x + 1, y - i, bThisLine);
            }
            frame.finish(.064);
        }
        for (int x = 0; x <= y - 1; x++) {
            SignBoard.Frame frame = board.newFrame();
            int j = 0;
            for (int i = teamA.length - 1; i >= 0; i--) {
                String aThisLine = teamA[j];
                String bThisLine = teamB[j];
                j++;
                changeColor(frame);
                frame.write((width / 2) - (textC.length() / 2), x, textC);
                changeColor(frame);
                frame.write(width / 2 - textC.length() - 4 - textA.length(), y - i, aThisLine);
                changeColor(frame);
                frame.write(width / 2 + textC.length() + 4 + 1, y - i, bThisLine);
            }
            frame.finish(.5);
        }
        SignBoard.Frame frame = board.newFrame();
        frame.finish(.5);
    }

    public static void changeColor(SignBoard.Frame board) {
        Random rand = new Random();
        int randomNum = rand.nextInt(7);
        switch (randomNum) {
            case 0:
                board.setGreen();
                break;
            case 1:
                board.setRed();
                break;
            case 2:
                board.setWhite();
                break;
            case 3:
                board.setYellow();
                break;
            case 4:
                board.setCyan();
                break;
            case 5:
                board.setBlue();
                break;
            case 6:
                board.setMagenta();
                break;
        }
    }

    public static void main(String[] args) {
        SignBoard signBoard = new SignBoard(8);

        // Run the sign board forever.
        while (true) {

            flashFreshHotScene(signBoard, 8);

            ribbonScene(signBoard, 14);

            makeSomeNoise(signBoard, 3);

            String aLine2 = "|_   _| ___| _ |  |  | _ |";
            String bLine2 = "|_   _| ___| _ |  |  |  _ \\";
            testScene(signBoard, aLine2, bLine2, "VS");

        }
    }
}
