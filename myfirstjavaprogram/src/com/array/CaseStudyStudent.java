package com.array;

public class CaseStudyStudent {

	public static void main(String[] args) {
		int[][] marks = { { 45, 46, 47 }, { 41, 45, 49 }, { 45, 43, 47 } };

		int maxMarks = 0;
		int topper = 0;
		// total marks of each student
		for (int i = 0; i < marks.length; i++) {
			int total = 0;
			for (int j = 0; j < marks[i].length; j++) {
				total = total + marks[i][j];

				// topper student;
				if (total > maxMarks) {
					maxMarks = total;
					topper = i;
				}

			}
			System.out.println("Student " + (i + 1) + " total marks:" + total);

		}
		System.out.println("Topper is Student " + (topper + 1) + ": " + maxMarks);
		// subject-wise Average
		for (int j = 0; j < marks[0].length; j++) {
			int sum = 0;
			for (int i = 0; i < marks.length; i++) {
				sum += marks[i][j];
			}
			double avg = (double) sum / marks.length;
			System.out.println("Average of subjects" + (j + 1) + ":" + avg);
		}

	}

}
