package nyc.c4q.ac21.signboard;


public class Main {
    public static void main(String[] args) {
        SignBoard signBoard = new SignBoard(8);

        while(true){
            RockYou.rockYou(signBoard, 8);
            Images.images();
            GameBoard.gameBoard(signBoard, 14);
            MakeSomeNoise.makeSomeNoise(signBoard, 3);

            String aLine2 = "|_   _| ___| _ |  |  | _ |";
            String bLine2 = "|_   _| ___| _ |  |  |  _ \\";
            TestScene.testScene(signBoard, aLine2, bLine2, "VS");
        }
    }
}
