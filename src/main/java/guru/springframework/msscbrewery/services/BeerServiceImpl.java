package guru.springframework.msscbrewery.services;

import guru.springframework.msscbrewery.web.model.BeerDto;
import org.springframework.stereotype.Service;

import java.util.UUID;

/**
 * Implementación del servicio BeerService.
 * Contiene la lógica de negocio para la gestión de cervezas,
 * como obtener, crear, actualizar o eliminar cervezas.
 */
@Service
public class BeerServiceImpl implements BeerService {
	 /**
     * Obtiene una cerveza ficticia por su identificador único.
     * @param beerId UUID de la cerveza.
     * @return BeerDto con información simulada de la cerveza.
     */
    @Override
    public BeerDto getBeerById(UUID beerId) {
        return BeerDto.builder().id(UUID.randomUUID())
                .beerName("Galaxy Cat")
                .beerStyle("Pale Ale")
                .build();
    }
}
