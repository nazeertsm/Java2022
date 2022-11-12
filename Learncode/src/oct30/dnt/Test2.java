package oct30.dnt;

import java.time.*;

class Test2 {
	public static void main(String[] args) {
		LocalTime time = LocalTime.now();
		int h = time.getHour();
		int m = time.getMinute();
		int s = time.getSecond();
		int n = time.getNano();
		System.out.printf("\n%d:%d:%d:%d", h, m, s, n);
		

	}
}

/*
 * Note::
If we want to represent both Date and Time then we should go for LocalDateTime
object.
LocalDateTimedt = LocalDateTime.now();
System.out.println(dt);
O/p: 2015-11-23T12:57:24.531
We can represent a particular Date and Time by using LocalDateTime object as
follows.
Ex:
LocalDateTime dt1 = LocalDateTime.of(1995,Month.APRIL,28,12,45);
sop(dt1);
Ex:
LocalDateTime dt1=LocalDateTime.of(1995,04,28,12,45);
Sop(dt1);
Sop(“After six months:”+dt.plusMonths(6));
Sop(“Before six months:”+dt.minusMonths(6));*/
