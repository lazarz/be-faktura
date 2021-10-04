package laza.faktura.domain;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Data
@RequiredArgsConstructor
public class ObchodnyPartner {
    private final String nazov;
    private final String cisloUctu;
    private final String adresaUlica;
    private final String adresaCislo;
    private final String adresaPSC;
    private final boolean platcaDPH;
}
