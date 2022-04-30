package dev.themobileaps.departmentservice.controller;

import dev.themobileaps.departmentservice.entity.Department;
import dev.themobileaps.departmentservice.service.DepartmentService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/departments")
@RequiredArgsConstructor
@Slf4j
public class DepartmentController {

    private final DepartmentService departmentService;

    @PostMapping("/")
    public Department saveDepartment(@RequestBody Department department) {
        log.info("Inside saveDepartment method of DepartmentController");
        return departmentService.saveDepartment(department);
    }

    @GetMapping("/{id}")
    public Department findDepartmentById(@PathVariable("id") int id) {
        log.info("Inside findDepartmentById method of DepartmentController");
        return departmentService.findDepartmentById(id);
    }
}
