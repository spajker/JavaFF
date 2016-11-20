package io.github.rhkiswani.jutils.locale;

public class LocaleUtil {

    private LocaleUtil(){

    }

    public static String getString(String key, Object... params){
        return LocaleWorkersManager.instance().getString(key, params);
    }
}