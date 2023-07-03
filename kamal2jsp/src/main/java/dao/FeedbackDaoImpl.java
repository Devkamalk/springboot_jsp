package dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import dto.MessageDto;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;
import model.Feedback;

@Repository
public class FeedbackDaoImpl implements FeedbackDao{
	
	private EntityManager entityManager;
	
	@Autowired
	public FeedbackDaoImpl(EntityManager entityManager) {
		
	 this.entityManager = entityManager;
		// TODO Auto-generated constructor stub
	}
	
	@Transactional
	@Override
	public void saveFeedback(MessageDto msgDto) {
		// TODO Auto-generated method stub
		Feedback fdBack = new Feedback();
		fdBack.setName(msgDto.getName());
		fdBack.setEmailId(msgDto.getEmailId());
		fdBack.setFeedbackMessage(msgDto.getMessage());
		entityManager.persist(fdBack);
		
		
	}

	@Override
	public List<Feedback> getAllFeedbacks() {
		// TODO Auto-generated method stub
		TypedQuery<Feedback> tQuery = entityManager.createQuery("From Feedback",Feedback.class);
		return tQuery.getResultList();
	}

	@Transactional
	@Override
	public void editFeedback(MessageDto msgDto) {
		// TODO Auto-generated method stub
		String nameValue=msgDto.getName();
		TypedQuery<Feedback> tQuery = entityManager.createQuery("From Feedback where name=:nameData",Feedback.class);
		tQuery.setParameter("nameData", nameValue);
		Feedback fb = new Feedback();
		fb = tQuery.getResultList().get(0);;
		fb.setName(msgDto.getName());
		fb.setEmailId(msgDto.getEmailId());
		fb.setFeedbackMessage(msgDto.getMessage());
		//entityManager.persist(fb);
		entityManager.persist(fb);
		
	}

}
