package kr.co.jhta.vo;

import java.util.List;

// 특정 url에 대한 접근 권한들을 담는 객체
public class UrlRole {

	private String path;
	private List<String> roles;
	
	public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path;
	}
	public List<String> getRole() {
		return roles;
	}
	public void setRole(List<String> roles) {
		this.roles = roles;
	}
}
