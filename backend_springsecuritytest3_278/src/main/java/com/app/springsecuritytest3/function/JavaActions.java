package com.app.springsecuritytest3.function;

import com.app.springsecuritytest3.model.Manager;
import com.app.springsecuritytest3.model.Pet;
import com.app.springsecuritytest3.model.PetCareCenter;
import com.app.springsecuritytest3.model.PetOwner;
import com.app.springsecuritytest3.model.Document;
import com.app.springsecuritytest3.model.PetService;




import com.app.springsecuritytest3.enums.PetServiceType;
import com.app.springsecuritytest3.converter.PetServiceTypeConverter;
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmAction;
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmParameter;
import com.sap.olingo.jpa.metadata.core.edm.mapper.extension.ODataAction;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.transaction.Transactional;

@Component
public class JavaActions implements ODataAction {
    private final EntityManager entityManager;

    public JavaActions(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

	
	
}
  