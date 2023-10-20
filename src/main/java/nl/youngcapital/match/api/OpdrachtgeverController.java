package nl.youngcapital.match.api;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import nl.youngcapital.match.model.Opdrachtgever;
import nl.youngcapital.match.service.OpdrachtgeverService;

@RestController
@CrossOrigin
@RequestMapping("api/opdrachtgever")

public class OpdrachtgeverController {


	
	@Autowired
	private OpdrachtgeverService opdrachtgeverService;
	
	@GetMapping // listens to: http://localhost:8081/api/Opdrachtgevers
	public List<Opdrachtgever> findAll() {
		return opdrachtgeverService.findAll();
	}
	
	@PostMapping
	public Opdrachtgever create(@RequestBody Opdrachtgever opdrachtgever) {
		return this.opdrachtgeverService.createOrUpdate(opdrachtgever);
	}
	
	@GetMapping("{id}")
	public Opdrachtgever findById(@PathVariable long id) {
		Optional<Opdrachtgever> optionalOpdrachtgever = this.opdrachtgeverService.findById(id);
		
		if(optionalOpdrachtgever.isPresent()) {
			return optionalOpdrachtgever.get();
		} else {
			return null;
		}
	}
	
	@PutMapping("{id}")
	public Opdrachtgever updateById(@PathVariable long id, @RequestBody Opdrachtgever input) {
		Opdrachtgever target = findById(id);
		
		if(target ==null) {
			return null;
		}
		
		
		target.setLocatie(input.getLocatie());
		target.setEmail(input.getEmail());
		target.setNaam(input.getNaam());
		target.setTelefoon(input.getTelefoon());
		target.setBeschrijving(input.getBeschrijving());
		
		return this.opdrachtgeverService.createOrUpdate(target);
	}
	
	@DeleteMapping("{id}")
	public void deleteById(@PathVariable long id) {
		this.opdrachtgeverService.deleteById(id);
	}
}

