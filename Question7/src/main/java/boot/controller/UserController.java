package boot.controller;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import boot.model.User;
import boot.service.UserService;

//Controller sınıfı
// Proje ' localhost:8080 ' adresinde çalismaktadir. 
@Controller
public class UserController {
	
	//Spring Setter Injection
	@Autowired
	private UserService userService;
	
	//ASAGIDAKI TUM METODLAR CrudRepository ILE GELMISTIR.
	
	//Mapping bize jsp sayfasinda olusturulan <c:when test="${mode == '??'}"> ozelligini kullanmamiza yarar. Bu sekilde bir nevi modulerlik saglar.
	@GetMapping("/")// acilis sayfasi icin mapping olusturulmustur. index sayfasina yonlendirilir.
	public String home(HttpServletRequest request){
		request.setAttribute("mode", "MODE_HOME");
		return "index";
	}

	
	@GetMapping("/all-user")//user verilerinin siralanmasini saglar
	public String allTasks(HttpServletRequest request){
		request.setAttribute("tasks", userService.findAll());
		request.setAttribute("mode", "MODE_USER");
		return "index";
	}
	
	@GetMapping("/update-user")//user verilerinin guncellenmesini saglar. 
	public String updateTask(@RequestParam int id, HttpServletRequest request){
		request.setAttribute("task", userService.findTask(id));
		request.setAttribute("mode", "MODE_UPDATE");
		return "index";
	}
	
	@GetMapping("/new-user")//kayit metodudur.
	public String newTask(HttpServletRequest request){
		request.setAttribute("mode", "MODE_NEW");
		return "index";
	}
	
	//ModelAttribute anotasyonu RequestParam anotasyonuna gore tum class'i getirmektedir. RequestParam sadece istenen degeri getirir.
	@PostMapping("/save-user")//Kayit metodudur. <input type="submit" class="btn btn-primary" value="Save"/> butonu ile user kayit edilir.
	public String saveTask(@ModelAttribute User task, BindingResult bindingResult, HttpServletRequest request){
		
		userService.save(task);
		request.setAttribute("tasks", userService.findAll());
		request.setAttribute("mode", "MODE_USER");
		return "index";
	}

	//User silmek icin crudRepository ile gelen delete metodu'dur. 
	@GetMapping("/delete-user")
	public String deleteTask(@RequestParam int id, HttpServletRequest request){
		userService.delete(id);
		request.setAttribute("tasks", userService.findAll());
		request.setAttribute("mode", "MODE_USER");
		return "index";
	}
}
