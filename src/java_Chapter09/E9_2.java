package java_Chapter09;

import java.util.StringJoiner;

public class E9_2 {
    public static void main(String[] args) {
        Point3D p1 = new Point3D(1,2,3);
        Point3D p2 = new Point3D(1,2,3);
        
        System.out.println(p1);
        System.out.println(p2);
        System.out.println("p1==p2? " + (p1==p2));
        System.out.println("p1.equasl(p2) ? " + (p1.equals(p2)));
    }
}

class Point3D{
    int x, y, z;
    
    Point3D(int x, int y, int z){
        this.x = x;
        this.y = y;
        this.z = z;
    }
    
    Point3D(){
        this(0,0,0);
    }
    
    @Override
    public boolean equals(Object obj) {
       if (obj instanceof Point3D) {
           Point3D newPoint3D = (Point3D) obj;
           
           if(this.x == newPoint3D.x && 
                   this.y == newPoint3D.y &&
                   this.z == newPoint3D.z) {
               
               return true;
           } else { return false;}
           
       }
       return false;
    }
    
    @Override
    public String toString() {
        StringJoiner str = new StringJoiner(",","[","]");
        String[] arr = {String.valueOf(x),String.valueOf(y),String.valueOf(z)};
        String result ="";
        
        for(String s : arr) {
           result = String.valueOf(str.add(s));
        }
        return result;
        
       
    }
}
