package java.al.group.brightideas.validator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import al.marjani.tvshows.model.Show;
import al.marjani.tvshows.service.ShowService;
import al.marjani.tvshows.util.Utils;

@Component
public class ShowValidator implements Validator {
	
	@Autowired
	private ShowService showService;
	
    @Override
    public boolean supports(Class<?> aClass) {
        return Show.class.equals(aClass);
    }

    @Override
    public void validate(Object o, Errors errors) {
    	
    	Show show = (Show) o;

        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "title", "NotEmpty");
        if (!Utils.isNotEmptyString(show.getNetwork().getName())) {
            errors.rejectValue("network", "NotEmpty");
        }
        
    }
	
}
