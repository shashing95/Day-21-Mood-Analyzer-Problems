package com.bridgelabz.MoodAnalyzer;

public class MoodAnalyzers {
	
	public String analyseMood(String message) {
		if(message.contains("Happy")) {
		return "Happy";
		}
		else if(message.contains("Sad")) {
			return "sad";
		}
		else {
			return null;
		}
	}
	
	public static void main(String[] args) {
		MoodAnalyzer moodAnalyzer = new MoodAnalyzer();
		String mood = moodAnalyzers.analysersMood("I am happy");
		System.out.println(mood);
		mood = moodAnalyzers.analysersMood("I am sad");
		System.out.println(mood);
	}
}

