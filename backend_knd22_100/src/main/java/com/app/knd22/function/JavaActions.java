package com.app.knd22.function;

import com.app.knd22.model.Organization;
import com.app.knd22.model.EmployeePersonalInfo;
import com.app.knd22.model.EmlpoyeeProfile;




import com.app.knd22.enums.EmploymentType;
import com.app.knd22.enums.OrgDept;
import com.app.knd22.enums.OrgBranch;
import com.app.knd22.converter.OrgBranchConverter;
import com.app.knd22.converter.EmploymentTypeConverter;
import com.app.knd22.converter.OrgDeptConverter;
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
  