package cyou.wysiwyg.tiny_mce.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import cyou.wysiwyg.tiny_mce.entity.Demo;
import cyou.wysiwyg.tiny_mce.service.DemoService;
import lombok.AllArgsConstructor;

@Controller
@AllArgsConstructor
public class TINYMCEController {
    private final DemoService demoService;

    @GetMapping("/tinymce")
    public String tinymce() {
        return "tiny_mce/tinymce";
    }

    @PostMapping("/rich_text_editor")
    public String save(@ModelAttribute final Demo demo) {
        System.out.println(demo.getDescription());
        this.demoService.save(demo);
        return "tiny_mce/tinymce";
    }

    @GetMapping("/findAll")
    public String findAll(final Model model) {
        model.addAttribute("demos", this.demoService.findAll());
        return "tiny_mce/view";
    }
}
