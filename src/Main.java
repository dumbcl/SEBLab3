public class Main {

    public static void main(String[] args) {
        double x = 1;
        double y = 1;
        Point point = new Point(x, y);
        point.setR(2);
        point.checkIsInCircle();
        String answer = point.toString();
        System.out.println(answer);
    }
}
