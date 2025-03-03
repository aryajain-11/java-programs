public class BoxD <T>{
    private T val;

    public void setValue(T val){
        this.val = val;
    }

    public T getValue(){
        return val ; 
    }

    public static <T> void addItems(){

    } 
  
}
class IntegerBox extends BoxD <Integer>{

}
class StringBox extends BoxD <String >{

}
class Main{
    public static void main(String[] args) {
        IntegerBox obj1 = new IntegerBox();
        StringBox obj2 = new StringBox();

        obj1.setValue(13);
        obj2.setValue("Mahat");

        System.out.println(obj1.getValue());
        System.out.println(obj2.getValue());

        
    }
}

