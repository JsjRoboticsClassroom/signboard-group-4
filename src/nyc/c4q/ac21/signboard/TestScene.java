package nyc.c4q.ac21.signboard;

import java.util.Random;

/**
 * Created by Hyun on 9/24/16.
 */
public class TestScene {

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
}
