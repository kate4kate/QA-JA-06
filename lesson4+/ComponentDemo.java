import model.Button;
import model.Component;

public class ComponentDemo {
    public static void main(String[] args) {
        String str = "Hello";

      // model.Button btn = new model.Button(); // создали класс model.Button, наследник компонента и обжекта
        Component btn = new Button(); // а это уже полиморфизм
       btn.draw();
       //*************************
        System.out.println("***components***");
      /* model.Component [] components =  new model.Component[]{
                new model.Component(),
                new model.Component(), new model.Button(),
                new model.Component()
        };

        for (int i = 0; i<components.length;i++){
components[i].draw();
        }
        */
        //Приведение к типу
        Object [] components =  new Object[]{
                new Lable(),
               // new model.Component(),
                new Button(),
                "Hello",
                12
             };
         for (int i = 0; i<components.length;i++) {

             if (components[i] instanceof Component) {  //делаем проверку на то ЯВЛЯЕТСЯ ЛИ каждый элемент массива КОМПОНЕНТОМ. (с пом. слова instanceof)
                 // Всё, что не явл-ся компонентом, будет игнорироваться
                 Component element = (Component) components[i];
                 element.draw();
             }
         }

    }
}
