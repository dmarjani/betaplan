package java.al.group.brightideas.validator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import al.marjani.tvshows.model.Rating;
import al.marjani.tvshows.service.RatingService;
import al.marjani.tvshows.util.Utils;

@Component
public class RatingValidator implements Validator {

    @Override
    public boolean supports(Class<?> aClass) {
        return Rating.class.equals(aClass);
    }
    
    @Override
    public void validate(Object o, Errors errors) {
    	
    	Rating rating = (Rating) o;

        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "value", "NotEmpty");
        if(!Utils.isNotNullObject(rating.getValue())) {
        	errors.rejectValue("value", "NotEmpty");
        } else {
            if (rating.getValue() <= 0 || rating.getValue() > 5) {
            	errors.rejectValue("value", "Size.rating.value");
            }
        }
        
    }
	
}
