package dev.dans.barbearia.service;

import dev.dans.barbearia.model.entity.Schedule;

import java.time.OffsetDateTime;
import java.util.List;


public interface IScheduleService {
    Schedule findById(long id);
    List<Schedule> findInMonth(final OffsetDateTime startAt, final OffsetDateTime endAt);
    Schedule save(Schedule entity);
    Schedule update(Schedule entity);
    void delete(long id);
}
