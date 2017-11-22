package iCalView;



import iCallogic.DaysInMonth;
import iCallogic.Month;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;

public class CalendarView {
	
	
	public void calendarView(GridPane grid) {
		
		DaysInMonth d = new DaysInMonth();
		Month fwm = new Month();
		int days = d.Days();
		int size = 7;
		
		d.firstDayOfMonth();
		
		Button[][] buttons = new Button[(days/7)][7];
		int k = 1;
		for(int y = 0; y<(days/7); y++) {
			if(d.bFirstWeekOfMonth()) {
				for(int x = 0; x< d.DaysInWeeksForMonth(); x++) {
					buttons[y][x] = new Button("" + k);
					grid.add(buttons[y][x], x, y);
					buttons[y][x].setPrefSize(60, 60);
					buttons[y][x].getStylesheets().add("CalendarDayButtonsStyle.css");
					k++;
					System.out.println("truth");
				}
			} else if(d.bLastWeekOfMonth()) {
				for(int x = 0; x< d.DaysInWeeksForMonth(); x++) {
					buttons[y][x] = new Button("" + k);
					grid.add(buttons[y][x], x, y);
					buttons[y][x].setPrefSize(60, 60);
					buttons[y][x].getStylesheets().add("CalendarDayButtonsStyle.css");
					k++;
					System.out.println("elleo");
				}
			}else {
				for(int x = 0; x<size; x++) {
					buttons[y][x] = new Button("" + k);
					grid.add(buttons[y][x], x, y);
					buttons[y][x].setPrefSize(60, 60);
					buttons[y][x].getStylesheets().add("CalendarDayButtonsStyle.css");
					k++;
				}
			}
			
			
			//System.out.println(d.firstDayOfMonth()+ "    here!");

			//	System.out.println(d.DaysInWeeksForMonth());	
		}

		//firstWeekOfMonth(int month, int week)	
	}
	
	private int calendarViewMonth() {

		return 1;
	}
}
