package laza.faktura.repository;

import laza.faktura.domain.Tovar;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TovarRepository extends MongoRepository<Tovar, String> {
}
