package in.kuldeep.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Consultant")
public class Consultant {
	 	@Id
	    @Column(name = "ID")
	    private Integer id;

	    @Column(name = "FIRST_NAME")
	    private String firstName;

	    @Column(name = "LAST_NAME")
	    private String lastName;

	    @Column(name = "AGE")
	    private Integer age;

	    @Column(name = "CLIENT")
	    private String client;

	    // Constructors
	    public Consultant() {
	    }

	    // Getters and Setters

	    public Integer getId() {
	        return id;
	    }

	    public Consultant(Integer id, String firstName, String lastName, Integer age, String client) {
			super();
			this.id = id;
			this.firstName = firstName;
			this.lastName = lastName;
			this.age = age;
			this.client = client;
		}

		public void setId(Integer id) {
	        this.id = id;
	    }

	    public String getFirstName() {
	        return firstName;
	    }

	    public void setFirstName(String firstName) {
	        this.firstName = firstName;
	    }

	    public String getLastName() {
	        return lastName;
	    }

	    public void setLastName(String lastName) {
	        this.lastName = lastName;
	    }

	    public Integer getAge() {
	        return age;
	    }

	    public void setAge(Integer age) {
	        this.age = age;
	    }

	    public String getClient() {
	        return client;
	    }

	    public void setClient(String client) {
	        this.client = client;
	    }

		@Override
		public String toString() {
			return "Consultant [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", age=" + age
					+ ", client=" + client + "]";
		}
	    
	    
}
