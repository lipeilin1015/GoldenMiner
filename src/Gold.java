import java.awt.*;

public class Gold extends Object {
    boolean flag = false;

    Gold() {
        this.x = (int) (Math.random() * 700);
        this.y = (int) (Math.random() * 550 + 300);
        this.width = 52;
        this.height = 52;
        this.flag = false;
        this.m = 30;
        this.count=4;
        this.img = Toolkit.getDefaultToolkit().getImage("image/gold0.gif");
    }
}
class GoldMini extends Gold{
    GoldMini(){
        this.width=36;
        this.height=36;
        this.m=15;
        this.count=2;
        this.type=1;
        this.img= Toolkit.getDefaultToolkit().getImage("image/gold1.gif");
    }
}
class GoldMax extends Gold{
    GoldMax(){
        this.x=(int)(Math.random()*650);
        this.width=105;
        this.height=105;
        this.m=60;
        this.count=8;
        this.img= Toolkit.getDefaultToolkit().getImage("image/gold2.gif");
    }
}
