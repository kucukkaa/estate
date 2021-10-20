package pid.estate.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import pid.estate.entities.concretes.Customer;

public interface CustomerDao extends JpaRepository<Customer, Integer>{

}
