import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "SecurityQuestion")

public class SecurityQuestion {
	
	@Id
	@Column(name = "Question", nullable = false, length = 250)
	@Size(max = 250)
	@NotNull
	private String question;
	
	public SecurityQuestion(){}
	
	public SecurityQuestion(String question){
		this.question = question;
	} 
}
