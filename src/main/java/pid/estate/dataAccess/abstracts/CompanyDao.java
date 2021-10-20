package pid.estate.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import pid.estate.entities.concretes.Company;

public interface CompanyDao extends JpaRepository<Company, Integer>{

}
