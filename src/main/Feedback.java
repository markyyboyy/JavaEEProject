import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table (name = "Feebback")


public class Feedback {

	@Id @Column (nullable = false, unique = true)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idFeedback;
	
	@Size(min=3, max=225)
	@Column(name="rating_id", nullable=true)
	private int rating;
	
	@Size(min=3, max=225)
	@Column(name="cooment_id", nullable=true)
	private String comment;

	public Feedback() {
	}

	public Feedback(int idFeedback, String rating, String comment) {
		this.idFeedback = idFeedback;
		this.rating = rating;
		this.comment = comment;
	}

	public int getRating() {
		return rating;
	}
	
	public String getComment() {
		return comment;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}
	
	public void setComment(String comment) {
		this.comment = comment;
	}

}
