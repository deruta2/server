package ar.com.deruta.server.repositories;

import ar.com.deruta.server.models.Place;
import ar.com.deruta.server.models.utils.Region;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PlaceRepository extends JpaRepository<Place, Long>, PlaceRepositoryCustom {

    List<Place> findByDeletionFlag(Boolean deletionFlag);

    Place findPlaceByIdAndRepository(Long id, ar.com.deruta.server.models.enums.Repository repository);

}