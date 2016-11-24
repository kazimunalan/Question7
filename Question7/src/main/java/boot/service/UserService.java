package boot.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import boot.dao.UserRepository;
import boot.model.User;

//Crud islemleri icin gerekli anatosyanlardir. Servis saglar
@Service
@Transactional
public class UserService {

	private final UserRepository userRepository;

	public UserService(UserRepository userRepository) {
		this.userRepository = userRepository;
	}
	//Tum kullanicilari listeler
	public List<User> findAll(){
		List<User> tasks = new ArrayList<>();
		for(User task : userRepository.findAll()){
			tasks.add(task);
		}
		return tasks;
	}
	
	public User findTask(int id){
		return userRepository.findOne(id);
	}
	//User kaydini saglar
	public void save(User task){
		userRepository.save(task);
	}
	//Id Parametresine gore user siler
	public void delete(int id){
		userRepository.delete(id);
	}
}
