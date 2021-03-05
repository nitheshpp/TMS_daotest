package tms_daotest;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class TaskListName implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	long id;
	
	@OneToMany(mappedBy = "tlTaskListID",targetEntity = TaskListItems.class)
	private List<TaskListItems> tlItemTaskListName;
	
	String name;

	public TaskListName() {
		
		// TODO Auto-generated constructor stub
	}

	public TaskListName(long id, List<TaskListItems> tlItemTaskListName, String name) {
		super();
		this.id = id;
		this.tlItemTaskListName = tlItemTaskListName;
		this.name = name;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public List<TaskListItems> getTlItemTaskListName() {
		return tlItemTaskListName;
	}

	public void setTlItemTaskListName(List<TaskListItems> tlItemTaskListName) {
		this.tlItemTaskListName = tlItemTaskListName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
}
