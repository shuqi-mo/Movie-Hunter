package online.util;

import online.model.Embedding;

public class Utility {
    public static Embedding parseEmbStr(String embStr){
        String[] embStrings = embStr.split("\\s");
        Embedding emb = new Embedding();
        for(String element : embStrings) {
            emb.addDim(Float.parseFloat(element));
        }
        return emb;
    }
}
