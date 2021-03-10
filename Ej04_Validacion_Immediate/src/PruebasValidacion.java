import java.util.Date;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;

import com.curso.modelo.Vehiculo;


public class PruebasValidacion {

	public static void main(String[] args) {

		Validator v = Validation.buildDefaultValidatorFactory().getValidator();
		Vehiculo vh = new Vehiculo(-5,"fkdhfjshds","hjkdhdebdbd",50,new Date(1));
		
		Set<ConstraintViolation<Vehiculo>> constraintViolations = v.validate(vh);  
		for(ConstraintViolation<Vehiculo> constraintViolation : constraintViolations){   
			System.out.println(constraintViolation.getPropertyPath());   
			System.out.println(constraintViolation.getMessage()); 
		}		
				
		
	}
}
