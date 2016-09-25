package nyc.c4q.ac21.signboard;

 /**
 * New Feature :
  * Shooting in
 */
public class Shoot {

    public static void ball(){
        SignBoard signboard = new SignBoard(8);
        otherside(signboard, "                                                       " +
               "***********************************************************************" +
  "***************************************  ************************** " +
   "" ************************************    *********************** " +
    ""  *************************** ******* *********************** " +
     ""   ***********************    **** ********************** " +
      ""    **********************   **  *********************" +
       ""     *******************      ********************* " +
        ""      ****************      ******************** " +
         ""       *************  *    ****************** " +
          ""        *********** *     **************** " +
           ""         ********* *      ************* " +
            ""          ****** *   ***   ********* " +
             ""           ****  ********  ****** " +
              ""            *  ************  * " +
               ""             *************** " +
                ""              *********** " +
                 ""              ******** " +
                  ""               **** " +
                   ""               ** " ;



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

