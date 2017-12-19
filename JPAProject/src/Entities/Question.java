package Entities;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;

public class Question {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id; 
	private String text; 
	@JoinColumn(name="quiz_id")
	private Quiz quizType;
	
	public int getId() {
		return id;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public Quiz getQuizType() {
		return quizType;
	}
	public void setQuizType(Quiz quizType) {
		this.quizType = quizType;
	}
	@Override
	public String toString() {
		return "Question [id=" + id + ", text=" + text + ", quizType=" + quizType + "]";
	} 
	
}