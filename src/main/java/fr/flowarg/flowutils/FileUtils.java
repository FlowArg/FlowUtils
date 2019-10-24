package fr.flowarg.flowutils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author FlowArg
 * @since 0.1.3
 */
public class FileUtils
{
    public static void createFile(File file) throws IOException
    {
        if (!file.exists())
        {
            file.getParentFile().mkdirs();
            file.createNewFile();
        }
    }

    public static void saveFile(File file, String text)
    {
        FileWriter fw;

        try{
            createFile(file);
            fw = new FileWriter(file);
            fw.write(text);
            fw.flush();
            fw.close();
        }catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    public static String loadFile(File file)
    {
        if (file.exists())
        {
            try
            {
                BufferedReader reader = new BufferedReader(new FileReader(file));
                StringBuilder text = new StringBuilder();

                String line;

                while ((line = reader.readLine()) != null)
                {
                    text.append(line);
                }
                reader.close();

                return text.toString();
            } catch (IOException e)
            {
                e.printStackTrace();
            }
        }

        return "";
    }
}
