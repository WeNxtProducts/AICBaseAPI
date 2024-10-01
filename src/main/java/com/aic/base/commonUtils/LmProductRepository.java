package com.aic.base.commonUtils;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.aic.base.model.LM_PRODUCT;

@Repository
public interface LmProductRepository extends JpaRepository<LM_PRODUCT, String> {

}
