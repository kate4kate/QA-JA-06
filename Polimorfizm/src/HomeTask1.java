import model.Button;
import model.Component;
import model.VisualComponent;

public class HomeTask1  {
    public static void main(String[] args) {
        VisualComponent[] vComponents = new VisualComponent[]{
                new Button(),
                new Lable(),
                new Component()
        };

         for (VisualComponent element : vComponents)
             element.draw();

        for (VisualComponent element : vComponents)
            element.draw3D();
    }
}
