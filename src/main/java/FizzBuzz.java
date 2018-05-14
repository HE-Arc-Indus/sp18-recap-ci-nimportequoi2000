/*
 * <pre>
 * *********************************************************************************************** *
 *  ... Auteur:                                                                                 ** *
 *  ...    ____ _          _     _   _                ____             _   _     _              ** *
 *  ...   / ___| |__  _ __(_)___| |_(_) __ _ _ __    / ___| ___  _ __ | |_| |__ (_) ___ _ __    ** *
 *  ...  | |   | '_ \| '__| / __| __| |/ _` | '_ \  | |  _ / _ \| '_ \| __| '_ \| |/ _ \ '__|   ** *
 *  ...  | |___| | | | |  | \__ \ |_| | (_| | | | | | |_| | (_) | | | | |_| | | | |  __/ |      ** *
 *  ...   \____|_| |_|_|  |_|___/\__|_|\__,_|_| |_|  \____|\___/|_| |_|\__|_| |_|_|\___|_|      ** *
 *  ...                                                                                         ** *
 * *********************************************************************************************** *
 *    ... Date: 27.3.2018
 *    ... Version: 1.0.0.0.0
 *    ... Dispense médicale: syndrome de Gilles de la Tourette
 *    ... Projet : $project.name
 *    ... Classe : $file.qualifiedClassName
 *    ... Fichier : $file.fileName
 *    ... Copyright (c) 1977-$today.year.
 * ************************************************************************************************ *
 *  Description:
 *  </pre>
 */

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FizzBuzz {

    public List<String> generateList(int length) {
        String[] myArray = new String[length];
        for(int i = 0; i<length; i++){
            myArray[i] = String.valueOf(i+1);
        }
        List<String> fbList = Arrays.asList(myArray).stream().map((String s) -> {
            int n = Integer.parseInt(s);
            if(n % 3 == 0){
                return "Fizz";
            }
            else {
                return s;
            }
        }).collect(Collectors.toList());
        return fbList;
    }


}
