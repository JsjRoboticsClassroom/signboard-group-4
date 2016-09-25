package nyc.c4q.ac21.signboard;

import static java.awt.SystemColor.text;

/**
 * Created by Hyun on 9/25/16.
 package nyc.c4q.ac21.signboard;

 /**
 * New Feature :
 * Hoop There It Is
 */
public class Basket {

    public static void ball(){
        SignBoard signboard = new SignBoard(8);
        otherside(signboard, "                                                       " +
                "                       ..ee$$$$$ee..                                \n" +
                "                   .e$*\"\"    $    \"\"*$e.        \"\"\"\"         \n" +
                "                 z$\"*.       $         $$c                         \n" +
                "               z$\"   *.      $       .P  ^$c                      \n" +
                "              d\"      *      $      z\"     \"b                   \n" +
                "             $\"        b     $     4%       ^$                    \n" +
                "            d%         *     $     P         '$                    \n" +
                "           .$          'F    $    J\"          $r                  \n" +
                "           4L           b    $    $           J$                   \n" +
                "           $F$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$                   \n" +
                "           4F          4F    $    4r          4P                   \n" +
                "           ^$          $     $     b          $%                   \n" +
                "            3L        .F     $     'r        JP                    \n" +
                "             *c       $      $      3.      z$                     \n" +
                "              *b     J\"      $       3r    dP                     \n" +
                "               ^$c  z%       $        \"c z$\"                     \n" +
                "                 \"*$L        $        .d$\"                       \n" +
                "                    \"*$ee..  $  ..ze$P\"                      " + " ");

    }

    private static void otherside(SignBoard signboard, String text) {

        int width = signboard.getWidth();
        int y = signboard.getHeight()/2;

        for (int x = -text.length(); x <=text.length(); ++x) {

            SignBoard.Frame frame = signboard.newFrame();

            if (x >= width)
                break;
            if (x < 0 && y > -2){
                // Scrolling on to the left side.
                frame.write(0, y-4, text.substring(-x));
            }
            frame.finish(0.01);
        }
    }
}

