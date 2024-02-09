public class Robot {
    private int x;
    private int y;
   public void setX(int x){
       this.x = x;
          }
    public void setY(int y){
        this.y = y;
    }
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }

    public Robot(){
    }
    public Robot(int x, int y){
       if(x>0) {
           this.x = x;
       }else {
           System.out.println("Не может быть межньше 0");
       }
       if (y>0){
           this.y = y;
       }else {
           System.out.println("Не может быть межньше 0");
             }
    }

    public void move(int x, int y) {
      this.x =  print(this.x, x, "x");
       this.y = print(this.y, y, "y");
    }

    private int print(int start, int end, String axisName) {
        while (start < end) {
            System.out.println("Двигаемся по оси " + axisName + " от " + start + " до " + (++start));
        }
        return start;
    }

}
