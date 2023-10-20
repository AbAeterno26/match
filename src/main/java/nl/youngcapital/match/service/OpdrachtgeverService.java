package nl.youngcapital.match.service;

import java.util.List;
import java.util.Optional;

import nl.youngcapital.match.model.Opdrachtgever;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import nl.youngcapital.match.persistence.OpdrachtgeverRepository;

@Service
public class OpdrachtgeverService {
	
	@Autowired
	private OpdrachtgeverRepository OpdrachtgeverRepository;
	
	
	public List<Opdrachtgever> findAll() {
		return OpdrachtgeverRepository.findAll();
	}


	public Opdrachtgever createOrUpdate(Opdrachtgever Opdrachtgever) {

		return this.OpdrachtgeverRepository.save(Opdrachtgever);
	}
	


	public Optional<Opdrachtgever> findById(long id) {
		return this.OpdrachtgeverRepository.findById(id);
	}
	
	public void deleteById(long id) {
		this.OpdrachtgeverRepository.deleteById(id);
	}
}
