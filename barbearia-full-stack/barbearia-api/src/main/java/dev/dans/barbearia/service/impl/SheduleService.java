package dev.dans.barbearia.service.impl;

import dev.dans.barbearia.exception.ResourceNotFoundException;
import dev.dans.barbearia.model.entity.Schedule;
import dev.dans.barbearia.model.repository.IScheduleRepository;
import dev.dans.barbearia.service.IScheduleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.OffsetDateTime;
import java.util.List;

@Service
public class SheduleService implements IScheduleService {
    @Autowired
    IScheduleRepository scheduleRepository;

    @Override
    public Schedule findById(long id) {
        return scheduleRepository.findById(id).orElseThrow(
                () -> new ResourceNotFoundException("schedule id", id)
        );
    }

    @Override
    public Schedule save(Schedule entity) {
        return scheduleRepository.save(entity);
    }

    @Override
    public Schedule update(Schedule entity) {
        return scheduleRepository.save(entity);
    }

    @Override
    public void delete(long id) {
        scheduleRepository.deleteById(id);
    }
}
