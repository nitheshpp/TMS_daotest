package tms_daotest;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class TaskListShowPreferences implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	long id;
	
	@ManyToOne
	@JoinColumn(name="userId")
	TaskListUser ShowUserId;
	
	@ManyToOne
	@JoinColumn(name="statusId")
	TaskListStatus ShowStatusId;

	
	public TaskListShowPreferences(long id, TaskListUser showUserId, TaskListStatus showStatusId) {
		
		this.id = id;
		ShowUserId = showUserId;
		ShowStatusId = showStatusId;
	}


	public TaskListShowPreferences() {
		
		// TODO Auto-generated constructor stub
	}


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public TaskListUser getShowUserId() {
		return ShowUserId;
	}


	public void setShowUserId(TaskListUser showUserId) {
		ShowUserId = showUserId;
	}


	public TaskListStatus getShowStatusId() {
		return ShowStatusId;
	}


	public void setShowStatusId(TaskListStatus showStatusId) {
		ShowStatusId = showStatusId;
	}
	
	
}
