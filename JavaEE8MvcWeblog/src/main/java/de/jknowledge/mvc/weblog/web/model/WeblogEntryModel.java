package de.jknowledge.mvc.weblog.web.model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javax.ws.rs.FormParam;

public class WeblogEntryModel {
	
	private Integer id;
	
	private LocalDate logDate;
	
	@FormParam("headline")
	private String headline;

	@FormParam("logText")
	private String logText;
	
	public String getLogDateFormatted() {
		 DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
		 return logDate != null?formatter.format(logDate):"";
	}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	

	public LocalDate getLogDate() {
		return logDate;
	}

	public void setLogDate(LocalDate logDate) {
		this.logDate = logDate;
	}

	public String getLogText() {
		return logText;
	}

	public void setLogText(String logText) {
		this.logText = logText;
	}
	

	public String getHeadline() {
		return headline;
	}

	public void setHeadline(String headline) {
		this.headline = headline;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		WeblogEntryModel other = (WeblogEntryModel) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	
	
}
