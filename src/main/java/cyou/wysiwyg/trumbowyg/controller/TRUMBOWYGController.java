package cyou.wysiwyg.trumbowyg.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import cyou.wysiwyg.trumbowyg.entity.DemoOne;
import cyou.wysiwyg.trumbowyg.service.DemoOneService;
import lombok.AllArgsConstructor;

@Controller
@AllArgsConstructor
@RequestMapping("/trumbowygDemo")
public class TRUMBOWYGController {
    private final DemoOneService demoOneService;

    @GetMapping
    public String tinymce(Model model) {
        model.addAttribute("demo", new DemoOne());
        return "trumbowyg/trumbowyg";
    }

    @GetMapping("/{id}")
    public String tinymceFindById(Model model, @PathVariable("id") Long id) {
        System.out.println(id);
        model.addAttribute("demo", demoOneService.findById(id));
        return "trumbowyg/trumbowyg";
    }

    @PostMapping("/rich_text_editor")
    public String save(@ModelAttribute DemoOne demo) {
        System.out.println(demo.getDescription());
        demoOneService.save(demo);
        return "redirect:/trumbowygDemo";
    }

    @GetMapping("/findAll")
    public String findAll(Model model) {
        model.addAttribute("demos", demoOneService.findAll());
        return "trumbowyg/view";
    }
}
