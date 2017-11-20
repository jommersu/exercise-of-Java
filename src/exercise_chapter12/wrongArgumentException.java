package exercise_chapter12;

public class wrongArgumentException {
    public static void main(String[] args) {
        try {
            Square s1 = new Square();
            System.out.println(s1.getLength());
            Square s2 = new Square(2);
            System.out.println(s2.getLength());
            Square s3 = new Square(-8);
            System.out.println(s3.getLength());
        }catch (IllegalArgumentException ex){
            StackTraceElement[] traceElements = ex.getStackTrace();
            for(int i = 0; i < traceElements.length; i++){
                System.out.println("method: " + traceElements[i].getMethodName());
                System.out.print("Class: " +traceElements[i].getClassName());
                System.out.println(" Line" + traceElements[i].getLineNumber());
            }
        }
    }
}

class Square{
    private double length;

    public Square(){
        this(1.0);
    }

    public Square(double newLength){
        setLength(newLength);
    }
    public void setLength(double newLength)
    throws IllegalArgumentException {
        if(newLength >= 0){
            length = newLength;
        }else {
            throw new IllegalArgumentException("Length cannot be negative");
        }
    }

    public double getLength(){
        return length;
    }

}
