package br.com.paranhos.persistence.repository;

import br.com.paranhos.persistence.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Long> {

}
