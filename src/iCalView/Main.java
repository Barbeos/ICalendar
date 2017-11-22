package iCalView;
	
import iCallogic.DaysInMonth;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			CalendarView cw = new CalendarView();
			GridPane grid = new GridPane();
			
			cw.calendarView(grid);
			
			
			Scene scene = new Scene(grid);
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
		DaysInMonth d = new DaysInMonth();
		d.Days();
		
		CalendarView CW = new CalendarView();
		
		
	}
}
