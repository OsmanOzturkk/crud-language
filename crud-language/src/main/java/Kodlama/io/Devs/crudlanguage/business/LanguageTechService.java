package Kodlama.io.Devs.crudlanguage.business;

import Kodlama.io.Devs.crudlanguage.entity.LanguageTech;

import java.util.List;

public interface LanguageTechService {
    List<LanguageTech> findAll();
    LanguageTech findById(int theId);
    void save(LanguageTech languageTech);
    void update(
                LanguageTech newLanguageTech);

    void deleteById(int theId);
}
