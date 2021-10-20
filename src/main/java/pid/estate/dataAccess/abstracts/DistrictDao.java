package pid.estate.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import pid.estate.entities.concretes.District;

public interface DistrictDao extends JpaRepository<District, Integer>{

}
