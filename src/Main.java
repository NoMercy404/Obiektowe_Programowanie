import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Point pointt=new Point(3,2);
        Segment s1 = new Segment(pointt,pointt);

        //COŚ DO SVG return String.format(Locale.ENGLISH,"<line x1=\"%f\" y1=\"%f\",p1.x,p1.y);

        System.out.println(s1.getDistance());

    }
}