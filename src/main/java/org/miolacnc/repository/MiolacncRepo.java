package org.miolacnc.repository;

import org.miolacnc.models.Miolacnc;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface MiolacncRepo extends JpaRepository<Miolacnc,Integer> {

}