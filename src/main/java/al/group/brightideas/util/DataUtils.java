package main.java.al.group.brightideas.util;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;



import org.springframework.stereotype.Component;

import main.java.al.group.brightideas.model.Network;
import main.java.al.group.brightideas.model.Rating;
import main.java.al.group.brightideas.model.Show;
import main.java.al.group.brightideas.model.User;

@Component
public class DataUtils {
	
	public Map<String, Object> getShowRatingMap(Show show, List<Rating> ratings){
		Map<String, Object> showRatingMap = new HashMap<>();
		showRatingMap.put("show", this.getShowMap(show));
		showRatingMap.put("ratings", this.getRatingListMap(ratings));
		return showRatingMap;
	}
	
	public List<Map<String, Object>> getRatingListMap(List<Rating> ratings){
		List<Map<String, Object>> ratingListMap = new ArrayList<>();
		for(Rating rating: ratings) {
			ratingListMap.add(this.getRatingMap(rating));
		}
		return ratingListMap;
	}
	
	private Map<String, Object> getShowMap(Show show){
		Map<String, Object> showMap = new HashMap<>();
		showMap.put("id", show.getId());
		showMap.put("title", show.getTitle());
		showMap.put("network", this.getNetworkMap(show.getNetwork()));
		return showMap;
	}
	
	private Map<String, Object> getNetworkMap(Network network){
		Map<String, Object> networkMap = new HashMap<>();
		networkMap.put("id", network.getId());
		networkMap.put("name", network.getName());
		return networkMap;
	}
	
	private Map<String, Object> getRatingMap(Rating rating){
		Map<String, Object> ratingMap = new HashMap<>();
		ratingMap.put("id", rating.getId());
		ratingMap.put("value", (double) rating.getValue());
		ratingMap.put("show", this.getShowMap(rating.getShow()));
		ratingMap.put("user", this.getUserMap(rating.getUser()));
		return ratingMap;
	}
	
	private Map<String, Object> getUserMap(User user){
		Map<String, Object> userMap = new HashMap<>();
		userMap.put("id", user.getId());
		userMap.put("username", user.getUsername());
		userMap.put("email", user.getEmail());
		return userMap;
	}
	
	public void sortShows(List<Map<String, Object>> showRatingListMap) {
		showRatingListMap.sort(Comparator.comparing(
				avg -> (double) avg.get("avg"), 
                    Comparator.nullsLast(Comparator.reverseOrder())));
	}
	
}
