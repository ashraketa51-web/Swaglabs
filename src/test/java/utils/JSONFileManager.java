package utils;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.LinkedHashMap;

public class JSONFileManager {
    LinkedHashMap<String,Object> DATA;
    public JSONFileManager(String filepath){
        try {

            DATA=new Gson().fromJson(new FileReader(filepath), new TypeToken<LinkedHashMap<String,Object>>(){}.getType());
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
    public Object getValue(String Key){
        return DATA.get(Key);
    }
}
