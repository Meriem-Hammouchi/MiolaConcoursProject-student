package org.miolacnc.repository;

import org.miolacnc.models.DossierCandidatureEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DossierCandidatureRepository extends CrudRepository<DossierCandidatureEntity, Long> {

}
