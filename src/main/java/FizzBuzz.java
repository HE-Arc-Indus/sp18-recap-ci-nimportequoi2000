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

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {

    public List<String> generateList(int length) {
        List<String> fbList = new ArrayList<>();
        for (int n = 1; n < length + 1; n++) {
            fbList.add(transformSingleNumber(n));
        }
        return fbList;
    }

    private String transformSingleNumber(int n) {
        String s = String.valueOf(n);
        if (n % 3 == 0 && n % 5 == 0) {
            return "FizzBuzz";
        }
        if (n % 3 == 0) {
            return "Fizz";
        }
        if (n % 5 == 0) {
            return "Buzz";
        } else {
            return s;
        }
    }


}
