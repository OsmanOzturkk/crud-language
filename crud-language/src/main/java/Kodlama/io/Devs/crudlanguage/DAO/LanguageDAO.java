package Kodlama.io.Devs.crudlanguage.DAO;

import Kodlama.io.Devs.crudlanguage.entity.LanguageTech;

import java.util.List;

public interface LanguageDAO {
    List<LanguageTech> findAll();
    LanguageTech findById(int theId);
    void save(LanguageTech languageTech);
    void update(
                LanguageTech newLanguageTech);

    void deleteById(int theId);

}
