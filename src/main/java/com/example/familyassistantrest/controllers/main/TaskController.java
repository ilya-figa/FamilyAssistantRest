package com.example.familyassistantrest.controllers.main;

import com.example.familyassistantrest.controllers.MainController;
import com.example.familyassistantrest.entity.Task;
import com.example.familyassistantrest.entity.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * @author Buyevich_I
 */
@RestController
@RequestMapping("/task")
public class TaskController extends MainController {
    //задачи
    @GetMapping()
    public ResponseEntity<List<Task>> getAll(){
        return ResponseEntity.ok(taskRepository.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Task>> getById(@PathVariable Long id){
        return ResponseEntity.ok(taskRepository.findById(id));
    }

    @PostMapping
    public ResponseEntity<?> create(@RequestBody Task task){
        //TODO проверки проверить все остальные id
        if(typeCaseRepository.findById(task.getTypeCaseId()).isEmpty()){
            return ResponseEntity.status(400).body("Нет типа задачи с таким id");
        }
        var save = taskRepository.save(task);
        return ResponseEntity.ok(save);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id){
        //TODO проверки
        taskRepository.deleteById(id);
        return ResponseEntity.ok("OK");
    }

    @GetMapping("/executor/{executorUserId}/{fromEventDateTime}/{toEventDateTime}")
    public ResponseEntity<?> getByExecutorUserId(@PathVariable Long executorUserId, LocalDateTime fromEventDateTime, LocalDateTime toEventDateTime){
        if(userRepository.findById(executorUserId).isEmpty()){
            return ResponseEntity.status(400).body("Пользователя с таким id не существует");
        }
        return ResponseEntity.ok(taskRepository.findAllByExecutorUserIdAndEventDateBetween(executorUserId, fromEventDateTime, toEventDateTime));
    }

    @GetMapping("/subject/{subjectUserId}/{fromEventDateTime}/{toEventDateTime}")
    public ResponseEntity<?> getBySubjectUserId(@PathVariable Long subjectUserId, LocalDateTime fromEventDateTime, LocalDateTime toEventDateTime){
        if(userRepository.findById(subjectUserId).isEmpty()){
            return ResponseEntity.status(400).body("Пользователя с таким id не существует");
        }
        return ResponseEntity.ok(taskRepository.findAllBySubjectUserIdAndEventDateBetween(subjectUserId, fromEventDateTime, toEventDateTime));
    }

    @GetMapping("/creator/{creatorUserId}/{fromEventDateTime}/{toEventDateTime}")
    public ResponseEntity<?> getByCreatorUserId(@PathVariable Long creatorUserId, LocalDateTime fromEventDateTime, LocalDateTime toEventDateTime){
        if(userRepository.findById(creatorUserId).isEmpty()){
            return ResponseEntity.status(400).body("Пользователя с таким id не существует");
        }
        return ResponseEntity.ok(taskRepository.findAllByCreatorUserIdAndEventDateBetween(creatorUserId, fromEventDateTime, toEventDateTime));
    }

    @GetMapping("/subject/{roleId}/{eventDate}/{fromEventDateTime}/{toEventDateTime}")
    public ResponseEntity<?> getByTypeRole(@PathVariable Long roleId, LocalDateTime fromEventDateTime, LocalDateTime toEventDateTime){
        if(roleRepository.findById(roleId).isEmpty()){
            return ResponseEntity.status(400).body("Роли с таким id не существует");
        }
        List<User> userList = userRepository.findAllByRoleId(roleId);
        List<Task> taskList = new ArrayList<>();
        for (User user:userList) {
            taskList.addAll(taskRepository.findAllBySubjectUserIdAndEventDateBetween(user.getId(), fromEventDateTime, toEventDateTime));
        }
        return ResponseEntity.ok(taskList);
    }

    //TODO поиск по дате
    /*@GetMapping("/period/{creatorUserId}")
    public ResponseEntity<?> getByCreatorUserId(@PathVariable LocalDateTime creatorUserId){
        if(userRepository.findById(creatorUserId).isEmpty()){
            return ResponseEntity.status(400).body("Пользователя с таким id не существует");
        }
        return ResponseEntity.ok(taskRepository.findAllByEventDate(creatorUserId));
    }*/
}
