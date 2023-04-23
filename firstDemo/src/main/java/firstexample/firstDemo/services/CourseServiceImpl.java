package firstexample.firstDemo.services;



import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import firstexample.firstDemo.entities.Course;

@Service
public class CourseServiceImpl implements CourseServices{
	List<Course>list;
	
	public CourseServiceImpl() {
		
		list = new ArrayList<>();
	    list.add(new Course(142,"Spring Boot","Spring Boot is an open source Java-based framework used to create a Micro Service." ));
	    list.add(new Course(123,"React JS","React is a JavaScript library for building user interfaces."));
	    list.add(new Course(156,"Angular","Angular is a platform for building mobile and desktop web applications.."));
	    list.add(new Course(145,"Flutter","Flutter is Google's SDK for crafting beautiful, fast user experiences for mobile, web, and desktop from a single codebase."));
		}
  
	@Override
	public List<Course> getCourses() {
		// TODO Auto-generated method stub
		return list;
	}

}
