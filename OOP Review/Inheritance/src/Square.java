public class Square extends Shape {
    public double side;

    public Square(double side,String name) {
        super(name);
        this.side=side;
    }

    @Override
    public double getArea() {
        return side*side;
    }
    @Override
    public double getPerimeter(){
        return side*4;
    }
    @Override
    public boolean equals(Object o) {
        if (o==null)
            return false;
        if(!(o instanceof Square))
            return false;
        Square p2 =(Square)o;
        if(p2.name.equals(this.name) && p2.side ==this.side)
        return true;
        else
        return false;
    }
        @Override
    public String toString(){
        return getName()+":"+side;
    }
}
/* TODO : Complete the Square class.
 Add variables if you need.
 Remember to use the @Override to override methods.
intelliJ will be helpful if you do).*/