package dev.dans.barbearia.service;

import dev.dans.barbearia.model.entity.Schedule;


public interface IScheduleService {
    Schedule findById(long id);
    Schedule save(Schedule entity);
    Schedule update(Schedule entity);
    void delete(long id);
}
