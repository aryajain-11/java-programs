public class BoxA <T> {

     private T val;

    public void setValues(T val){
        this.val = val;
    }
    public T getValue(){
        return val;
    }
}
class IntegerBox extends BoxA <Integer>{

}
class StringBox extends BoxA <String> {

}
class Main{
    public static void main(String[] args) {
        IntegerBox obj1 = new IntegerBox ();
        StringBox obj2 = new StringBox ();
        obj1.setValues(5);
        obj2.setValues("Arya");

        System.out.println(obj1.getValue());
        System.out.println(obj2.getValue());

    }
}

