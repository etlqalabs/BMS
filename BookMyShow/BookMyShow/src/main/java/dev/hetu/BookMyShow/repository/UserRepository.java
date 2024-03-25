package dev.hetu.BookMyShow.repository;

import dev.hetu.BookMyShow.model.Actor;
import dev.hetu.BookMyShow.model.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ActorRepository extends JpaRepository<Actor,Integer> {
}
