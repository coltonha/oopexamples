
public class Rectangle {
    private int length,height;

    public Rectangle(){
        length=1;
        height=1;
    }
    public void setLength(int newLength){
        if(newLength>0){
            length=newLength;
        }
    }
    public void setHeight(int newHeight){
        if(newHeight>0){
            height=newHeight;
        }
    }
    
    public Rectangle(int newLength, int newHeight){
        setLength(newLength);
        setHeight(newHeight);
    }
}
