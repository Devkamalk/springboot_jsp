package dao;

import java.util.List;

import dto.MessageDto;
import model.Feedback;

public interface FeedbackDao {
	
	void saveFeedback(MessageDto msgDto);
	List<Feedback> getAllFeedbacks();
	void editFeedback(MessageDto msgDto);

}
