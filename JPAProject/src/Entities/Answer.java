package Entities;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;

public class Answer {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id; 
	@JoinColumn(name="question_id")
	private Question question; 
	@Column(name="is_correct")
	private boolean correct; 
	@Column(name="answer")
	private String text;
	
	public int getId() {
		return id;
	}
	public Question getQuestion() {
		return question;
	}
	public void setQuestion(Question question) {
		this.question = question;
	}
	public boolean isCorrect() {
		return correct;
	}
	public void setCorrect(boolean correct) {
		this.correct = correct;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	@Override
	public String toString() {
		return "Answer [id=" + id + ", question=" + question + ", correct=" + correct + ", text=" + text + "]";
	} 
}
