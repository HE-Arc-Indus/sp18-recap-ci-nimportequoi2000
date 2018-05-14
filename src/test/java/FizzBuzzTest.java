import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;
import org.junit.Test;

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
public class FizzBuzzTest {

    @Test
    public void testListSize(){
        // Arrange
        FizzBuzz fb = new FizzBuzz();
        List<String> expected = Arrays.asList(null,null,null);
        // Act
        List<String> actual = fb.generateList(3);
        // Assert
        assertThat(actual, is(expected));
    }


}