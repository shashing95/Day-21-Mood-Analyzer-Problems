package com.bridgelabz.MoodAnalyzer;

public class MoodAnalyzr {
	String message;
	public MoodAnalyzr(String message) {
		this.message=message;
	}
	public String analyzeMood() {
		try {
			if(message.contains("sad")){
				return "SAD";
			} else {
				return "HAPPY";
			}
		} catch(NullPointerException e) {
			return "HAPPY";
		}
	}
}


