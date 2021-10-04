package laza.faktura.domain;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;

@Document
@Data
@RequiredArgsConstructor
public class Tovar {
    private final String cisloTovaru;
    private final BigDecimal jednotkovaCena;
}
