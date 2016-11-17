package edu.emich.cosc211.lab5;

public class ClassroomUtils {

	public static int getScoreFromGrade(char grade) {
		int toReturn;

		switch (grade) {
		case 'O':
			toReturn = 95;
			break;
		case 'E':
			toReturn = 85;
			break;
		case 'A':
			toReturn = 75;
			break;
		case 'P':
			toReturn = 65;
			break;
		case 'D':
			toReturn = 55;
			break;
		case 'T':
		default:
			toReturn = 45;
			break;
		}

		return toReturn;
	}

	public static char getGradeFromScore(double score) {
		char toReturn;

		if (score > 90) {
			toReturn = 'O';
		} else if (score > 80) {
			toReturn = 'E';
		} else if (score > 70) {
			toReturn = 'A';
		} else if (score > 60) {
			toReturn = 'P';
		} else if (score > 50) {
			toReturn = 'D';
		} else {
			toReturn = 'T';
		}

		return toReturn;
	}
}
