package Kodlama.io.Devs.crudlanguage.business;

import Kodlama.io.Devs.crudlanguage.DAO.LanguageDAO;
import Kodlama.io.Devs.crudlanguage.DAO.LanguageDAOImpl;
import Kodlama.io.Devs.crudlanguage.entity.LanguageTech;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor
public class LanguageTechManager implements LanguageTechService {
    private LanguageDAO languageDAO;
    @Override
    public List<LanguageTech> findAll() {
        return languageDAO.findAll();
    }

    @Override
    public LanguageTech findById(int theId) {
        return languageDAO.findById(theId);
    }

    @Override
    public void save(LanguageTech languageTech) {
        if (findLanguage(languageTech.getName())) {
            throw new RuntimeException("!!! Bu dil dosyada mevcuttur !!!");
        }else if (languageTech.getName().isBlank()){
            throw new RuntimeException("!!! Programlama dili boş bırakılamaz !!!");
        }
        languageDAO.save(languageTech);
    }

    @Override
    public void update( LanguageTech newLanguageTech) {
        languageDAO.update(newLanguageTech);
    }

    @Override
    public void deleteById(int theId) {
        languageDAO.deleteById(theId);
    }

    private boolean findLanguage(String languageName) {
        for (var language : languageDAO.findAll()) {
            if (language.getName().equals(languageName)) {
                return true;
            }
        }
        return false;
    }
}
