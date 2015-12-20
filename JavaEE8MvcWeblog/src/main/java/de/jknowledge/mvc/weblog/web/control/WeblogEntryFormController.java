package de.jknowledge.mvc.weblog.web.control;

import java.net.URI;

import javax.inject.Inject;
import javax.mvc.annotation.Controller;
import javax.ws.rs.BeanParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

import de.jknowledge.mvc.weblog.domain.service.IWeblogService;
import de.jknowledge.mvc.weblog.web.model.WeblogEntryModel;

@Path("entryForm")
@Controller
public class WeblogEntryFormController {
	
	@Inject
	private IWeblogService weblogService;
	
	@GET
	public String editForm() {
		return "/WEB-INF/pages/weblogEntryForm.jsp";
	}
	
	@POST
	public Response formPost(@BeanParam WeblogEntryModel entryModel) {
		weblogService.createOrUpdate(entryModel);
		return Response.seeOther(URI.create("weblogList")).build();
	}
	
}
