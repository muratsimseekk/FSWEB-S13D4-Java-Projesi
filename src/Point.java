public class Point {
   private int x, y ;



   public Point(int x , int y ) {
       this.x = x;
       this.y = y;
   }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }


    public void setY(int y) {
        this.y = y;
    }

    public double distance() {
       return Math.sqrt(x*x + y*y);
    }

    public double distance(Point p){
       int distanceX = Math.abs(this.x - p.getX());
       int distanceY = Math.abs(this.y - p.getY());

       return Math.sqrt(distanceX * distanceX + distanceY * distanceY);
    }


    public double distance (int a , int b) {
       int distanceX = Math.abs(this.x - a);
       int distanceY = Math.abs(this.y - b) ;
       return Math.sqrt(distanceX * distanceX + distanceY * distanceY);
    }

}
