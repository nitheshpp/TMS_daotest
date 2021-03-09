package tms_daotest;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class TaskListCategories implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	long id;
	
	@OneToMany(mappedBy = "tlCategoryID",targetEntity = TaskListItems.class)
	private List<TaskListItems> tlItemCategory;
	
	String Description;

	public TaskListCategories() {
		
	}

	public TaskListCategories(long id, List<TaskListItems> tlItemCategory, String description) {
		super();
		this.id = id;
		this.tlItemCategory = tlItemCategory;
		Description = description;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public List<TaskListItems> getTlItemCategory() {
		return tlItemCategory;
	}

	public void setTlItemCategory(List<TaskListItems> tlItemCategory) {
		this.tlItemCategory = tlItemCategory;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}
	
}
