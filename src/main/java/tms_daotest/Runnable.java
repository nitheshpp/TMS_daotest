package tms_daotest;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Runnable implements CommandLineRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpringApplication.run(Runnable.class, args);
	}

//	@Autowired
	
	
	@Override
	public void run(String... args) throws Exception 
	{
		System.out.println("Hi");
		
		/* LoginPage */
		
		//login(object of TaskListUser)
		//listCategory(select)
			//object ListTaskBasedOnCategory
		//createNewTask(object)
		
		
		/*Manage task Lists View*/
		
		//ListTaskBasedOnCategory(coppy)
		
		//(AssignedUsers,total Task,lastModefied,LastCreated)
		
		//FindAvailableUser() 
			//(taskListShowTable)
		
		//AssignTaskToAvailableUser (object)
			//(insert in taskLIstAssignmentTable)
		
		//UpdateTaskListNameTable(object)
			//(rename This Task, delete,createNewListName)
		
		/*Manage User View*/
		
		//ListTaskBasedOnCategory(copy,select)
			//(AssignedUsers,total Task,lastModefied,LastCreated)
		//UpdateListTaskBasedOnCategory(object)

		//UpdateTaskListUserTable
			//(renameUserName,ChangePassword,ChagePermisttion,delete,createANewUser)
		//updateStatusType
		//updateCategory

		
	}

}
