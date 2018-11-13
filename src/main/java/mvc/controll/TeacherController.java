package mvc.controll;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TeacherController {

	@RequestMapping("teacher")
	String view() {
		return "teacher/view";
	}
}
