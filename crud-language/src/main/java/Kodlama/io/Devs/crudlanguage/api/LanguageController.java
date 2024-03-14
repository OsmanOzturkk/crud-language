package Kodlama.io.Devs.crudlanguage.api;

import Kodlama.io.Devs.crudlanguage.business.LanguageTechService;
import Kodlama.io.Devs.crudlanguage.entity.LanguageTech;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api")
public class LanguageController {
    private LanguageTechService languageTechService;

    @PostMapping("/languages")
    public void save(@RequestBody LanguageTech languageTech) {
        languageTechService.save(languageTech);
    }

    @GetMapping("/languages")
    public List<LanguageTech> findAll() {
      return languageTechService.findAll();
    }

    @GetMapping("/languages/{theId}")
    public LanguageTech languageTech(@PathVariable int theId) {
       return languageTechService.findById(theId);
    }

    @PutMapping("/languages")
    public void update(@RequestBody
                       LanguageTech newLanguageTech) {

        languageTechService.update(newLanguageTech);
    }

    @DeleteMapping("/languages/{theId}")
    public void deleteById(@PathVariable int theId) {
        languageTechService.deleteById(theId);
    }

}
