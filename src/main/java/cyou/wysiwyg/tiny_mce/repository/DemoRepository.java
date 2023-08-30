package cyou.wysiwyg.tiny_mce.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import cyou.wysiwyg.tiny_mce.entity.Demo;

public interface DemoRepository extends JpaRepository<Demo, Long> {
}
