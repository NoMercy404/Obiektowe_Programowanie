public class Segment {
    private Point p1,p2;
    private Point array[];
    public Segment(Point x,Point y){
        this.p1=x;
        this.p2=y;
        array = new Point[2];
        array[0] = x;
        array[1] = y;
    }
    public void SetP1(Point x){
        this.p1=x;
    }
    public void SetP2(Point y){
        this.p2=y;
    }
    public Point getX(){
        return p1;
    }
    public Point getY(){
        return p2;
    }
    public double getDistance(){
        return Math.hypot(p1.x-p2.x,p1.y-p2.y);
    }

}
//W3school SVG POLLYGON SPRAWDZIĆ
