import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Employee {

    
    public Employee() {

    }

    public Employee(int id, String firstName) {
        this.id = id;
        this.firstName = firstName;
    }

	private int id;
    private String firstName;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

    // standard getters and setters
}