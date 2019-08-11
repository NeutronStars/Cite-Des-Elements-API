package fr.neutronstars.sands_city.api.json;

import fr.neutronstars.sands_city.api.IElementCity;
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;

/**
 * Created by NeutronStars on 14/07/2017
 *
 */
public final class JSONReader
{
    private final String json;

    public JSONReader(String path) throws IOException
    {
        this(new File(path));
    }

    public JSONReader(File file) throws IOException
    {
        this(new InputStreamReader(new FileInputStream(file)));
    }

    public JSONReader(Reader reader) throws IOException
    {
        this(new BufferedReader(reader));
    }

    public JSONReader(BufferedReader reader) throws IOException
    {
        json = load(reader);
    }

    private String load(BufferedReader reader) throws IOException
    {
        StringBuilder builder = new StringBuilder();

        while(reader.ready()) builder.append(reader.readLine());

        reader.close();

        return builder.length() == 0 ? "[]" : builder.toString();
    }

    public static <E> List<E> toList(String path)
    {
        return toList(new File(path));
    }

    public static <E> List<E> toList(File file)
    {
        try
        {
            return toList(new InputStreamReader(new FileInputStream(file)));
        }
        catch(IOException e)
        {
            IElementCity.getSandsCity().getLogger().log(Level.SEVERE, e.getMessage(), e);
        }
        return new ArrayList<>();
    }

    public static <E> List<E> toList(Reader reader)
    {
        return toList(new BufferedReader(reader));
    }

    public static <E> List<E> toList(BufferedReader bufferedReader)
    {
        List<E> list= new ArrayList<>();

        try
        {
            JSONReader reader = new JSONReader(bufferedReader);
            JSONArray array = reader.toJSONArray();
            for(int i = 0; i < array.length(); i++)
            {
                try
                {
                    list.add((E) array.get(i));
                }catch(ClassCastException e){}
            }
        }
        catch(IOException e)
        {
            IElementCity.getSandsCity().getLogger().log(Level.SEVERE, e.getMessage(), e);
        }

        return list;
    }

    public static <V> Map<String, V> toMap(String path)
    {
        return toMap(new File(path));
    }

    public static <V> Map<String, V> toMap(File file)
    {
        try
        {
            return toMap(new InputStreamReader(new FileInputStream(file)));
        }
        catch(IOException e)
        {
            IElementCity.getSandsCity().getLogger().log(Level.SEVERE, e.getMessage(), e);
        }
        return new HashMap<>();
    }

    public static <V> Map<String, V> toMap(Reader reader)
    {
        return toMap(new BufferedReader(reader));
    }

    public static <V> Map<String, V> toMap(BufferedReader bufferedReader)
    {
        Map<String, V> map = new HashMap<>();

        try
        {
            JSONReader reader = new JSONReader(bufferedReader);
            JSONObject object = reader.toJSONObject();
            for(String key : object.keySet())
            {
                Object obj = object.get(key);
                try
                {
                    map.put(key, (V) object.get(key));
                }
                catch(ClassCastException e) {}
            }
        }
        catch(IOException e)
        {
            IElementCity.getSandsCity().getLogger().log(Level.SEVERE, e.getMessage(), e);
        }

        return map;
    }

    public JSONArray toJSONArray()
    {
        return new JSONArray(json);
    }

    public JSONObject toJSONObject()
    {
        return new JSONObject(json);
    }
}
