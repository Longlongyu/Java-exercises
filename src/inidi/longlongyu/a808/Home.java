package inidi.longlongyu.a808;

import java.text.DateFormat;
import java.util.Date;

import inidi.longlongyu.a808.Car;
import inidi.longlongyu.a808.People;

public class Home {
	public static void main(String[] args) {
		Car lili = new Car("lili", 5);
		lili.eat();
		lili.getYearsOld();
		lili.sleep();
		lili.run();

		People wang = new People("wang", 20);
		wang.havePet();
		wang.setMyPet(lili);
		wang.havePet();
		wang.getYearsOld();
		wang.sleep();

		wang = null;
		lili = null;
		
		Date date = new Date();
		DateFormat shortDateFormat = DateFormat.getDateTimeInstance(DateFormat.SHORT, DateFormat.SHORT);
		DateFormat mediumDateFormat = DateFormat.getDateTimeInstance(DateFormat.MEDIUM, DateFormat.MEDIUM);
		DateFormat longDateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG);
		DateFormat fullDateFormat = DateFormat.getDateTimeInstance(DateFormat.FULL, DateFormat.FULL);
		System.out.println(shortDateFormat.format(date));
		System.out.println(mediumDateFormat.format(date));
		System.out.println(longDateFormat.format(date));
		System.out.println(fullDateFormat.format(date));
	}
}
