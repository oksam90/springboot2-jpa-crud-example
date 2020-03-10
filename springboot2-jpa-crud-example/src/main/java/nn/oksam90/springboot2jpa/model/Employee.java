package nn.oksam90.springboot2jpa.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employee")
public class Employee {
	
	private Long id;
	private String nom;
	private String prenom;
	private String emailId;
	
	public Employee() {
		  
    }
 
    public Employee(String nom, String prenom, String emailId) {
         this.nom = nom;
         this.prenom = prenom;
         this.emailId = emailId;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Column(name = "nom_empl", nullable = false)
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	@Column(name = "prenom_empl", nullable = false)
	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	@Column(name = "email_empl", nullable = false)
	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	
	@Override
    public String toString() {
        return "Employee [id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", emailId=" + emailId
       + "]";
    }
    
    
}
