package pid.estate.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import pid.estate.entities.concretes.Estate;

public interface EstateDao extends JpaRepository<Estate, Integer> {
	
	Estate getEstateById(Integer id);
	List<Estate> getEstatesByEstateTypeId(int estateTypeId);	
	List<Estate> getEstatesByDistrict_IdAndEstateType_Id(Integer districtId, Integer estateTypeId);
}
