package com.qac.row5project.entities;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "SecurityQuestion")

/** 
 * 
 * @author Richard Allen
 *
 */

public class SecurityQuestion {
	
	@Id
	@Column(name = "Question", nullable = false, length = 250)
	@Size(max = 250)
	@NotNull
	private String question;
	
	/** 
	 * 
	 * @author Richard Allen
	 * Create new security question
	 */
	public SecurityQuestion(){}
	
	/** 
	 * 
	 * @author Richard Allen
	 * Set new security question
	 */
	public SecurityQuestion(String question){
		this.question = question;
		
	} 
	
	/** 
	 * 
	 * @author Richard Allen
	 * @return the security question
	 */
	public String getQuestion(){
		return question;
	
	}
	
	/** 
	 * 
	 * @author Richard Allen
	 * update the security question
	 */
	public void setQuestion(String newQ)
	{
		this.question = newQ;
	}


}
