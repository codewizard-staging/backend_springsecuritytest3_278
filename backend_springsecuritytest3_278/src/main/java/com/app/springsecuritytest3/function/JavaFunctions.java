package com.app.springsecuritytest3.function;

import com.app.springsecuritytest3.model.Manager;
import com.app.springsecuritytest3.model.Pet;
import com.app.springsecuritytest3.model.PetCareCenter;
import com.app.springsecuritytest3.model.PetOwner;
import com.app.springsecuritytest3.model.Document;
import com.app.springsecuritytest3.model.PetService;
import com.app.springsecuritytest3.enums.PetServiceType;
import com.app.springsecuritytest3.converter.PetServiceTypeConverter;
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmFunction;
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmParameter;
import com.sap.olingo.jpa.metadata.core.edm.mapper.extension.ODataFunction;
import com.app.springsecuritytest3.repository.PetServiceRepository;
import com.app.springsecuritytest3.repository.PetOwnerRepository;
import com.app.springsecuritytest3.repository.PetCareCenterRepository;
import com.app.springsecuritytest3.repository.ManagerRepository;
import com.app.springsecuritytest3.repository.DocumentRepository;
import com.app.springsecuritytest3.repository.PetRepository;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import java.util.ArrayList;
import java.util.List;

@Component
public class JavaFunctions implements ODataFunction {


    
    
}
   
