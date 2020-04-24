package progavanzada.model;



import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="users")
public class Usuario {
	
	@Id
	private int id;
	private String username;
	private String password;
	private int enable;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getEnable() {
		return enable;
	}
	public void setEnable(int enable) {
		this.enable = enable;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", password=" + password + ", enable=" + enable + "]";
	}
	public Usuario(int id, String username, String password, int enable) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.enable = enable;
	}
	
}
