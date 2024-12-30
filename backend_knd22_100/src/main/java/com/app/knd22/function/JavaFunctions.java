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
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmFunction;
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmParameter;
import com.sap.olingo.jpa.metadata.core.edm.mapper.extension.ODataFunction;
import com.app.knd22.repository.OrganizationRepository;
import com.app.knd22.repository.EmployeePersonalInfoRepository;
import com.app.knd22.repository.EmlpoyeeProfileRepository;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import java.util.ArrayList;
import java.util.List;

@Component
public class JavaFunctions implements ODataFunction {


    
    
}
   
