package in.kuldeep.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import in.kuldeep.dto.UserDTO;
import in.kuldeep.entity.User;
import in.kuldeep.repository.UserRepository;
import in.kuldeep.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private PasswordEncoder passwordEncoder;

	@Override
	public String register(UserDTO request) {
		if(userRepository.existsByEmail(request.getEmail())){
			 return "Email Id is already exist";
		}
		
		// create the new user details
		
		User user=new User();
		user.setUsername(request.getUsername());
		user.setEmail(request.getEmail());
		System.out.println("32 "+passwordEncoder.encode(request.getPassword()));
		user.setPassword(passwordEncoder.encode(request.getPassword()));
		user.setRole(request.getRole());

		userRepository.save(user);
		return "User registered Successfully ! ";
	}
	
	
}
