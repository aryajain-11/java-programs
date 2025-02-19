interface ShapeC {
    public void draw();
}

class Main{
    public static void main(String[] args) {
        ShapeC s1 = new ShapeC() {
            public void draw(){
                System.out.println("Drawing a shape");
            }  
        };
        ShapeC s2 = new ShapeC() {
            public void draw(){
                System.out.println("Drawing a circle");
            }  
        };
        s1.draw();
        s2.draw();
    }
    
}

        
        
        

