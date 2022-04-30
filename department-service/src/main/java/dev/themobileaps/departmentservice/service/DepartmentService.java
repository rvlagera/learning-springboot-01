package dev.themobileaps.departmentservice.service;

import dev.themobileaps.departmentservice.entity.Department;
import dev.themobileaps.departmentservice.repository.DepartmentRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class DepartmentService {

    private final DepartmentRepository departmentRepository;

    public Department saveDepartment(Department department) {
        log.info("Inside saveDepartment method of DepartmentService");
        return departmentRepository.save(department);
    }

    public Department findDepartmentById(int id) {
        log.info("Inside findDepartmentById method of DepartmentService");
        return departmentRepository.findById(id).orElse(null);
    }
}
