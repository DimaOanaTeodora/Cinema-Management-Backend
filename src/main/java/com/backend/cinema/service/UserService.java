package com.backend.cinema.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.backend.cinema.exception.UserNotFoundException;
import com.backend.cinema.model.User;
import com.backend.cinema.repository.UserRepository;

@Service
public class UserService {

	private UserRepository userRepository;

	public UserService(UserRepository userRepository) {
	        this.userRepository = userRepository;
	    }

	public User createUser(User user) {
		return userRepository.save(user);
	}

	public User getUser(Integer id) {
		Optional<User> userOptional = userRepository.findById(id);
		if (userOptional.isPresent()) {
			return userOptional.get();
		} else {
			throw new UserNotFoundException(id);
		}
	}

//	public List<User> getAllByType(UserType type) {
//		return userRepository.findByType(type);
//	}

//	public double getAverageBalance(UserType type) {
//		return userRepository.getAverageBalance(type);
//	}

	/*@Transactional(propagation = Propagation.MANDATORY)
	public void makeUserTransfer(TransferRequest transferRequest) {
		userRepository.modifyBalance(transferRequest.getAmount(), transferRequest.getToUserId());
		userRepository.modifyBalance(-transferRequest.getAmount(), transferRequest.getFromUserId());
	}*/
}