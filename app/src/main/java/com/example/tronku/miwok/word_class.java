package com.example.tronku.miwok;

import java.util.ArrayList;

/**
 * Created by tronku on 26/3/18.
 */

public class word_class {
    private String mdef_word;
    private String mtranslate;
    public word_class(String def_word, String translate)
    {
        mdef_word = def_word;
        mtranslate = translate;
    }

    public String getdef()
    {
        return mdef_word;
    }

    public String gettrans()
    {
        return mtranslate;
    }
}
