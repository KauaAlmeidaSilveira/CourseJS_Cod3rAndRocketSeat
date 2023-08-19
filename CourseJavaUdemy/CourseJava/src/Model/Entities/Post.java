package Model.Entities;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Post {

	private LocalDateTime date;
	private String title;
	private String content;
	private Integer likes;
	
	private List<Comment> comments = new ArrayList<>();
	
	private static DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
	
	public Post(LocalDateTime date, String title, String content, Integer likes) {
		this.date = date;
		this.title = title;
		this.content = content;
		this.likes = likes;
	}

	public LocalDateTime getDate() {
		return date;
	}

	public void setDate(LocalDateTime date) {
		this.date = date;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Integer getLikes() {
		return likes;
	}

	public void setLikes(Integer likes) {
		this.likes = likes;
	}
	
	public List<Comment> getComments() {
		return comments;
	}

	public void addComment(Comment comment) {
		if(comment.getText() != null) {
			this.comments.add(comment);
		}
	}
	
	public void removeComment(Comment comment) {
		if(comment != null) {
			this.comments.remove(comment);
		}
	}
	
	public String showInfoPost() {
		return title + "\n" +
			   likes + " Likes - " + fmt.format(date) + "\n" +
			   content;
	}
	
}
