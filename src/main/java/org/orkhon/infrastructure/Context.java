package org.orkhon.infrastructure;

import javafx.stage.Stage;

import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;


/**
 * Context sınıfı bizim uygulamamız boyınca yönlendirme ve veri taşıma
 * işlemlerini yapacak olan singleton olarak tasarlanmış bir sınıftır
 */
@SuppressWarnings("unchecked")
public class Context {
    private static Context instance;

    public static Context instance() {
        return instance == null ? new Context() : instance;
    }

    private static final WeakHashMap<String, Object> contextObjects = new WeakHashMap<>();
    private static Stage currentStage;

    public Map<String, ?> getContextObjects() {
        return contextObjects;
    }

    public <T> T getContextObject(String key){
        return (T) contextObjects.get(key);
    }

    public <T> T removeContextObject(String key){
        return (T) contextObjects.remove(key);
    }
    public <T> void addContextObject(String key, T value){
        contextObjects.put(key, value);
    }
    public void clearContextObjects(){
        contextObjects.clear();
    }
    public Stage getCurrentStage() {
        if (currentStage != null) {
            return currentStage;
        }
        return  new Stage();
    }
    public void setCurrentStage(Stage stage) {
        currentStage = stage;
    }
}
