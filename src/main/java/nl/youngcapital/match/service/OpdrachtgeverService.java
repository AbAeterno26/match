package nl.youngcapital.match.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;
import nl.youngcapital.match.model.Opdrachtgever;
import nl.youngcapital.match.persistence.OpdrachtgeverRepository;

@Service
public class OpdrachtgeverService {
	
	@Autowired
	private OpdrachtgeverRepository opdrachtgeverRepository;
	
	public List<Opdrachtgever> findAll() {
		return opdrachtgeverRepository.findAll();
	}
	
	@Transactional
	public Opdrachtgever createOrUpdate(Opdrachtgever opdrachtgever) {
		return this.opdrachtgeverRepository.save(opdrachtgever);
	}
	
	public void deleteById(long id) {
		this.opdrachtgeverRepository.deleteById(id);
	}
	
}
