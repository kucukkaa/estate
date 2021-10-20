package pid.estate.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import pid.estate.entities.concretes.EstateType;

public interface EstateTypeDao extends JpaRepository<EstateType, Integer>{

}
