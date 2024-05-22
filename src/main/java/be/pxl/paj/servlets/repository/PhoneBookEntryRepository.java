package be.pxl.paj.servlets.repository;

import be.pxl.paj.servlets.domain.PhoneBookEntry;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PhoneBookEntryRepository extends JpaRepository<PhoneBookEntry, Long> {

}
