package p341_7_10;

import java.text.SimpleDateFormat;
import java.util.*;

class ImportTest {
	public static void main(String[] args) {
		Date today = new Date();

		SimpleDateFormat date = new SimpleDateFormat("yyyy/MM/dd");
		SimpleDateFormat time = new SimpleDateFormat("hh:mm:ss a");

		System.out.println("오늘 날짜는" + date.format(today));
		System.out.println("오늘 날짜는" + time.format(today));
	}

}
