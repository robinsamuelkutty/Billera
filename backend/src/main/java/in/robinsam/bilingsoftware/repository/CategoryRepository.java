package in.robinsam.bilingsoftware.repository;

import in.robinsam.bilingsoftware.entity.CategoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<CategoryEntity,Long> {
}
