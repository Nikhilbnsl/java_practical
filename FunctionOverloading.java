//function overloading
class Function_Overloading{
    double area;
    /*public void area(int s){
        area=s*s;
    }*/
    public void area(double t){
        System.out.println("Method of Double called");
    }

    public void area(int i,int j){
        System.out.println("Method of integer with two parameter called");
    }
}



public class FunctionOverloading {
    public static void main(String [] args){
        Function_Overloading obj1=new Function_Overloading();
        obj1.area(2);// passing integer as parameter 


        
    }
    
}