package de.jknowledge.mvc.weblog.web.control;

import javax.inject.Inject;
import javax.mvc.annotation.Controller;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

import de.jknowledge.mvc.weblog.domain.service.IWeblogService;

@Path("weblogList")
@Controller
public class WeblogListController {

	@Inject
	private IWeblogService weblogService;
	
	@GET
	public String getList() {
		return "/WEB-INF/pages/weblogList.jsp";
	}
	
	
	
}
