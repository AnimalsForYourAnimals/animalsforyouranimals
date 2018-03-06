package pl.animalsfouryouranimals;

import org.apache.commons.validator.routines.EmailValidator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import pl.animalsfouryouranimals.models.Account;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

@SpringBootApplication
@RestController
public class AnimalsforyouranimalsApplication {

	public static void main(String[] args) {
		SpringApplication.run(AnimalsforyouranimalsApplication.class, args);
	}

	@RequestMapping("/")
	public ModelAndView homePage(){
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("index.html");
		return modelAndView;
	}

	@RequestMapping("/registration")
	public ModelAndView registrationPage(){
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("registration.html");
		return modelAndView;
	}

	@RequestMapping("/newAccount")
	public void newAccount(@RequestParam("login") String login,@RequestParam("password") String password,@RequestParam("password2")
			String password2,@RequestParam("email") String email){

			if(isValidData(login,password,password2,email)){
				createAccount(login, password, email);
			}
	}

	private void createAccount(@RequestParam("login") String login, @RequestParam("password") String password, @RequestParam("email") String email) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Animal");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		entityManager.getTransaction().begin();

		Account account = new Account(login,password,email);
		entityManager.persist(account);
		entityManager.getTransaction().commit();

		entityManager.close();
		entityManagerFactory.close();
	}

	private boolean isValidEmailAddress(String email) {
		if(EmailValidator.getInstance().isValid(email)){
			return true;
		}else{
			return false;
		}
	}

	private boolean isValidData(String login,String password,String password2, String email){
		if(!login.isEmpty() || !password.isEmpty() || !password2.isEmpty() || !email.isEmpty()){
			if(password.equals(password2)){
				if(isValidEmailAddress(email)){
					return true;
				}
			}
		}
		return false;
	}

}
