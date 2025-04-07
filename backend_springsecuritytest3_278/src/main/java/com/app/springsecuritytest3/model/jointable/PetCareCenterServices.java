package com.app.springsecuritytest3.model.jointable;

import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmIgnore;
import lombok.Data;
import javax.persistence.*;

import com.app.springsecuritytest3.model.Manager;
import com.app.springsecuritytest3.model.Pet;
import com.app.springsecuritytest3.model.PetCareCenter;
import com.app.springsecuritytest3.model.PetOwner;
import com.app.springsecuritytest3.model.Document;
import com.app.springsecuritytest3.model.PetService;
import com.app.springsecuritytest3.enums.PetServiceType;
import com.app.springsecuritytest3.converter.PetServiceTypeConverter;

@Entity(name = "PetCareCenterServices")
@Table(schema = "\"springsecuritytest3_867\"", name = "\"PetCareCenterServices\"")
@Data
public class PetCareCenterServices{

 	@Id
    @Column(name = "\"Id\"")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
	
	@Column(name = "\"PcId\"")
	private Integer pcId;

    
    @Column(name = "\"ServiceId\"")
    private Integer serviceId;
 
}