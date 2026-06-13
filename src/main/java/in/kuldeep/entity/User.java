package in.kuldeep.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="USER_EMP")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id;
	
	 private String username;
	 private String email;
	    @Column(nullable = false)
	    private String password;

	    @Column(nullable = false)
	    private String role;

		public User() {
			
		}

		public User(Long id, String username,String email, String password, String role) {
			super();
			Id = id;
			this.username = username;
			this.email=email;
			this.password = password;
			this.role = role;
		}

		public Long getId() {
			return Id;
		}

		public void setId(Long id) {
			Id = id;
		}

		public String getUsername() {
			return username;
		}

		public void setUsername(String username) {
			this.username = username;
		}
		
		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		public String getRole() {
			return role;
		}

		public void setRole(String role) {
			this.role = role;
		}

		@Override
		public String toString() {
			return "User [Id=" + Id + ", username=" + username + ", password=" + password + ", role=" + role + "]";
		}
		
		
	    
	    
}
