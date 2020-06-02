package at.tugraz.sw20asd.lang.ui;


import at.tugraz.sw20asd.lang.dto.VocabularyBaseDto;
import at.tugraz.sw20asd.lang.dto.VocabularyDetailDto;

import java.util.Collection;
import java.util.List;

public interface VocabularyAccess {

    Integer addVocabulary(VocabularyDetailDto vocabulary);

    void deleteVocabulary(long id);

    VocabularyDetailDto getVocabulary(long id);

    List<VocabularyDetailDto> getVocabularyList(List<Long> ids);

    List<VocabularyBaseDto> getAllVocabularies();
}
