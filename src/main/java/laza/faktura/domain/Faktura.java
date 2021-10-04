package laza.faktura.domain;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document
@Data
@RequiredArgsConstructor
public class Faktura {
    private Date datumVystavenia;
    private Date datumSplatnosti;
    private String variabilnySymbol;
    private String cisloFaktury;
}
