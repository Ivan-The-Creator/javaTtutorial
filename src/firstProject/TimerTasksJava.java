package firstProject;

import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;

public class TimerTasksJava {

	public static void main(String[] args) {
		
		Calendar date = Calendar.getInstance();
		
		date.set(Calendar.YEAR, 2025);
		date.set(Calendar.MONTH, Calendar.MARCH);
		date.set(Calendar.DAY_OF_MONTH, 9);
		date.set(Calendar.HOUR_OF_DAY, 23);
		date.set(Calendar.MINUTE, 6);
		date.set(Calendar.SECOND, 50);
		date.set(Calendar.MILLISECOND, 0);
		
		Timer timer = new Timer();
		
		TimerTask task = new TimerTask() {
			
			int counter = 10;

			@Override
			public void run() {
				
				if (counter > 0) {
					System.out.println(counter+" sec");
					counter--;
				} else {
					System.out.println("Wazzzzzup!");
					timer.cancel();
				}

				//System.out.println("Done!");
				
			}
			
		};
		
		//timer.schedule(task, 3000);
		//timer.schedule(task, date.getTime());
		timer.scheduleAtFixedRate(task, date.getTime(), 1000);
		
		//System.out.println(date.get(Calendar.YEAR));
		//System.out.println(date.getTime());
		
		

	}

}
