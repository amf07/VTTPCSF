package vttp2023.batch3.csf.assessment.cnserver.repositories;

import org.springframework.stereotype.Repository;

import vttp2023.batch3.csf.assessment.cnserver.controllers.NewsController;

@Repository
public class NewsRepository<VerificationToken> {

	@Repository
public interface ShareANews extends ShareANews<NewsController
git commit -m "first commit"
git branch -M main
git remote add origin https://github.com/amf07/NewFile.git
git push -u origin main
, Long> {
    Optional<NewsRepository> findByToken(String token);
}
	

	// TODO: Task 2 
	// Write the native Mongo query in the comment above the method


	// TODO: Task 3
	// Write the native Mongo query in the comment above the method


}
