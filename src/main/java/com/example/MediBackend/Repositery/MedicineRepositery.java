package com.example.MediBackend.Repositery;

import com.example.MediBackend.Entity.Medicine;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface MedicineRepositery extends JpaRepository<Medicine,Integer> {

    @Query("SELECT m FROM Medicine m WHERE m.name LIKE :name%")
    Page<Medicine> searchByMname(@Param("name") String name, Pageable pageable);

    public Medicine findByName(String name);

//    public Medicine deleteByName(String name);
;
//    @Query("SELECT * FROM Medicine m WHERE m.name LIKE :")
//    List<Medicine> getMediForFristLetter()
}
