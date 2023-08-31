package vttp2023.batch3.csf.assessment.cnserver.controllers;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.web.bind.annotation.RestController;
import lombok.AllArgsConstructor;




@RequestMapping("/api/movie/")
@AllArgsConstructor
@RestController
public class NewsController{

		@Autowired
		private NewsController;
	
		@GetMapping(path="{newsId}")
		public ResponseEntity<String> getNews(@PathVariable(name="") String newsControlleString) {
	
		   String opt = newsid.(Newsid);
			 
			return ResponseEntity.ok(opt);
		}
		}

	


	// TODO: Task 2


	// TODO: Task 3

}
