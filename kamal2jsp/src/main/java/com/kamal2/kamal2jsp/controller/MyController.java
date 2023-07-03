package com.kamal2.kamal2jsp.controller;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import dao.FeedbackDao;
import dto.MessageDto;
import dto.ResumeDto;
import model.Feedback;

@RestController // Used when we wants to return json object
public class MyController {
	
	@Autowired
	 FeedbackDao feedbackDao;
	
	@GetMapping("/hi")
	List<String> returnList() {
		List<String> dataItems = new ArrayList<>();
		dataItems.add("Item1");
		dataItems.add("Item2");
		dataItems.add("Item3");
		//String data="hiii";
		System.out.println("call succeeded");
		return dataItems;
	}
	
	@GetMapping("/path/{id}")
	List<String> getIdFromPath(@PathVariable(value="id") String id) {
		List<String> pathItem = new ArrayList<>();
		pathItem.add(id);
		//String data="hiii";
		System.out.println("call succeeded");
		return pathItem;
	}
	
	@RequestMapping("/query")
	List<String> getIdFromVariable(@RequestParam(required=false)  String paramId) {
		List<String> queryItem = new ArrayList<>();
		queryItem.add(paramId);
		//String data="hiii";
		System.out.println("call succeeded");
		return queryItem;
	}
	
	@GetMapping("/resume")
	ResumeDto getResume() {
		ResumeDto resumeDto = new ResumeDto();
		resumeDto.setName("ll");
		resumeDto.setResumeName("cc");
		resumeDto.setBinary((byte) 0b011);
		File file1 = new File("/kamal2jsp/src/main/resources/resume/file1.txt");
		resumeDto.setFile1(file1);
		return resumeDto;
	}
	
	@GetMapping(value = "/file", produces = MediaType.TEXT_EVENT_STREAM_VALUE)
	@ResponseBody
	byte[] getFile() throws IOException {
		File yourFile = new File("score.txt");
		Path fileName = Path.of("score.txt");
		Files.writeString(fileName, "contenttttttttttttttttttttttttttttttttttttttttttt");
		System.out.println(yourFile.getAbsolutePath());
		// Now creating byte array of same length as file
		byte[] arr = new byte[(int) yourFile.length()];
		System.out.println(yourFile.length());

		return arr;
		
		//return new File("/kamal2jsp/src/main/resources/resume/file1.txt");
	}
	
	@GetMapping(value = "/image")
	//@ResponseBody
	ResponseEntity<byte[]> getImageFile() throws IOException {
		File yourFile = new File("kamal.JPEG");
		Path fileName = Path.of("kamal.JPEG");
		//Files.writeString(fileName, "contenttttttttttttttttttttttttttttttttttttttttttt");
		System.out.println(yourFile.getAbsolutePath());
		// Now creating byte array of same length as file
		byte[] arr = new byte[(int) yourFile.length()];
		System.out.println(yourFile.length());

		//return arr;
		return ResponseEntity.ok().contentType(MediaType.IMAGE_JPEG).body(arr);
		
		//return new File("/kamal2jsp/src/main/resources/resume/file1.txt");
	}
	
	/*
	 * @GetMapping("/newFeedBack") String newFeedBack(@RequestParam("message")
	 * String message) { System.out.println("New feed arrived");
	 * System.out.println(message); return "FeedBack submitted"; }
	 */
	
	@PostMapping("/newFeedBack")
	String newFeedBack(MessageDto msgDto) {
		System.out.println("New feed arrived");
		System.out.println(msgDto.getName());
		System.out.println(msgDto.getEmailId());
		System.out.println(msgDto.getMessage());
		feedbackDao.saveFeedback(msgDto);
		
		return "FeedBack submitted";
	}
	
	@GetMapping("/getAllFeedbacks")
	List<MessageDto> getAllFeedbacks(){
		List<Feedback> feedBackList = new ArrayList<>();
		List<MessageDto> feedBackDtoList = new ArrayList<>();
		feedBackList = feedbackDao.getAllFeedbacks();
		for(Feedback fb: feedBackList) {
			MessageDto msgDto = new MessageDto();
			msgDto.setName(fb.getName());
			msgDto.setMessage(fb.getFeedbackMessage());
			feedBackDtoList.add(msgDto);
		}
		return feedBackDtoList;
	}
	
	@PostMapping("/editFeedBack")
	String editFeedBack(MessageDto editDto) {
		System.out.println("Edit feedack call");
		System.out.println(editDto.getName());
		System.out.println(editDto.getEmailId());
		System.out.println(editDto.getMessage());
		feedbackDao.editFeedback(editDto);
		
		return "FeedBack submitted";
	}
	
	
	
	


}
