package pid.estate.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import pid.estate.entities.concretes.City;

public interface CityDao extends JpaRepository<City, Integer>{

}
