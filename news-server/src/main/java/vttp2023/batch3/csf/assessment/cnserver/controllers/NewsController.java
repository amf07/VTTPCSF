package vttp2023.batch3.csf.assessment.cnserver.controllers;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;




@RequestMapping("/api/news/")
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

	@RequestMapping("/TopNewsTags")
    public ResponseEntity<String> signup(@RequestBody RegisterRequest registerRequest) {
        NewsController authService;
		authService.signup(registerRequest);
        return new ResponseEntity<>("User Registration Successful",
                );
    }


	// TODO: Task 3

	@RequestMapping()

