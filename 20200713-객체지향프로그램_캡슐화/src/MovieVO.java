import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class MovieVO {
	// 모든 멤버변수 => 기본이 private
	private int mno;
	private String title;
	private String director;
	private String actor;
	private String genre;
	private String grade;
	private String score;
	private String story;


}
