package tms_daotest;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class TaskListStatus implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	long id;
	
	
	
	@OneToMany(mappedBy = "ShowStatusId",targetEntity = TaskListShowPreferences.class)
	private List<TaskListShowPreferences> tlShowStatusId;
	
	@OneToMany(mappedBy = "tlStatusID",targetEntity = TaskListItems.class)
	private List<TaskListItems> tlItemStatusId;
	
	String StatusDescription;

	public TaskListStatus() {
		
		// TODO Auto-generated constructor stub
	}

	public TaskListStatus(long id, List<TaskListShowPreferences> tlShowStatusId, List<TaskListItems> tlItemStatusId,
			String statusDescription) {
		
		this.id = id;
		this.tlShowStatusId = tlShowStatusId;
		this.tlItemStatusId = tlItemStatusId;
		StatusDescription = statusDescription;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public List<TaskListShowPreferences> getTlShowStatusId() {
		return tlShowStatusId;
	}

	public void setTlShowStatusId(List<TaskListShowPreferences> tlShowStatusId) {
		this.tlShowStatusId = tlShowStatusId;
	}

	public List<TaskListItems> getTlItemStatusId() {
		return tlItemStatusId;
	}

	public void setTlItemStatusId(List<TaskListItems> tlItemStatusId) {
		this.tlItemStatusId = tlItemStatusId;
	}

	public String getStatusDescription() {
		return StatusDescription;
	}

	public void setStatusDescription(String statusDescription) {
		StatusDescription = statusDescription;
	}

	
}
