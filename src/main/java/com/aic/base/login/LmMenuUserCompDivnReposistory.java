package com.aic.base.login;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


@Repository
public interface LmMenuUserCompDivnReposistory extends JpaRepository<LM_MENU_USER_COMP_DIVN, Integer> {

	@Query("Select e From LM_MENU_USER_COMP_DIVN e WHERE e.mucd_user_id.userId = :userId AND e.mucd_comp_code = :compCode")
	public LM_MENU_USER_COMP_DIVN findByuserIdAndCompCode(@Param("userId") String userId,
			@Param("compCode") String compCode);

	@Modifying
	@Query("DELETE FROM LM_MENU_USER_COMP_DIVN e WHERE e.mucd_user_id.userId = :userId AND e.mucd_comp_code = :companyCode AND e.mucd_divn_code = :divnCode AND e.mucd_dept_code = :deptCode")
	void deleteByUserIdAndCompCodeAndDivnCodeAndDeptCode(@Param("userId") String userId,
			@Param("companyCode") String companyCode, @Param("divnCode") String divnCode,
			@Param("deptCode") String deptCode);

}
