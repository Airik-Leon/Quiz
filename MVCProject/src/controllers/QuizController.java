package controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import Entities.Quiz;
import data.QuizDAO;

@RestController
public class QuizController {
	@Autowired
	QuizDAO dao; 
	
	@RequestMapping(path="quiz", method=RequestMethod.GET)
	public List<Quiz> index(){
		return dao.index(); 
	}
}
