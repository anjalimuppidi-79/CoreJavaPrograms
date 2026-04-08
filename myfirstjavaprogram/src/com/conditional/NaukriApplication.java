//23-03-2026
/*💼 Naukri Job Application Console Program (Question)
Create a Java program that works like a job application filter system.
🧾 Flow of the Program
Print:
Welcome to Naukri Job Portal
Ask user details:
Enter your name
Greet user: Hello <name>
Ask:
Years of Experience (double)
Expected Salary (double)
✅ Condition 1 (Eligibility Check)
If:
experience >= 2 AND expected salary <= 1000000
Then continue, otherwise:
"Sorry! You are not eligible for this job."
✅ Condition 2 (Education Check)
Ask:Highest Qualification (String)
If qualification is:
"BTech" OR "MCA"
Then continue, else:
"Only BTech/MCA candidates allowed"
✅ Condition 3 (Skill Check)
Ask:
Do you know Java? (true/false)
If true:
Ask: Do you know SQL? (true/false)
If both are true:
"Great! You are shortlisted for technical round"
Else:
"You need to improve your technical skills"
✅ Condition 4 (Location Preference)
Ask:
Are you willing to relocate? (true/false)
If true:
"You are eligible for final HR round"
Else:
"Relocation is mandatory for this job"
🎯 Your Task
👉 Write a Java program using:
Scanner
Nested if-else (like your previous code)*/

package com.conditional;

import java.util.Scanner;

public class NaukriApplication {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to Naukri Job Portal!!");
		System.out.println("Enter your name:");
		String name = sc.nextLine();
		System.out.println("Hello!!" + name);

		System.out.println("Enter your years of Experience:");
		double experience = sc.nextDouble();

		System.out.println("Enter your expected Salary:");
		double salary = sc.nextDouble();

		if (experience >= 2 && salary <= 1000000) {
			System.out.println("Yes!! you Can continue");
			sc.nextLine();

			System.out.println("Enter your Highest Qualification:");
			String qualification = sc.nextLine();

			if (qualification.equalsIgnoreCase("BTech") || qualification.equalsIgnoreCase("MCA")) {
				System.out.println("Do you know Java?(true/false)");
				boolean knowJava = sc.nextBoolean();

				if (knowJava) {
					System.out.println("Do you know SQL?");
					boolean knowSQL = sc.nextBoolean();

					if (knowSQL) {
						System.out.println("Great! You are shortlisted for technical round");
						System.out.println("Are you willing to relocate?");
						boolean relocate = sc.nextBoolean();

						if (relocate) {
							System.out.println("you are eligible for final HR round");
						} else {
							System.out.println("Relocation is mandatory for this job!!");
						}

					} else {
						System.out.println("You need to improve your technical skills");
					}
				} else {
					System.out.println("Java is required for this role");
				}
			} else {
				System.out.println("Only Btech/MCA candidates allowed!!!");
			}
		} else {
			System.out.println("Sorry! You are not eligible for this job!!");
		}

		sc.close();

	}

}
