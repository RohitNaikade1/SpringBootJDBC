package com.example.demo.Controllers;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Repository.WorkerRepository;
import com.example.demo.model.Worker;

@RestController
@RequestMapping("/worker")
public class WorkerController {

	@Autowired
	WorkerRepository repository;
	
	@GetMapping("/showWorker")
	public Worker getWorker() throws SQLException {
		return repository.getWorker();
	}
	
	@GetMapping("/all/showWorkers")
	public List<Worker> getWorkers() throws SQLException {
		return repository.getWorkers();
	}
	
	@GetMapping("/create")
	public int createWorker() throws SQLException {
		return repository.add();
	}
	
	@GetMapping("/update")
	public int updateWorker() throws SQLException {
		return repository.update();
	}
	
	@GetMapping("/delete")
	public int deleteWorker() throws SQLException {
		return repository.delete();
	}
}
