package dto;

import java.io.File;

public class ResumeDto {
	
	private String name="Kamal";
	private String profession="SE";
	private String resumeName="KK";
	private byte binary=1;
	private File file1;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getProfession() {
		return profession;
	}
	public void setProfession(String profession) {
		this.profession = profession;
	}
	public String getResumeName() {
		return resumeName;
	}
	public void setResumeName(String resumeName) {
		this.resumeName = resumeName;
	}
	public byte getBinary() {
		return binary;
	}
	public void setBinary(byte binary) {
		this.binary = binary;
	}
	public File getFile1() {
		return file1;
	}
	public void setFile1(File file1) {
		this.file1 = file1;
	}

}
