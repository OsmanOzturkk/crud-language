package Kodlama.io.Devs.crudlanguage.DAO;

import Kodlama.io.Devs.crudlanguage.entity.LanguageTech;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class LanguageDAOImpl implements LanguageDAO {

    private List<LanguageTech> listLanguages;
    @Autowired
    public LanguageDAOImpl() {
        this.listLanguages = new ArrayList<>();
    }
    @Override
    public List<LanguageTech> findAll() {
        return listLanguages;
    }

    @Override
    public LanguageTech findById(int theId) {
        return listLanguages.get(theId);
    }

    @Override
    public void save(LanguageTech languageTech) {
        listLanguages.add(languageTech);
    }

    @Override
    public void update(LanguageTech newLanguageTech) {
        listLanguages.set(newLanguageTech.getId(),newLanguageTech );
    }

    @Override
    public void deleteById(int theId) {
        listLanguages.remove(theId);
    }
}
