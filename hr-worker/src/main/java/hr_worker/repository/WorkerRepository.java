package hr_worker.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import hr_worker.entity.Worker;

@Repository
public interface WorkerRepository extends JpaRepository<Worker, Long> {

}
