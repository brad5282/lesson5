
package student;


public class Student {

    private String name;
    private int test1;
    private int test2;
    private int test3;
    
    public Student(){
        name = "";
        test1 = 0;
        test2 = 0;
        test3 = 0;
    }
    
    
    public Student(String name, int test1, int tst2, int test3){
        this.name = name;
        this.test1 = test1;
        this.test2 = test2;
        this.test3 = test3;
    }
    
    public Student(Student other){
        this.name = other.name;
        test1 = other.test1;
        test2 = other.test2;
        test3 = other.test3;
    
    }
    
    
    
    public void setName(String n){
        name = n;
    }
    public void setScore(int i, int score){
    if(i==1) test1 =score;
    else if(i==2) test2 = score;
    else test3=score; 
    }
    
    
    public String getName(){
       return name;
    }
    
    public int getScore(int i){
        if(i==1) return test1;
        else if(i==2) return test2;
        else return test3;
    }
    
    
    public double getAverage(){
       double avrg; 
        avrg =(test1 + test2 + test3)/3.0;
        return avrg;
    }
    
    public int getHighScore(){
        int high = Math.max(test2, test1);
        high = Math.max(high, test3);
        return high;
    }
    
    
    public String toString(){
        String str;
        str = "\nName: \t" + name;
        str += "\nTest1: \t" + test1;
        str += "\nTest2: \t" + test2;
        str += "\nTest3: \t" + test3;
        str +="\n------------------------";
        str += "\nAverage: " + getAverage();
        
        return str;
        
        
    } 

    public String validateData() {
        String errormsg = null;
        if(name.equals(""))
            errormsg="Name is required.";
        if(test1<0 || test1>100 || test2<0 || test2> 100 || test3<0 || test3>100)
            if(errormsg==null)
                errormsg = "At least 1 mark is out of the acceptable range";
        else
                errormsg += "\nAt least 1 mark is out of the acceptable range";
        if(errormsg != null)
            errormsg += "\nPlease re-enter all the data\n";
        return errormsg;
        
    }
}

