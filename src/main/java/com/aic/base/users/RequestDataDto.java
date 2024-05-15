package com.aic.base.users;
 
import java.util.Map;
 
import org.json.JSONObject;
 
public class RequestDataDto {
 
    private HeaderInfo headerInfo;
    private Accordions accordions;
    private FrontForm frontForm;
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
 
    public static class TestMrv {
        private Map<String, String> heading;
        private Map<String, String> data;
        private String status;
 
        // Getters and setters
        public Map<String, String> getHeading() {
            return heading;
        }
 
        public void setHeading(Map<String, String> heading) {
            this.heading = heading;
        }
 
        public Map<String, String> getData() {
            return data;
        }
 
        public void setData(Map<String, String> data) {
            this.data = data;
        }
 
        public String getStatus() {
            return status;
        }
 
        public void setStatus(String status) {
            this.status = status;
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
 
    public static class StaticDetails {
        private Map<String, String> formFields;
 
        // Getters and setters
        public Map<String, String> getFormFields() {
            return formFields;
        }
 
        public void setFormFields(Map<String, String> formFields) {
            this.formFields = formFields;
        }
    }
   
     private String userInitial;
        private String userRemarks;
        private int userWarningDays;
        private char userLogonOption;
        private int userLoginCount;
        private int userExpiryDayCount;
        private char userLockedYN;
        private int userPwdReuseCount;
        private String userExpiryDt;
        private String userEmailId;
        private String userMobileNo;
        private String userTelNo;
        private String userId;
        private String userPasswd;
        private char userPasswdExpiryYN;
        private char userAdministratorYN;
        private char userOverrideYN;
        private int userCopies;
        private int userDsGroupId;
 
        public String getUserInitial() {
            return userInitial;
        }
 
        public void setUserInitial(String userInitial) {
            this.userInitial = userInitial;
        }
 
        public String getUserRemarks() {
            return userRemarks;
        }
 
        public void setUserRemarks(String userRemarks) {
            this.userRemarks = userRemarks;
        }
 
        public int getUserWarningDays() {
            return userWarningDays;
        }
 
        public void setUserWarningDays(int userWarningDays) {
            this.userWarningDays = userWarningDays;
        }
 
        public char getUserLogonOption() {
            return userLogonOption;
        }
 
        public void setUserLogonOption(char userLogonOption) {
            this.userLogonOption = userLogonOption;
        }
 
        public int getUserLoginCount() {
            return userLoginCount;
        }
 
        public void setUserLoginCount(int userLoginCount) {
            this.userLoginCount = userLoginCount;
        }
 
        public int getUserExpiryDayCount() {
            return userExpiryDayCount;
        }
 
        public void setUserExpiryDayCount(int userExpiryDayCount) {
            this.userExpiryDayCount = userExpiryDayCount;
        }
 
        public char getUserLockedYN() {
            return userLockedYN;
        }
 
        public void setUserLockedYN(char userLockedYN) {
            this.userLockedYN = userLockedYN;
        }
 
        public int getUserPwdReuseCount() {
            return userPwdReuseCount;
        }
 
        public void setUserPwdReuseCount(int userPwdReuseCount) {
            this.userPwdReuseCount = userPwdReuseCount;
        }
 
        public String getUserExpiryDt() {
            return userExpiryDt;
        }
 
        public void setUserExpiryDt(String userExpiryDt) {
            this.userExpiryDt = userExpiryDt;
        }
 
        public String getUserEmailId() {
            return userEmailId;
        }
 
        public void setUserEmailId(String userEmailId) {
            this.userEmailId = userEmailId;
        }
 
        public String getUserMobileNo() {
            return userMobileNo;
        }
 
        public void setUserMobileNo(String userMobileNo) {
            this.userMobileNo = userMobileNo;
        }
 
        public String getUserTelNo() {
            return userTelNo;
        }
 
        public void setUserTelNo(String userTelNo) {
            this.userTelNo = userTelNo;
        }
 
        public String getUserId() {
            return userId;
        }
 
        public void setUserId(String userId) {
            this.userId = userId;
        }
 
        public String getUserPasswd() {
            return userPasswd;
        }
 
        public void setUserPasswd(String userPasswd) {
            this.userPasswd = userPasswd;
        }
 
        public char getUserPasswdExpiryYN() {
            return userPasswdExpiryYN;
        }
 
        public void setUserPasswdExpiryYN(char userPasswdExpiryYN) {
            this.userPasswdExpiryYN = userPasswdExpiryYN;
        }
 
        public char getUserAdministratorYN() {
            return userAdministratorYN;
        }
 
        public void setUserAdministratorYN(char userAdministratorYN) {
            this.userAdministratorYN = userAdministratorYN;
        }
 
        public char getUserOverrideYN() {
            return userOverrideYN;
        }
 
        public void setUserOverrideYN(char userOverrideYN) {
            this.userOverrideYN = userOverrideYN;
        }
 
        public int getUserCopies() {
            return userCopies;
        }
 
        public void setUserCopies(int userCopies) {
            this.userCopies = userCopies;
        }
 
        public int getUserDsGroupId() {
            return userDsGroupId;
        }
 
        public void setUserDsGroupId(int userDsGroupId) {
            this.userDsGroupId = userDsGroupId;
        }
 
        public JSONObject getJSONObject(String string) {
            // TODO Auto-generated method stub
            return null;
        }
       
       
}
 
