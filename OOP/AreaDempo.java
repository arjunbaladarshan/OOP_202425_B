class Shapes{
    public void area(double radius){
        double ans = Math.PI * radius * radius;
        System.out.println("Area of a Circle = "+ans);
    }
    public void area(int length){
        double ans = length * length;
        System.out.println("Area of a Square = "+ans);
    }
    public void area(int length, int width){
        double ans = length * width;
        System.out.println("Area of a Rectangle = "+ans);
    }

    public void area(int height, double base){
        double ans =  height * base * 1/2;
        System.out.println("Area of triangle = "+ans);
    }



    public void max(int n1, int n2){
        if(n1>n2){
            System.out.println(n1);
        }
        else{
            System.out.println(n2);
        }
    }
    public void max(int n1, int n2, int n3){
        if(n1>n2){
            if(n1>n3){
                System.out.println(n1);
            }
            else{
                System.out.println(n3);
            }
        }
        else{
            if(n2>n3){
                System.out.println(n2);
            }
            else{
                System.out.println(n3);
            }
        }
    }
    
}
public class AreaDempo{
    public static void main(String[] args){
        Shapes s1 = new Shapes();
        s1.area(10);
        s1.area(11,12);
        s1.area(1.0);
        s1.area(10,10.0);

        s1.max(2,6);
        s1.max(6,2,9);
    }
}