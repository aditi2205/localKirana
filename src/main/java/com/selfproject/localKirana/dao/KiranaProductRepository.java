package com.selfproject.localKirana.dao;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import java.util.List;


public interface KiranaProductRepository extends CrudRepository<KiranaProduct,Integer> {

	@Query("Select p from KiranaProduct p where p.productName = ?1")
	List<KiranaProduct> findByName(String s);
}
