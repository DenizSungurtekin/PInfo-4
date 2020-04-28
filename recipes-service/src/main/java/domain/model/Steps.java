package domain.model;



import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;


import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;


// Lombok: Getter/Setter/ToString/Hashcode
@Data
@EqualsAndHashCode
@ToString

// DataBase

@Entity
public class Steps implements Serializable{/**
	 * 
	 */
	private static final long serialVersionUID = 6515741718230212220L;

/**
	 * 
	 */
	
	@Id
	@SequenceGenerator(name = "PROFILE_SEQ", sequenceName = "PROFILE_SEQ")  
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "PROFILE_SEQ")			
	private Long id;
	
	private long recipeID;
	
	private String steps;
	
	@ManyToOne
	@JoinColumn(name="Recipe_id",nullable = true)
	private Recipe recipesteps;

	

}
