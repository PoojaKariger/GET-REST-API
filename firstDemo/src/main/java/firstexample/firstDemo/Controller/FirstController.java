package firstexample.firstDemo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import firstexample.firstDemo.entities.Course;
import firstexample.firstDemo.services.CourseServices;

@RestController
public class FirstController {
	@Autowired
	private CourseServices courseServices;
	@GetMapping("/home")
	public String Home() {
		return  "welcome to Course application";
	}


//get the Courses
	@GetMapping("/course")
public List<Course> getCourses(){
	return  this.courseServices.getCourses();
}
 }


