package com.example.booker.services;
import com.example.booker.model.entity.PublicationEntity;
import com.example.booker.model.entity.UserEntity;
import com.example.booker.repository.PublicationRepository;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class PublicationService {

    private PublicationRepository publicationRepository;

    PublicationService(PublicationRepository publicationRepository) {
        this.publicationRepository = publicationRepository;
    }

    public List<PublicationEntity> findPublicationByParams(PublicationEntity publicationEntity) {
        Example<PublicationEntity> example = Example.of(publicationEntity, ExampleMatcher.matchingAny());
        return publicationRepository.findAll(example);
    }

    public List<PublicationEntity> getAllPublications() {
        return publicationRepository.findAll();
    }

    public List<PublicationEntity> getOwnedPublications(UserEntity user) {
        return publicationRepository.getAllByOwners(user);
    }

    public PublicationEntity getPublicationById(Long id) {
        return publicationRepository.getById(id);
    }

    public boolean updatePublication(Long id, PublicationEntity newPub) {
        newPub.setId(id);
        publicationRepository.save(newPub);
        return true;
    }

    public boolean saveNewPublication(PublicationEntity publicationEntity) {
        publicationRepository.save(publicationEntity);
        return true;
    }
}
