package vttp2023.batch3.csf.assessment.cnserver.services;

import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Service;

import vttp2023.batch3.csf.assessment.cnserver.models.News;
import vttp2023.batch3.csf.assessment.cnserver.models.TagCount;

@Service
public class NewsService {
	
	// TODO: Task 1
	// Do not change the method name and the return type
	// You may add any number of parameters
	// Returns the news id
	/**
	 * @param message
	 * @param templateEngine
	 * @return
	 */
	public String postNews(String message, Object templateEngine) {
        News context = new News();
        context.setVariable("news", message);
        return templateEngine.process("newsTemplate", context);
    } {
		return "news";
	}
	 
	// TODO: Task 2
	// Do not change the method name and the return type
	// You may add any number of parameters
	// Returns a list of tags and their associated count
	public List<TagCount> getTags(getNewsByTag getNewsByTag) {
		getTags(null) = getTags getNewsByTag()
		
		return new LinkedList<>();
	}

	// TODO: Task 3
	// Do not change the method name and the return type
	// You may add any number of parameters
	// Returns a list of news
	public List<News> getNewsByTag(NewsService) {
		NewsService newss = newss NewsService 
		return new LinkedList<>();
	}


	
}
