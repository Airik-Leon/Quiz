package data;

import java.util.List;

import Entities.Quiz;

public interface QuizDAO {
	public List<Quiz> index(); 
	public Quiz show(int id); 
	public Quiz create(String jsonQuiz); 
	public Quiz update(int id); 
	public Quiz destroy(int id); 
}
