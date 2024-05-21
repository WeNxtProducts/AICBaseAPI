package com.aic.base.custMaster;

import java.util.Map;

import com.aic.base.users.RequestDataDto.StaticDetails;
import com.aic.base.users.RequestDataDto.TestMrv;

public class CustRequestData {
 
    private HeaderInfo headerInfo;
    private Accordions accordions;
    private FrontForm frontForm;
    private FrontForm physical_address;
    private FrontForm postal_address;
    private FrontForm personal_details;
    
    public FrontForm getPostal_address() {
		return postal_address;
	}

	public void setPostal_address(FrontForm postal_address) {
		this.postal_address = postal_address;
	}

	public FrontForm getPersonal_details() {
		return personal_details;
	}

	public void setPersonal_details(FrontForm personal_details) {
		this.personal_details = personal_details;
	}

	public FrontForm getPhysical_address() {
		return physical_address;
	}

	public void setPhysical_address(FrontForm physical_address) {
		this.physical_address = physical_address;
	}

	private StaticDetails staticDetails;
 
    // Getters and setters
    public HeaderInfo getHeaderInfo() {
        return headerInfo;
    }
 
    public void setHeaderInfo(HeaderInfo headerInfo) {
        this.headerInfo = headerInfo;
    }
 
    public Accordions getAccordions() {
        return accordions;
    }
 
    public void setAccordions(Accordions accordions) {
        this.accordions = accordions;
    }
 
    public FrontForm getFrontForm() {
        return frontForm;
    }
 
    public void setFrontForm(FrontForm frontForm) {
        this.frontForm = frontForm;
    }
 
    public StaticDetails getStaticDetails() {
        return staticDetails;
    }
 
    public void setStaticDetails(StaticDetails staticDetails) {
        this.staticDetails = staticDetails;
    }
 
   
    public static class HeaderInfo {
       
    }
 
    public static class Accordions {
        private Department department;
 
       
        public Department getDepartment() {
            return department;
        }
 
        public void setDepartment(Department department) {
            this.department = department;
        }
    }
 
    public static class Department {
        private Mrv mrv;
 
        // Getters and setters
        public Mrv getMrv() {
            return mrv;
        }
 
        public void setMrv(Mrv mrv) {
            this.mrv = mrv;
        }
    }
 
    public static class Mrv {
        private TestMrv testMrv;
 
        // Getters and setters
        public TestMrv getTestMrv() {
            return testMrv;
        }
 
        public void setTestMrv(TestMrv testMrv) {
            this.testMrv = testMrv;
        }
    }
 
  
 
    public static class FrontForm {
        private Map<String, String> formFields;
        private String label;
 
        // Getters and setters
        public Map<String, String> getFormFields() {
            return formFields;
        }
 
        public void setFormFields(Map<String, String> formFields) {
            this.formFields = formFields;
        }
 
        public String getLabel() {
            return label;
        }
 
        public void setLabel(String label) {
            this.label = label;
        }
    }
 
    public static class physical_address {
        private Map<String, String> formFields;
        private String label;
 
        // Getters and setters
        public Map<String, String> getFormFields() {
            return formFields;
        }
 
        public void setFormFields(Map<String, String> formFields) {
            this.formFields = formFields;
        }
 
        public String getLabel() {
            return label;
        }
 
        public void setLabel(String label) {
            this.label = label;
        }
    }
 
   
    public static class personal_details {
        private Map<String, String> formFields;
        private String label;
 
        // Getters and setters
        public Map<String, String> getFormFields() {
            return formFields;
        }
 
        public void setFormFields(Map<String, String> formFields) {
            this.formFields = formFields;
        }
 
        public String getLabel() {
            return label;
        }
 
        public void setLabel(String label) {
            this.label = label;
        }
    }

    public static class postal_address {
        private Map<String, String> formFields;
        private String label;
 
        // Getters and setters
        public Map<String, String> getFormFields() {
            return formFields;
        }
 
        public void setFormFields(Map<String, String> formFields) {
            this.formFields = formFields;
        }
 
        public String getLabel() {
            return label;
        }
 
        public void setLabel(String label) {
            this.label = label;
        }
    }
}
