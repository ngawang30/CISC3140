import java.util.Calendar;
import java.util.concurrent.TimeUnit;

public class LabOne {

	public static void main(String[] args) {
		Calendar current = Calendar.getInstance();
		long currentLong = current.getTimeInMillis();
		currentLong = TimeUnit.DAYS.convert(currentLong, TimeUnit.MILLISECONDS) + 30;
		
		Calendar realCurrent = Calendar.getInstance();
		realCurrent.set(2022, 8,31);
		long realLong = realCurrent.getTimeInMillis();
		realLong = TimeUnit.DAYS.convert(realLong, TimeUnit.MILLISECONDS);
		
		Calendar firstLab = Calendar.getInstance();
		firstLab.set(2022, 9, 28);
		long firstLabLong = firstLab.getTimeInMillis();
		firstLabLong = TimeUnit.DAYS.convert(firstLabLong, TimeUnit.MILLISECONDS);
		
		Calendar secondLab = Calendar.getInstance();
		secondLab.set(2022, 10, 26);
		long secondLabLong = secondLab.getTimeInMillis();
		secondLabLong = TimeUnit.DAYS.convert(secondLabLong, TimeUnit.MILLISECONDS);
		
		Calendar thirdLab = Calendar.getInstance();
		thirdLab.set(2022, 11, 23);
		long thirdLabLong = thirdLab.getTimeInMillis();
		thirdLabLong = TimeUnit.DAYS.convert(thirdLabLong, TimeUnit.MILLISECONDS);
		
		Calendar fourthLab = Calendar.getInstance();
		fourthLab.set(2022, 12, 07);
		long fourthLabLong = fourthLab.getTimeInMillis();
		fourthLabLong = TimeUnit.DAYS.convert(fourthLabLong, TimeUnit.MILLISECONDS);
		
		System.out.println("Time until Lab 1 is due: " + (firstLabLong - currentLong));
		System.out.println("Time until Lab 2 is due: " + (secondLabLong - currentLong));	
		System.out.println("Time until Lab 3 is due: " + (thirdLabLong - currentLong));
		System.out.println("Time until Lab 4 is due: " + (fourthLabLong - currentLong));
	}
	
	
}
