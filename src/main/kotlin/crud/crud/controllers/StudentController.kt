package crud.crud.controllers

import crud.crud.repositories.StudentRepository
import crud.crud.models.Student
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/auth")
class StudentController(val studentRepository: StudentRepository) {

    @GetMapping("/students")
    fun getAll(): ResponseEntity<List<Student>> {
        val students = studentRepository.findAll()
        return ResponseEntity.ok(students)
    }

    @PostMapping("/students")
    fun createStudent(@RequestBody student: Student): ResponseEntity<Student> {
        val student = studentRepository.save(student)
        return ResponseEntity.ok(student)
    }

}