package pid.estate.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "estates")
@AllArgsConstructor
@NoArgsConstructor
public class Estate {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@ManyToOne
	@JoinColumn(name="city_id")
	private City city;
	
	@ManyToOne
	@JoinColumn(name="district_id")
	private District district;
	
	@Column(name="size")
	private int size;
	
	@Column(name="room")
	private String room;
	
	@Column(name="flat")
	private int flat;
	
	@Column(name="type_of_heating")
	private String typeOfHeating;
	
	@Column(name="customer_id")
	private int customerId;
	
	@Column(name="price")
	private int price;
	
	@ManyToOne
	@JoinColumn(name="estate_type_id")
	private EstateType estateType;
}
