package tms_daotest;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class TaskListAssignment implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	long id;
	
	@ManyToOne
	@JoinColumn(name="userId")
	TaskListUser AssignUserId;

	@ManyToOne
	@JoinColumn(name="TaskListId" ,referencedColumnName="TaskListId")
	TaskListItems AssignTaskListId;
	
	public TaskListAssignment() {
		
		// TODO Auto-generated constructor stub
	}

	

	public TaskListAssignment(long id, TaskListUser assignUserId, TaskListItems assignTaskListId) {
		super();
		this.id = id;
		AssignUserId = assignUserId;
		AssignTaskListId = assignTaskListId;
	}

	public TaskListItems getAssignTaskListId() {
		return AssignTaskListId;
	}

	public void setAssignTaskListId(TaskListItems assignTaskListId) {
		AssignTaskListId = assignTaskListId;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public TaskListUser getAssignUserId() {
		return AssignUserId;
	}

	public void setAssignUserId(TaskListUser assignUserId) {
		AssignUserId = assignUserId;
	}
	
	
}
