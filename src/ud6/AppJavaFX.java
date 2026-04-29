/*package ud6;

import java.beans.EventHandler;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class AppJavaFX extends Application {
    static int contador = 0;
    Button button;

    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage stage) throws Exception {
        // contenido
        button = new Button("Púlsame");
        button.setOnAction(e -> respuestaBotton());
        Scene scene = new Scene(button);
        stage.setScene(scene);
        stage.show();
    }

    private void respuestaBotton() {
        contador++;
        System.out.println(contador);
        button.setText("Pulsado " + contador + " veces");
    }
}
*/