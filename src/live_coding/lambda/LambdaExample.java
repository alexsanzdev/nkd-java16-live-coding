package live_coding.lambda;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class LambdaExample {

    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("Robin");
        names.add("Nicole");
        names.add("Oswald");

        Consumer consumer = new Consumer() {
            @Override
            public void accept(Object o) {
                System.out.println(o);
            }
        };


        Consumer<String> myLambda = name -> System.out.println(name.toUpperCase());
        names.forEach(myLambda);


        Button playButton = new Button();
        playButton.setActionListener( e -> System.out.println("PLAY! >")  );
        playButton.push();

    }
}
