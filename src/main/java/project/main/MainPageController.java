package project.main;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainPageController {

	@RequestMapping("page/main")
	String getmain() {
		return "page/main";
	}

	@RequestMapping("page/mainlist")
	String getlist() {
		return "page/mainlist";
	}
}
