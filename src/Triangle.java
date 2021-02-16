public class Triangle {
    private int base, height;

    public Triangle(){
        base=1;
        height=1;
    }

    public void setBase(int newBase){
        if(newBase>0){
            base=newBase;
        }
    }

    public void setHeight(int newHeight){
        if(newHeight>0){
            height=newHeight;
        }
    }
    public Triangle(int newBase, int newHeight){
        setBase(newBase);
        setHeight(newHeight);
    }
}
