public class MyRectangle {

    private int heigth;
    private int length;

    public MyRectangle(int heigth, int length){
        this.heigth = heigth;
        this.length = length;

    }

    public int getHeigth() {
        return heigth;
    }

    public void setHeigth(int heigth) {
        this.heigth = heigth;
    }

    public int getLength() {
        return length;
    }
    public static int sum(MyRectangle...rectangles){
        int result = 0;
        for (MyRectangle rectangle:rectangles
             ) {
            result+=rectangle.calulateArea();
        }
        return result;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int calulateArea (){
        return this.heigth * this.length;
    }

    @Override
    public String toString() {
        return "(" + heigth + ", " + length + ")";
    }
}
