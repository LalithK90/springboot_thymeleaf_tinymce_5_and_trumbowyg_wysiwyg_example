package cyou.wysiwyg.tiny_mce.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import cyou.wysiwyg.tiny_mce.entity.Demo;
import cyou.wysiwyg.tiny_mce.repository.DemoRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class DemoService {
    private final DemoRepository demoRepository;

    public void save(Demo demo) {
        demoRepository.save(demo);
    }

    public List<Demo> findAll() {
        return demoRepository.findAll();
    }
}
