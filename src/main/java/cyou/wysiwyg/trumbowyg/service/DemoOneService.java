package cyou.wysiwyg.trumbowyg.service;

import java.util.List;

import org.springframework.stereotype.Service;

import cyou.wysiwyg.trumbowyg.entity.DemoOne;
import cyou.wysiwyg.trumbowyg.repository.DemoOneRepository;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class DemoOneService {
    private final DemoOneRepository demoOneRepository;

    public void save(final DemoOne demo) {
        demoOneRepository.save(demo);
    }

    public List<DemoOne> findAll() {
        return demoOneRepository.findAll();
    }

    public DemoOne findById(Long id) {
        return demoOneRepository.getReferenceById(id);
    }
}
