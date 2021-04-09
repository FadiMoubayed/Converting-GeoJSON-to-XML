import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class nercVocabularyDictionaryJava {

    public static void main(String[] args) {

// Creating a map that contains all the variables in addition to their link in the Nerc VS collection OG1
        Map<String,String> allVariabels = new HashMap<String,String>();

        allVariabels.put("DPHDOXY", "http://vocab.nerc.ac.uk/collection/OG1/current/DPHDOXY/");
        allVariabels.put("CHLA", "http://vocab.nerc.ac.uk/collection/OG1/current/CHLA/");
        allVariabels.put("FLUOCHLA", "http://vocab.nerc.ac.uk/collection/OG1/current/FLUOCHLA/");
        allVariabels.put("CDOM", "http://vocab.nerc.ac.uk/collection/OG1/current/CDOM/");
        allVariabels.put("CNTDOXY", "http://vocab.nerc.ac.uk/collection/OG1/current/CNTDOXY/");
        allVariabels.put("TCNTDOXY", "http://vocab.nerc.ac.uk/collection/OG1/current/TCNTDOXY/");
        allVariabels.put("DEPTH", "http://vocab.nerc.ac.uk/collection/OG1/current/DEPTH/");
        allVariabels.put("DOXY", "http://vocab.nerc.ac.uk/collection/OG1/current/DOXY/");
        allVariabels.put("ED380", "http://vocab.nerc.ac.uk/collection/OG1/current/ED380/");
        allVariabels.put("ED412", "http://vocab.nerc.ac.uk/collection/OG1/current/ED443/");
        allVariabels.put("ED443", "http://vocab.nerc.ac.uk/collection/OG1/current/ED443/");
        allVariabels.put("ED490", "http://vocab.nerc.ac.uk/collection/OG1/current/ED490/");
        allVariabels.put("ED555", "http://vocab.nerc.ac.uk/collection/OG1/current/ED555/");
        allVariabels.put("ED", "http://vocab.nerc.ac.uk/collection/OG1/current/ED/");
        allVariabels.put("DPAR", "http://vocab.nerc.ac.uk/collection/OG1/current/DPAR/");
        allVariabels.put("WCUR_X", "http://vocab.nerc.ac.uk/collection/OG1/current/WCUR_X/");
        allVariabels.put("CNDC", "http://vocab.nerc.ac.uk/collection/OG1/current/CNDC/");
        allVariabels.put("CYCLEENG", "http://vocab.nerc.ac.uk/collection/OG1/current/CYCLEENG/");
        allVariabels.put("FREQDOXY", "http://vocab.nerc.ac.uk/collection/OG1/current/FREQDOXY/");
        allVariabels.put("LAT_GPS", "http://vocab.nerc.ac.uk/collection/OG1/current/LAT_GPS/");
        allVariabels.put("LON_GPS", "http://vocab.nerc.ac.uk/collection/OG1/current/LON_GPS/");
        allVariabels.put("GLCOMPH", "http://vocab.nerc.ac.uk/collection/OG1/current/GLCOMPH/");
        allVariabels.put("ALTITUDE", "http://vocab.nerc.ac.uk/collection/OG1/current/ALTITUDE/");
        allVariabels.put("LAT", "http://vocab.nerc.ac.uk/collection/OG1/current/LAT/");
        allVariabels.put("LON", "http://vocab.nerc.ac.uk/collection/OG1/current/LON/");
        allVariabels.put("WCUR_Y", "http://vocab.nerc.ac.uk/collection/OG1/current/WCUR_Y/");
        allVariabels.put("NBSAMP", "http://vocab.nerc.ac.uk/collection/OG1/current/NBSAMP/");
        allVariabels.put("LCNTDOXY", "http://vocab.nerc.ac.uk/collection/OG1/current/LCNTDOXY/");
        allVariabels.put("HEADING", "http://vocab.nerc.ac.uk/collection/OG1/current/HEADING/");
        allVariabels.put("PITCH", "http://vocab.nerc.ac.uk/collection/OG1/current/PITCH/");
        allVariabels.put("ROLL", "http://vocab.nerc.ac.uk/collection/OG1/current/ROLL/");
        allVariabels.put("MLPLDOXY", "http://vocab.nerc.ac.uk/collection/OG1/current/MLPLDOXY/");
        allVariabels.put("OXYSAT", "http://vocab.nerc.ac.uk/collection/OG1/current/OXYSAT/");
        allVariabels.put("PPOXDOXY", "http://vocab.nerc.ac.uk/collection/OG1/current/PPOXDOXY/");
        allVariabels.put("BBP470", "http://vocab.nerc.ac.uk/collection/OG1/current/BBP470/");
        allVariabels.put("BBP532", "http://vocab.nerc.ac.uk/collection/OG1/current/BBP532/");
        allVariabels.put("BBP700", "http://vocab.nerc.ac.uk/collection/OG1/current/BBP700/");

// Still needs to continue
        /*
        allVariabels.put("", "");
        allVariabels.put("", "");
        allVariabels.put("", "");
        allVariabels.put("", "");
        allVariabels.put("", "");
        allVariabels.put("", "");
        allVariabels.put("", "");
        allVariabels.put("", "");
        allVariabels.put("", "");
        allVariabels.put("", "");
        */

        allVariabels.put("PSAL", "http://vocab.nerc.ac.uk/collection/OG1/current/PSAL/");
        allVariabels.put("TEMP", " http://vocab.nerc.ac.uk/collection/OG1/current/TEMP/");

        // This is just an example of the variable names
        List<String> variableNames = new ArrayList<>();
        variableNames.add("LAT");
        variableNames.add("LON");

        // This code gets the variable names form the nerc collection (allVariabels map)
        Map<String, String> res = variableNames.stream()
                .filter(allVariabels::containsKey)
                .collect(Collectors.toMap(Function.identity(), allVariabels::get));

        System.out.println(res.toString());


        // Experimenting




    }
}
