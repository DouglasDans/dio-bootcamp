package dev.dans.barbearia.controller;

import dev.dans.barbearia.model.entity.User;
import dev.dans.barbearia.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.YearMonth;
import java.util.List;

import static java.time.ZoneOffset.UTC;

@RestController
@RequestMapping("/api/v1/user")
public class UserController {

  @Autowired
  private IUserService userService;

  @GetMapping()
  public List<User> findAll() {
    return userService.findAll();
  }

  @GetMapping("/{id}")
  public User findById(@PathVariable long id) {
    return userService.findById(id);
  }

  @PostMapping
  public User save(@RequestBody User user) {
    return userService.save(user);
  }

  @PutMapping("/{id}")
  public User update(@PathVariable Long id, @RequestBody User user) {
    user.setId(id);
    return userService.update(user);
  }

  @DeleteMapping("/{id}")
  public void delete(@PathVariable long id) {
    userService.delete(id);
  }
}
