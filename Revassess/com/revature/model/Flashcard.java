package com.revature.model;

public class Flashcard {
	private int id;
	private String question;
	private String answer;
	private int catId;
	public Flashcard() {
		super();
	}
	
	
	
	public Flashcard(String question, String answer, int catId) {
		super();
		this.question = question;
		this.answer = answer;
		this.catId = catId;
	}



	public Flashcard(int id, String question, String answer, int catId) {
		super();
		this.id = id;
		this.question = question;
		this.answer = answer;
		this.catId = catId;
	}

	

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	public int getCatId() {
		return catId;
	}
	public void setCatId(int catId) {
		this.catId = catId;
	}
	@Override
	public String toString() {
		return "Flashcard [id=" + id + ", question=" + question + ", answer=" + answer + ", catId=" + catId + "]";
	}
	
	
}