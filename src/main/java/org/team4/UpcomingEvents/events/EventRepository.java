package org.team4.UpcomingEvents.events;

import org.springframework.data.jpa.repository.JpaRepository;


public interface EventRepository extends JpaRepository<Event,Long> {

}