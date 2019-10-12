package br.com.mercado.ticketservice.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.mercado.ticketservice.domain.Ticket;

public interface TicketRepository extends CrudRepository<Ticket, Integer> {
	
	Ticket findTicketByNumeroPremiado(Integer numeroPremiado);
	
	Ticket findAllByProdutoid(Integer produtoId);

}
