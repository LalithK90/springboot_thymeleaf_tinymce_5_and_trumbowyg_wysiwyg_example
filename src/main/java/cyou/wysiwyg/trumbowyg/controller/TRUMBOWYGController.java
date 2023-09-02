package cyou.wysiwyg.trumbowyg.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import cyou.wysiwyg.trumbowyg.entity.DemoOne;
import cyou.wysiwyg.trumbowyg.service.DemoOneService;
import lombok.AllArgsConstructor;

@Controller
@AllArgsConstructor
@RequestMapping("/trumbowyg")
public class TRUMBOWYGController {
    private final DemoOneService demoOneService;

    @GetMapping
    public String tinymce() {
        return "trumbowyg/trumbowyg";
    }

    @PostMapping("/rich_text_editor")
    public String save(@ModelAttribute DemoOne demo) {
        System.out.println(demo.getDescription());
        demoOneService.save(demo);
        return "redirect:/trumbowyg";
    }

    @GetMapping("/findAll")
    public String findAll(Model model) {
        model.addAttribute("demos", demoOneService.findAll());
        return "trumbowyg/view";
    }
}
