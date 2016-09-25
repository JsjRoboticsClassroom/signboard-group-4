package nyc.c4q.ac21.signboard;

/**
 * New Feature :
 * Hoop There It Is
 */
public class Images {
    public static void images(){
        SignBoard signboard = new SignBoard(8);
        imaging(signboard, "                                                                                                              \n" +
                           "██╗  ██╗ ██████╗  ██████╗ ██████╗     ████████╗██╗  ██╗███████╗██████╗ ███████╗    ██╗████████╗    ██╗███████╗\n" +
                           "██║  ██║██╔═══██╗██╔═══██╗██╔══██╗    ╚══██╔══╝██║  ██║██╔════╝██╔══██╗██╔════╝    ██║╚══██╔══╝    ██║██╔════╝\n" +
                           "███████║██║   ██║██║   ██║██████╔╝       ██║   ███████║█████╗  ██████╔╝█████╗      ██║   ██║       ██║███████╗\n" +
                           "██╔══██║██║   ██║██║   ██║██╔═══╝        ██║   ██╔══██║██╔══╝  ██╔══██╗██╔══╝      ██║   ██║       ██║╚════██║\n" +
                           "██║  ██║╚██████╔╝╚██████╔╝██║            ██║   ██║  ██║███████╗██║  ██║███████╗    ██║   ██║       ██║███████║\n" +
                           "╚═╝  ╚═╝ ╚═════╝  ╚═════╝ ╚═╝            ╚═╝   ╚═╝  ╚═╝╚══════╝╚═╝  ╚═╝╚══════╝    ╚═╝   ╚═╝       ╚═╝╚══════╝\n" + " ");
    }
    public static void imaging(SignBoard board, String text) {
        int width = board.getWidth();
        int y = board.getHeight()/2;
        for (int x = -text.length(); x <= text.length(); ++x) {

            SignBoard.Frame frame = board.newFrame();

            if (x >= width)
                break;
            if (x < 0){
                // Scrolling on to the left side.
                frame.write(0, y-4, text.substring(-x));
            }else if (x + text.length() <= width) {
                // Fully on the board.
                frame.write(x, y, text);
            }else
                // Scrolling off the board.
                frame.write(x, y, text.substring(0, width - x));
            frame.finish(0.01);
        }
    }

}
