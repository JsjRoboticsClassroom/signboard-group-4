package nyc.c4q.ac21.signboard;

/**
 * Hyunkim Signboard:
 */
public class GameBoard {
    public static void gameBoard(SignBoard board, int numCycles) {

        int width = board.getWidth();
        int height = board.getHeight();

        double middlePosition = (width / 2.25 - 12);
        double oppositeSide = (width / 1.5 - 18);
        double movingBall = (width / 1.75 - 12);
        int z = board.getHeight() / 2;

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
                    frame.write((int) middlePosition, z+2, "  |              |              |");
                    frame.write((int) middlePosition, z+3, "  |_ _ _ _ _ _ _ | _ _ _ _ _ _ _|");
                }
                if (0 < z + 1 && z + 1 < width) {
                    frame.setGreen();                           // green human
                    frame.write((int) middlePosition, y,   "  O{-<");
                    frame.write((int) oppositeSide, y,">-}O");
                }
                if (0 < z + 1 && z + 1 < width) {               // red ball
                    frame.setRed();
                    frame.write((int) movingBall, 3, "@");
                }
                if (x + 2 < width) {
                    frame.setMagenta();                         // go go background
                    frame.write(x+2, y , "GO ! ");
//                    frame.write(x + 8, 3, "@");
                }
            }
            frame.finish(0.25);
        }
        SignBoard.Frame frame = board.newFrame();
        frame.finish(0.25);
    }
}
