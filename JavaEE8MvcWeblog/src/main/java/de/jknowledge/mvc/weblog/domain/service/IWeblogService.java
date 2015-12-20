package de.jknowledge.mvc.weblog.domain.service;

import java.util.List;

import de.jknowledge.mvc.weblog.web.model.WeblogEntryModel;

public interface IWeblogService {

	List<WeblogEntryModel> getAll();
	
	void createOrUpdate(WeblogEntryModel modelObj);
	
}
