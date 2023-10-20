package nl.youngcapital.match.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import nl.youngcapital.match.model.Opdrachtgever;


@Repository
public interface OpdrachtgeverRepository extends JpaRepository<Opdrachtgever, Long> {

}
