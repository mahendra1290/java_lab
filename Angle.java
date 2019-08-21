public class Angle {
    public static void main(String[] args) {

    }

    public static int normalize(int angle){
        boolean isNegative = false;
        if (angle < 0){
            isNegative = true;
        }
        angle = Math.abs(angle);
        angle = angle % 360;
        if (isNegative){
            angle = 360 - angle;
        }
        return angle;
    }
}
