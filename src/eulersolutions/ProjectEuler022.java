package eulersolutions;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class ProjectEuler022 {

	public static void main(String[] args) throws IOException {
		String filePath = "C:\\Users\\Danny\\Desktop\\names.txt";

		String[] names = readNames(filePath);

		Arrays.sort(names);

		int total = 0;
		for (int i = 0; i < names.length; i++) {
			total += wordScore(names[i], i + 1);
		}

		System.out.println(total);

	}

	private static int wordScore(String s, int i) {
		int score = 0;
		String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		for (int j = 0; j < s.length(); j++) {
			score += alphabet.indexOf(s.charAt(j)) + 1;
		}
		score = score * i;

		return score;
	}

	private static String[] readNames(String filePath) throws IOException {
		FileReader fr = new FileReader(filePath);
		BufferedReader textReader = new BufferedReader(fr);

		String line = textReader.readLine();

		int num = 0;
		for (int i = 0; i < line.length(); i++) {

			if (line.charAt(i) == '\"') {
				num++;
			}
		}
		num = (num / 2);

		String[] names = new String[num];

		for (int i = 0; i < names.length; i++) {
			if (line.indexOf(',') != -1) {
				int pos = line.indexOf(',');
				names[i] = line.substring(1, pos - 1);
				line = line.substring(pos + 1);

			} else if (line.length() > 2) {
				names[i] = line.substring(1, line.length() - 1);

				break;
			}

		}
		textReader.close();
		return names;

	}

}
