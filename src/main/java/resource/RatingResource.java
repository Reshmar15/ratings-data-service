package resource;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import models.Rating;
import models.UserRating;

@RestController
@RequestMapping("ratings")
public class RatingResource {
	
	@RequestMapping("/{movieId}")
	public Rating getRating(@PathVariable("movieId") String movieId) {
		
		return new Rating(movieId, 4);
		
	}
	
	@RequestMapping("users/{userId}")
	public UserRating getRatingbyUser(@PathVariable("userId") String userId) {
		
		 List<Rating> ratings = Arrays.asList( 
				 	new Rating("pushpakavimanam", 4),
				 	new Rating("karwaan", 4),
					new Rating("Life of Pie", 5));
		 
		 UserRating userRatings = new UserRating();
		 userRatings.setRatings(ratings);
		 return userRatings;
		
	}

}
