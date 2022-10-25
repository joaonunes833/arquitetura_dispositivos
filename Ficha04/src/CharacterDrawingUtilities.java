public class CharacterDrawingUtilities {
    public static void drawElement(char entry){
        System.out.print(entry);
    }
    public static void drawNewLine(){
        System.out.println("");
    }
    public static void drawHorizontalSegmentWith(char entry, int size){
        for (int i = 0; i < size;i++){
            drawElement(entry);
        }
    }
    public static void drawEmptyHorizontalSegmentWith(char entry, int size){
        for (int i = 0; i < size;i++){
            if (i == 0 || i == size - 1)
            drawElement(entry);
            else {
                System.out.print(" ");
            }
        }
    }

    public static void drawFilledRectangleWith(char entry, int width, int height){
        for(int i = 0; i < height; i++){
            drawHorizontalSegmentWith(entry,width);
            drawNewLine();
        }
    }

    public static void drawEmptyRectangleWith(char entry, int width, int height){ //porfazer
        for (int i = 0; i < height; i++){
            if (i == 0 || i == height - 1){
                drawHorizontalSegmentWith(entry, width);
            }
            else {
                drawEmptyHorizontalSegmentWith(entry, width);
            }
            drawNewLine();
        }
    }
}
