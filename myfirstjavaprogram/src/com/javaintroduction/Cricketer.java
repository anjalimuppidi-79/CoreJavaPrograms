package com.javaintroduction;

public class Cricketer {
	// Static variable declaration
	static int countryId = 91;
	static String countryName = "India";
	static String BCCI = "BCCI";

	// Instance variable declaration
	int jerseyNo;
	String cricketerName;
	int age;
	int highestScore;

	public static void main(String[] args) {
		System.out.println("--------Player1-----");
		System.out.println("Country ID:" + countryId);// 0
		System.out.println("Country Name:" + countryName);// null--Garbage Collector because we not done initialization
		// Object-Creation
		System.out.println("BCCI Contract Grade:" + BCCI);
		Cricketer msd1 = new Cricketer();// we create obj for instance variable
		msd1.jerseyNo = 63;
		msd1.cricketerName = "Suryakumar Yadav";
		msd1.age = 35;
		msd1.highestScore = 117;
		System.out.println("Jersey No:" + msd1.jerseyNo);
		System.out.println("Cricketer Name:" + msd1.cricketerName);
		System.out.println("Cricketer age:" + msd1.age);
		System.out.println("HighestScore:" + msd1.highestScore);

		Cricketer msd2 = new Cricketer();
		msd2.jerseyNo = 45;
		msd2.cricketerName = "Rohit Sharma";
		msd2.age = 35;
		msd2.highestScore = 264;

		System.out.println("--------Player2-----");
		System.out.println("Country ID:" + countryId);
		System.out.println("Country Name:" + countryName);
		System.out.println("BCCI Contract Grade:" + BCCI);
		System.out.println("Jersey No:" + msd2.jerseyNo);
		System.out.println("Cricketer Name:" + msd2.cricketerName);
		System.out.println("Cricketer age:" + msd2.age);
		System.out.println("HighestScore:" + msd2.highestScore);

		Cricketer msd3 = new Cricketer();
		msd3.jerseyNo = 7;
		msd3.cricketerName = "Ms Dhoni";
		msd3.age = 43;
		msd3.highestScore = 224;

		System.out.println("--------Player3-----");
		System.out.println("Country ID:" + countryId);
		System.out.println("Country Name:" + countryName);
		System.out.println("BCCI Contract Grade:" + BCCI);
		System.out.println("Jersey No:" + msd3.jerseyNo);
		System.out.println("Cricketer Name:" + msd3.cricketerName);
		System.out.println("Cricketer age:" + msd3.age);
		System.out.println("HighestScore:" + msd3.highestScore);

		Cricketer msd4 = new Cricketer();
		msd4.jerseyNo = 1;
		msd4.cricketerName = "KL Rahul";
		msd4.age = 32;
		msd4.highestScore = 199;

		System.out.println("--------Player4-----");
		System.out.println("Country ID:" + countryId);
		System.out.println("Country Name:" + countryName);
		System.out.println("BCCI Contract Grade:" + BCCI);
		System.out.println("Jersey No:" + msd4.jerseyNo);
		System.out.println("Cricketer Name:" + msd4.cricketerName);
		System.out.println("Cricketer age:" + msd4.age);
		System.out.println("HighestScore:" + msd4.highestScore);

		Cricketer msd5 = new Cricketer();
		msd5.jerseyNo = 17;
		msd5.cricketerName = "Rishabh Pant";
		msd5.age = 27;
		msd5.highestScore = 159;

		System.out.println("--------Player5-----");
		System.out.println("Country ID:" + countryId);
		System.out.println("Country Name:" + countryName);
		System.out.println("BCCI Contract Grade:" + BCCI);
		System.out.println("Jersey No:" + msd5.jerseyNo);
		System.out.println("Cricketer Name:" + msd5.cricketerName);
		System.out.println("Cricketer age:" + msd5.age);
		System.out.println("HighestScore:" + msd5.highestScore);

		Cricketer msd6 = new Cricketer();
		msd6.jerseyNo = 33;
		msd6.cricketerName = "Hardik pandey";
		msd6.age = 33;
		msd6.highestScore = 91;

		System.out.println("--------Player6-----");
		System.out.println("Country ID:" + countryId);
		System.out.println("Country Name:" + countryName);
		System.out.println("BCCI Contract Grade:" + BCCI);
		System.out.println("Jersey No:" + msd6.jerseyNo);
		System.out.println("Cricketer Name:" + msd6.cricketerName);
		System.out.println("Cricketer age:" + msd6.age);
		System.out.println("HighestScore:" + msd6.highestScore);

		Cricketer msd7 = new Cricketer();
		msd7.jerseyNo = 93;
		msd7.cricketerName = "jasprit Bumrah";
		msd7.age = 31;
		msd7.highestScore = 34;

		System.out.println("--------Player7-----");
		System.out.println("Country ID:" + countryId);
		System.out.println("Country Name:" + countryName);
		System.out.println("BCCI Contract Grade:" + BCCI);
		System.out.println("Jersey No:" + msd7.jerseyNo);
		System.out.println("Cricketer Name:" + msd7.cricketerName);
		System.out.println("Cricketer age:" + msd7.age);
		System.out.println("HighestScore:" + msd7.highestScore);

		// -------- Player8 --------
		Cricketer msd8 = new Cricketer();
		msd8.jerseyNo = 12;
		msd8.cricketerName = "Yuvraj Singh";
		msd8.age = 43;
		msd8.highestScore = 169;

		System.out.println("--------Player8-----");
		System.out.println("Country ID:" + countryId);
		System.out.println("Country Name:" + countryName);
		System.out.println("BCCI Contract Grade:" + BCCI);
		System.out.println("Jersey No:" + msd8.jerseyNo);
		System.out.println("Cricketer Name:" + msd8.cricketerName);
		System.out.println("Cricketer age:" + msd8.age);
		System.out.println("HighestScore:" + msd8.highestScore);

		// -------- Player9 --------
		Cricketer msd9 = new Cricketer();
		msd9.jerseyNo = 99;
		msd9.cricketerName = "Ravindra Jadeja";
		msd9.age = 36;
		msd9.highestScore = 175;

		System.out.println("--------Player9-----");
		System.out.println("Country ID:" + countryId);
		System.out.println("Country Name:" + countryName);
		System.out.println("BCCI Contract Grade:" + BCCI);
		System.out.println("Jersey No:" + msd9.jerseyNo);
		System.out.println("Cricketer Name:" + msd9.cricketerName);
		System.out.println("Cricketer age:" + msd9.age);
		System.out.println("HighestScore:" + msd9.highestScore);

		// -------- Player10 --------
		Cricketer msd10 = new Cricketer();
		msd10.jerseyNo = 25;
		msd10.cricketerName = "Shubman Gill";
		msd10.age = 25;
		msd10.highestScore = 208;

		System.out.println("--------Player10-----");
		System.out.println("Country ID:" + countryId);
		System.out.println("Country Name:" + countryName);
		System.out.println("BCCI Contract Grade:" + BCCI);
		System.out.println("Jersey No:" + msd10.jerseyNo);
		System.out.println("Cricketer Name:" + msd10.cricketerName);
		System.out.println("Cricketer age:" + msd10.age);
		System.out.println("HighestScore:" + msd10.highestScore);

		// -------- Player11 --------
		Cricketer msd11 = new Cricketer();
		msd11.jerseyNo = 18;
		msd11.cricketerName = "Virat Kohli";
		msd11.age = 36;
		msd11.highestScore = 254;

		System.out.println("--------Player11-----");
		System.out.println("Country ID:" + countryId);
		System.out.println("Country Name:" + countryName);
		System.out.println("BCCI Contract Grade:" + BCCI);
		System.out.println("Jersey No:" + msd11.jerseyNo);
		System.out.println("Cricketer Name:" + msd11.cricketerName);
		System.out.println("Cricketer age:" + msd11.age);
		System.out.println("HighestScore:" + msd11.highestScore);

	}
}