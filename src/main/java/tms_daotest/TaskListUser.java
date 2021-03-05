package tms_daotest;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class TaskListUser implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	long id;
	
	@OneToMany(mappedBy = "AssignUserId",targetEntity = TaskListAssignment.class)
	private List<TaskListAssignment> tlAssign;
	
	
	@OneToMany(mappedBy = "ShowUserId",targetEntity = TaskListShowPreferences.class)
	private List<TaskListShowPreferences> tlShowPref;
	
	
	
	String userName;
	String passwordHash;
	boolean isManager;
	boolean isAdministrator;
	public TaskListUser() {
		
		// TODO Auto-generated constructor stub
	}
	public TaskListUser(long id, List<TaskListAssignment> tlAssign, List<TaskListShowPreferences> tlShowPref,
			String userName, String passwordHash, boolean isManager, boolean isAdministrator) {
		super();
		this.id = id;
		this.tlAssign = tlAssign;
		this.tlShowPref = tlShowPref;
		this.userName = userName;
		this.passwordHash = passwordHash;
		this.isManager = isManager;
		this.isAdministrator = isAdministrator;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public List<TaskListAssignment> getTlAssign() {
		return tlAssign;
	}
	public void setTlAssign(List<TaskListAssignment> tlAssign) {
		this.tlAssign = tlAssign;
	}
	public List<TaskListShowPreferences> getTlShowPref() {
		return tlShowPref;
	}
	public void setTlShowPref(List<TaskListShowPreferences> tlShowPref) {
		this.tlShowPref = tlShowPref;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPasswordHash() {
		return passwordHash;
	}
	public void setPasswordHash(String passwordHash) {
		this.passwordHash = passwordHash;
	}
	public boolean isManager() {
		return isManager;
	}
	public void setManager(boolean isManager) {
		this.isManager = isManager;
	}
	public boolean isAdministrator() {
		return isAdministrator;
	}
	public void setAdministrator(boolean isAdministrator) {
		this.isAdministrator = isAdministrator;
	}
	
	
	
}
