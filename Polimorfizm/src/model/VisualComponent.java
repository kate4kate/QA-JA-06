package model;

public  interface VisualComponent {
    void draw();
    default  void draw3D(){
        System.out.println("DrawDefault3D");
    }
}
