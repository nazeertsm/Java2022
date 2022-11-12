package oct30.dnt;

public class Demo1 {

	public static void main(String[] args) {
	

		
		//To use Date in general operations like printing the date and time
		java.util.Date utilDate = new java.util.Date();
		System.out.println(utilDate);
		
		long l = utilDate.getTime();//It is giving the information of utilDate	in milliseconds from 1970
		System.out.println(l+"ms");
		//To use Date in DB operations like insert,update,delete query we use	sqlDate
		
		java.sql.Date sqlDate = new java.sql.Date(l);
		System.out.println(sqlDate);
		}
	
	}


/*
Fri Nov 11 20:44:05 IST 2022
1668179645225ms
2022-11-11
*/