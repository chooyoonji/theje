package project.article;

import java.util.Arrays;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import mvc.model.PageStatus;

@Controller
public class ArticleController {

	@Autowired
	ArticleDAO dao;

	PageStatus status = new PageStatus();

	@RequestMapping("page/customergongi")
	String getGongi() {
		System.out.println("page/customergongi");
		return "page/customergongi";
	}

	@RequestMapping("page/customerfaq")
	String getFAQ() {
		System.out.println("page/customerfaq");
		return "page/customerfaq";
	}

	// ����Ʈ ����
	@RequestMapping("page/customerprivate")
	String getPrivate() {
		System.out.println("page/customerprivate");
		dao.list();
		return "page/customerprivate";
	}

	// �� �ۼ�
	@RequestMapping(value = "page/customerprivatewrite", method = RequestMethod.POST)
	String postPrivatewrite(HttpServletRequest request) {
		System.out.println("page/customerprivatewrite");
		ArticleDTO dto = new ArticleDTO();
		dto.setA_title((String) request.getAttribute("a_title"));
		dto.setA_content((String) request.getAttribute("a_content"));

		dao.insertOne(dto);
		return "page/customerprivatewrite";
	}

	// �� ����
	@RequestMapping(value = "page/customerprivatewrite", method = RequestMethod.GET)
	String postPrivatedetail(HttpServletRequest request) {
		System.out.println("page/customerprivatewrite");
		dao.selectOne(request.getAttribute("a_id"));
		return "page/customerprivatewrite";
	}

	// @ModelAttribute("data")
	// public Object dataGo(@PathVariable("service") String service, ArticleDTO dto,
	// HttpServletRequest request) {
	// Object res = null;
	// switch (service) {
	// case "list":
	// res = dao.list(dto);
	// break;
	// case "detail":
	// break;
	// case "modifyForm":
	// res = dao.selectOne(dto);
	// break;
	//
	// case "insertReg":
	// dao.insertOne(dto);
	//
	// status.setMsg("�ۼ��Ǿ����ϴ�.");
	// status.setUrl("detail?id=" + dto.getA_id());
	// res = dto;
	// break;
	//
	// case "insertMultiReg":
	// status.setMsg("�����Ǿ����ϴ�.");
	// status.setUrl("list");
	// res = dto;
	//
	// break;
	//
	// case "deleteReg":
	// status.setMsg("��������");
	// status.setUrl("deleteForm?id=" + dto.getA_id());
	//
	// if ((int) dao.deleteOne(dto) >= 1) {
	// status.setMsg("��������");
	// status.setUrl("list");
	// }
	// res = dto;
	// case "modifyReg":
	//
	// status.setMsg("���� ����");
	// status.setUrl("modifyForm?id=" + dto.getA_id());
	//
	// if ((int) dao.modifyOne(dto) >= 1) {
	// status.setMsg("�����Ǿ����ϴ�.");
	// status.setUrl("detail?id=" + dto.getA_id());
	// }
	// res = dto;
	//
	// break;
	// }
	// return res;
	// }
	//
	// @RequestMapping()
	// public String view(@PathVariable("service") String service) {
	//
	// String res = "page/" + service;
	//
	// String[] arr = { "deleteReg", "modifyReg", "insertReg", "insertMultiReg",
	// "insertErrorReg" };
	//
	// if (Arrays.asList(arr).contains(service)) {
	// res = "mybatis/alert";
	// }
	// return res;
	// }

	// // �� ����
	// @RequestMapping(value = "page/customerprivatewrite", method =
	// RequestMethod.POST)
	// String postPrivatemodify() {
	// System.out.println("page/customerprivatewrite");
	// return "page/customerprivatewrite";
	// }
	//
	// // �� ����
	// @RequestMapping(value = "page/customerprivatewrite", method =
	// RequestMethod.POST)
	// String postPrivatedelete() {
	// System.out.println("page/customerprivatewrite");
	// return "page/customerprivatewrite";
	// }

}
