package de.jknowledge.mvc.weblog.domain.service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

import de.jknowledge.mvc.weblog.web.model.WeblogEntryModel;

@ApplicationScoped
@Named("weblogService")
public class WeblogServiceImpl implements IWeblogService {

	private List<WeblogEntryModel> weblogList;
	
	@PostConstruct
	public void init() {
		weblogList = new ArrayList<>();
	}
	
	@Override
	public List<WeblogEntryModel> getAll() {
		return weblogList;
	}

	@Override
	public void createOrUpdate(WeblogEntryModel modelObj) {
		modelObj.setLogDate(LocalDate.now());
		if(modelObj.getId() != null) {
			weblogList.remove(modelObj);
			weblogList.add(0,modelObj);
		} else {
			modelObj.setId((weblogList.size() + 1));
			weblogList.add(0,modelObj);
		}
	}

}
