package db.dao;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.timemanager.shared.DiaryEntryVw;
import com.timemanager.shared.UserDTO;
import com.timemanager.shared.util.DiaryEntryDao;
import com.timemanager.shared.util.UserDao;

public class TestDBSpring {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ApplicationContext context =  new ClassPathXmlApplicationContext("beans.xml");
	 
		DiaryEntryDao customerDAO = (DiaryEntryDao) context.getBean("DiaryEntryDao");
	      
		DiaryEntryVw customer1 = customerDAO.findById(1);
	        System.out.println(customer1.getUser_name());
	}

}
