package in.kuldeep.dto;

public class ConsDTO {
	 	private Integer id;
	    private String firstName;
	    private String lastName;
	    private Integer age;
	    private String client;
		public ConsDTO() {
			
		}
		public ConsDTO(Integer id, String firstName, String lastName, Integer age, String client) {
			
			this.id = id;
			this.firstName = firstName;
			this.lastName = lastName;
			this.age = age;
			this.client = client;
		}
		public Integer getId() {
			return id;
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
			return "ConsDTO [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", age=" + age
					+ ", client=" + client + "]";
		}	
		
		
	    
}
