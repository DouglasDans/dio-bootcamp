package dev.dans.barbearia.controller;

import dev.dans.barbearia.model.entity.Schedule;
import dev.dans.barbearia.service.IScheduleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.YearMonth;
import java.util.List;

import static java.time.ZoneOffset.UTC;

@RestController
@RequestMapping("/api/v1/schedule")
public class ScheduleController {

  @Autowired
  private IScheduleService scheduleService;

  @GetMapping("/{id}")
  public Schedule findById(@PathVariable long id) {
    return scheduleService.findById(id);
  }

  @GetMapping("{year}/{month}")
  public List<Schedule> listMonth(@PathVariable final int year, @PathVariable final int month){
    var yearMonth = YearMonth.of(year, month);
    var startAt = yearMonth.atDay(1)
            .atTime(0, 0, 0, 0)
            .atOffset(UTC);
    var endAt = yearMonth.atEndOfMonth()
            .atTime(23, 59, 59, 999_999_999)
            .atOffset(UTC);
    return scheduleService.findInMonth(startAt, endAt);
  }

  @PostMapping
  public Schedule save(@RequestBody Schedule schedule) {
    return scheduleService.save(schedule);
  }

  @PutMapping("/{id}")
  public Schedule update(@PathVariable Long id, @RequestBody Schedule schedule) {
    schedule.setId(id);
    return scheduleService.update(schedule);
  }

  @DeleteMapping("/{id}")
  public void delete(@PathVariable long id) {
    scheduleService.delete(id);
  }
}
