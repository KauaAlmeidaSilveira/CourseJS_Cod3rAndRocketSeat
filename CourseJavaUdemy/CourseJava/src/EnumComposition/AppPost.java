package EnumComposition;


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import Model.Entities.Comment;
import Model.Entities.Post;

public class AppPost {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		
		Comment comment1 = new Comment("Have a nice trip");
		Comment comment2 = new Comment("Wow that's awesome!");
		
		Post post = new Post(LocalDateTime.parse("20/11/2023 13:05:44", fmt),
				"Traveling to New Zealand",
				"I'm going to visit this wonderful country!",
				12);
		
		post.addComment(comment1);
		post.addComment(comment2);
		
		System.out.println(post.showInfoPost());
		
		System.out.println("Comments: ");
		
		post.getComments().forEach(comment -> {
			System.out.println(comment.getText());
		});
		
		System.out.println();
		
		Comment comment3 = new Comment("Have a nice trip");
		Comment comment4 = new Comment("Wow that's awesome!");
		
		Post post2 = new Post(LocalDateTime.parse("30/11/2023 20:10:36", fmt),
				"Good night guys",
				"See you tomorrow",
				5);
		
		post2.addComment(comment3);
		post2.addComment(comment4);
		
		System.out.println(post2.showInfoPost());
		
		System.out.println("Comments: ");
		
		post2.getComments().forEach(comment -> {
			System.out.println(comment.getText());
		});
		
		sc.close();
	}

}
